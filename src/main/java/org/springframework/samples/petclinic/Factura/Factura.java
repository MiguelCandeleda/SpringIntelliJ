package org.springframework.samples.petclinic.Factura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.style.ToStringCreator;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.model.Person;
import org.springframework.util.Assert;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;

/*public class Factura {

	private String userName;
		public Object getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}


}*/


import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.core.style.ToStringCreator;
import org.springframework.samples.petclinic.model.Person;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.Visit;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "facture")
public class Factura extends BaseEntity {

	@Column(name = "idFactura")
	@NotEmpty
	private Integer idFactura;

	@Column(name = "Owner_id")
	@NotEmpty
	private String ownerId;

	@Column(name = "motivo")
	@NotEmpty
	private String motivo;

	@Column(name = "precio")
	@NotEmpty
	private Float precio;

	/*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "owner_id")
	@OrderBy("name")
	private List<Pet> pets = new ArrayList<>();*/

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	/*public void addPet(Pet pet) {
		if (pet.isNew()) {
			getPets().add(pet);
		}
	}*/

/*//	Método añadir factura
	public void addFacture(Factura factura){
		if(factura.isNew()){
			getIdFactura().add(factura);
		}
	}*/

	/**
	 * Return the Pet with the given name, or null if none found for this Owner.
	 * @param name to test
	 * @return a pet if pet name is already in use
	 */


	@Override
	public String toString() {
		return new ToStringCreator(this).append("idFactura", this.getIdFactura()).append("new", this.isNew())
			.append("owner_id", this.getOwnerId()).append("motivo", this.getMotivo())
			.append("precio", this.precio).toString();
	}

	/**
	 * Adds the given {@link Visit} to the {@link Pet} with the given identifier.
	 * @param petId the identifier of the {@link Pet}, must not be {@literal null}.
	 * @param visit the visit to add, must not be {@literal null}.
	 */
		public Factura addVisit(Integer idFactura, String owner_id ) {

		Assert.notNull(idFactura, "El identificador de la factura no puede ser nulo.");
		Assert.notNull(owner_id, "El identificador del propietario no puede ser nulo");


		return this;
	}

}
