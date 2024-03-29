package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDto implements Serializable {

	private static final long serialVersionUID = 724295985510622059L;

	private String sellerName;
	private Long visited;
	private Long deals;

	public SaleSuccessDto(Seller seller, Long visited, Long deals) {
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public SaleSuccessDto() {

	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
