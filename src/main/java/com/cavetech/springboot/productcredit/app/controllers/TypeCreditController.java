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

import com.cavetech.springboot.productcredit.app.domain.TypeProductCredit;
import com.cavetech.springboot.productcredit.app.service.TypeCreditService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RequestMapping("typecred")
@RestController
public class TypeCreditController {
	
	@Autowired
	private  TypeCreditService typeCreditService;

	@GetMapping("/list")
	public Flux<TypeProductCredit> findAll() {
		return typeCreditService.findAll();
	}

	@GetMapping("/{id}")
	public Mono<TypeProductCredit> finById(@PathVariable String id) {
		return typeCreditService.findById(id);
	}

	@PostMapping
	public Mono<TypeProductCredit> save(@RequestBody TypeProductCredit typecredt) {
		return typeCreditService.save(typecredt);
	}

	@PutMapping
	public Mono<TypeProductCredit> update(@RequestBody TypeProductCredit typecredt) {
		return typeCreditService.save(typecredt);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> eliminarProducto(@PathVariable String id){
		return typeCreditService.deletexId(id);
	}

}
