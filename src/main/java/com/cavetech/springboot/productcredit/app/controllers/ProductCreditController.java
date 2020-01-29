package com.cavetech.springboot.productcredit.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cavetech.springboot.productcredit.app.domain.ProductCredit;
import com.cavetech.springboot.productcredit.app.service.ProductCreditService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequestMapping("productcredt")
@RestController
public class ProductCreditController {
	
	@Autowired
	private  ProductCreditService prodcredtserv;

	@GetMapping("/list")
	public Flux<ProductCredit> findAll() {
		return prodcredtserv.findAll();
	}

	@GetMapping("/{id}")
	public Mono<ProductCredit> finById(@PathVariable String id) {
		return prodcredtserv.findById(id);
	}

	@PostMapping
	public Mono<ProductCredit> save(@RequestBody ProductCredit prodbank) {
		return prodcredtserv.save(prodbank);
	}

	@PutMapping
	public Mono<ProductCredit> update(@RequestBody ProductCredit prodbank) {
		return prodcredtserv.save(prodbank);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> eliminarProducto(@PathVariable String id){
		return prodcredtserv.deletexId(id);
	}

}
