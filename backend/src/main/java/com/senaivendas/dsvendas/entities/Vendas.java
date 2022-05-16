package com.senaivendas.dsvendas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="tb_sales" )

public class Vendas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer Numvendas;
	private Double totalvendas;
	private Double ticket;
	private Double comissao;
	
	@ManyToOne
	@JoinColumn(name = "Vendedor_id")
	private Vendas vendas;
	
	public Vendas() {
	}

	public Vendas(Long id, Integer numvendas, Double totalvendas, Double ticket, Double comissao, Vendas vendas) {
		
		this.id = id;
		Numvendas = numvendas;
		this.totalvendas = totalvendas;
		this.ticket = ticket;
		this.comissao = comissao;
		this.vendas = vendas;
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

	public Vendas getVendas() {
		return vendas;
	}

	public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}
	
	
}
