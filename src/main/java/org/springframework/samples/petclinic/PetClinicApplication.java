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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.samples.petclinic.vet.SpecialityRepository;
import org.springframework.samples.petclinic.vet.Specialty;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.VetRepository;


/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
	/** 1.Crear un objeto Vet sin Speciality
	* 2.Persistir el objeto Vet en BBDD
	* 3.Consultar por ID y comprobar que se ha creado correctamente
	* 4.Editar el elemento recién creado para añadir una Speciality concreta
	* 5.Listar todos los veterinarios existentes
	 *
	 A * vetsRepository crear estos métodos y usarlos desde cualquier parte del código
	 * 1 Obtener una lista de Vets filtrando por lastName
	 * 2 Obtener una lista de Vets filtrando por firstName y lastName
	 * 3 Obtener una lista de Vets buscando en firstName o lastName

	 B Organizar el código para que esté en base a servicios y no sea llamadas directas a dao

	 C repository crear estos métodos y usarlos en cualquier parte del código
	 4 Obtener las mascotas nacidas en 2010 ordenadas por fecha de nacimiento ascendente.
	 5 Crear 3 visitas nuevas para diferentes mascotas
	 6 Obtener todas las visitas para una mascota. 
	 7 Obtener las 4 visitas más recientes de todo el sistema.

	 Crear una página con detalle de factura. Vale solo con un detalle.
	 */

@SpringBootApplication
@ImportRuntimeHints(PetClinicRuntimeHints.class)
public class PetClinicApplication {

	public static void main(String[] args)
	{

		//LLamamos a todas las anotaciones @
		SpringApplication.run(PetClinicApplication.class, args);
	}
@Bean
	public CommandLineRunner demoVetRepository(VetRepository vetRepository, SpecialityRepository specialtyRepository){
		return (args) -> {
			System.out.println("Creamos un objeto Vet");
			Vet vet = new Vet();
			vet.setFirstName("Miguel");
			vet.setLastName("Acosta");

			System.out.println("Persistimos en la BBDD");
			vetRepository.save(vet);

			System.out.println("Comprobamos que se ha creado correctamente");
			Vet vetAux = vetRepository.findById(vet.getId());
			System.out.println("El veterinario introducido es:" + vetRepository.findById(vet.getId()));

			System.out.println("Editamos el objeto y añadimos una especialidad: ");
			Specialty especialidad = specialtyRepository.findById(1);
			vet.addSpecialty(especialidad);
			vetRepository.save(vet);
			System.out.println(vet.toString());

			System.out.println("Listamos todos los veterinarios: ");
			for (Vet v : vetRepository.findAll()){
				System.out.println("Veterinario = " + v);
			}




		};
}



}
