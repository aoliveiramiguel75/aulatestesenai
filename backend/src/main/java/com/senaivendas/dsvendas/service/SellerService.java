package com.senaivendas.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaivendas.dsvendas.dto.SellerDto;
import com.senaivendas.dsvendas.entities.vendedor;
import com.senaivendas.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
		@Autowired
		private SellerRepository repository;
		
		public List<SellerDto> findAll(){	
			List<vendedor> result =  repository.findAll();
			return result.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());
		}
}
