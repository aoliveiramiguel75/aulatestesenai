package com.senaivendas.dsvendas.dto;

import com.senaivendas.dsvendas.entities.vendedor;

public class SaleDto {
	private Long id;
	private Integer Numvendas;
	private Double totalvendas;
	private Double ticket;
	private Double comissao;
	
	private SellerDto seller;
	
	public SaleDto() {
		
	}

	public SaleDto(Long id, Integer numvendas, Double totalvendas, Double ticket, Double comissao, SellerDto seller) {
		
		this.id = id;
		Numvendas = numvendas;
		this.totalvendas = totalvendas;
		this.ticket = ticket;
		this.comissao = comissao;
		this.seller = seller;
	}
	
	public SaleDto(vendedor entity) {
		
		id = entity.getId();
		Numvendas = entity.getNumvendas();
		totalvendas = entity.getTotalvendas();
		ticket = entity.getTicket();
		comissao = entity.getComissao();
		seller = new SellerDto(entity.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumvendas() {
		return Numvendas;
	}

	public void setNumvendas(Integer numvendas) {
		Numvendas = numvendas;
	}

	public Double getTotalvendas() {
		return totalvendas;
	}

	public void setTotalvendas(Double totalvendas) {
		this.totalvendas = totalvendas;
	}

	public Double getTicket() {
		return ticket;
	}

	public void setTicket(Double ticket) {
		this.ticket = ticket;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public SellerDto getSeller() {
		return seller;
	}

	public void setSeller(SellerDto seller) {
		this.seller = seller;
	}
	
	
}
