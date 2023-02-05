/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.samples.petclinic.vet.Specialty;
import org.springframework.samples.petclinic.vet.SpecialtyRepository;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.VetRepository;


/**
 * PetClinic Spring Boot Application.
 * Declaramos una clase PetClinicApplication que hará de dispatcher servlet para realizar las peticiones al servidor por medio
 * del protocolo http y así generar el contenido
 *
 */
@SpringBootApplication
@ImportRuntimeHints(PetClinicRuntimeHints.class)
public class PetClinicApplication extends SpringBootServletInitializer {

	public static void main(String[] args)
	{

		SpringApplication.run(PetClinicApplication.class, args);
	}

	// SpecialtyRepository specialtyRepository
	/*@Bean
	public CommandLineRunner demoVetRepository(VetRepository vetRepository) {
		return (args) -> {
			System.out.println("Creamos un objeto Vet");
			Vet vet = new Vet();
			vet.setFirstName("Miguel");
			vet.setLastName("Acosta");

			System.out.println("Persistimos en la BBDD");
			vetRepository.save(vet);

			System.out.println("Comprobamos que se ha creado correctamente");
			Vet vetAux = vetRepository.findById(vet.getId());
			System.out.println("El veterinario introducido es:" + vetRepository.findById(vetAux.getId()));

			*//*System.out.println("Editamos el objeto y añadimos una especialidad: ");
			Specialty especialidad = specialtyRepository.findById(1);
			vet.addSpecialty(especialidad);
			vetRepository.save(vet);
			System.out.println(vet.toString());
*//*

			System.out.println("Listamos todos los veterinarios: ");
			for (Vet v : vetRepository.findAll()) {
				System.out.println("Veterinario = " + v);
			}

			System.out.println("Listamos veterinarios por nombre y apellido: ");
			for (Vet v : vetRepository.findAll()) {
				System.out.println("Veterinario = " + v.getFirstName() + "Apellido: "+ v.getLastName());
			}

    *//*  System.out.println("Listamos veterinarios por nombre y apellido: ");
      for (Vet v : vetRepository.findByLastName() ) {
        System.out.println("Veterinario = " + v.getFirstName() + "Apellido: "+ v.getLastName());
      }*//*


		};
	}
*/

}




