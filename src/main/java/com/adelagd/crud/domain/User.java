package com.adelagd.crud.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table (name="User")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="idUser")
	private Long idUser;
	
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idUser")
	@IndexColumn(name="idx")
	private List<Person> agenda;*/

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	/*public List<Person> getAgenda() {
		return agenda;
	}

	public void setAgenda(List<Person> agenda) {
		this.agenda = agenda;
	}*/
	
	
	
	
	

}
