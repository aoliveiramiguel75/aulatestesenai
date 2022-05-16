package com.senaivendas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaivendas.dsvendas.entities.Vendas;

public interface SaleRepository extends JpaRepository<Vendas, Long> {

}
