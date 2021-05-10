package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SellerDto implements Serializable {

	private static final long serialVersionUID = 7998995537358667641L;

	private Long id;
	private String name;

	public SellerDto() {

	}

	public SellerDto(Long id, String nome) {
		this.id = id;
		this.name = nome;
	}

	public SellerDto(Seller entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

}
