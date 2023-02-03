package org.springframework.samples.petclinic.vet;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vet_specialties")
public class Vet_Specialties {

	@Id
	private Integer id;
}
