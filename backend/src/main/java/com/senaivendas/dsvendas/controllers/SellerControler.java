package com.senaivendas.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaivendas.dsvendas.dto.SellerDto;
import com.senaivendas.dsvendas.service.SellerService;

@RestController
@RequestMapping(value = "/sellers" )
public class SellerControler {
	
	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDto>> findAll(){
		List<SellerDto> list = service.findAll();
		return ResponseEntity.ok(list);
	}

}
