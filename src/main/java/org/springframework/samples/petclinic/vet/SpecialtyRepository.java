package org.springframework.samples.petclinic.vet;

import org.springframework.data.repository.query.Param;

public interface SpecialtyRepository {

	Specialty findById(@Param("id") Integer id);
}
