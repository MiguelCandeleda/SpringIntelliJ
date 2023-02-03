package org.springframework.samples.petclinic.vet;

public interface SpecialityRepository {
	Specialty findById(Integer i);
}
