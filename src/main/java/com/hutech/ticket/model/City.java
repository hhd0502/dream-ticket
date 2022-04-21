package com.hutech.ticket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(length = 50, nullable = false, unique = true)
	private String name;
	
	public City() {}

	
	public City(Long id, String name) {
		super();
		this.Id = id;
		this.name = name;
	}
	
	public City(String name) {
		super();
		this.name = name;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
}
