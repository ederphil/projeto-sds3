package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDto;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	public List<SellerDto> findAll() {

		List<Seller> result = sellerRepository.findAll();

		return result.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());

	}
}
