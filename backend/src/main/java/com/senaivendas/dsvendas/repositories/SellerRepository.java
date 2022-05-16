package com.senaivendas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaivendas.dsvendas.entities.vendedor;

public interface SellerRepository extends JpaRepository<vendedor, Long> {

}
