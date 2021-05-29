package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDto;
import com.devsuperior.dsvendas.dto.SaleSumDto;
import com.devsuperior.dsvendas.dto.SaleSuccessDto;
import com.devsuperior.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;

	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable e) {

		return ResponseEntity.ok(saleService.findAll(e));

	}

	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller() {

		List<SaleSumDto> list = saleService.amountGroupedBySeller();
		return ResponseEntity.ok(list);

	}

	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDto>> successGroupedBySeller() {

		List<SaleSuccessDto> list = saleService.successGroupedBySeller();
		return ResponseEntity.ok(list);

	}

}
