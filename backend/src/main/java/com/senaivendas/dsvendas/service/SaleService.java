package com.senaivendas.dsvendas.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.senaivendas.dsvendas.dto.SaleDto;
import com.senaivendas.dsvendas.entities.Vendas;
import com.senaivendas.dsvendas.repositories.SaleRepository;

@Service
public class SaleService {
	
		@Autowired
		private SaleRepository repository;
		
		public Page<SaleDto> findAll(Pageable pageable){	
			Page<Vendas> result =  repository.findAll(pageable);
			return result.map(x -> new SaleDto(x));
		}
}
