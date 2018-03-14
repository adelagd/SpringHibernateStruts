package com.adelagd.crud.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="Person")
public class Person implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="idPerson")
	private Long idPerson;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Apellidos")
	private String apellidos;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="idPerson")
    @IndexColumn(name="idx")
	private List<Address> addresses;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idPerson")
	@IndexColumn(name="idx")
	private List<Email> emails;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idPerson")
	@IndexColumn(name="idx")
	private List<Phone> phones;
	
	/*@ManyToOne
	@JoinColumn(name="idUser")
	private User user;*/

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/
	
	

}
