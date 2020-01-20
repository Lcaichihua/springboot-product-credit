package com.cavetech.springboot.productcredit.app.service;

import com.cavetech.springboot.productcredit.app.domain.ProductCredit;
import com.cavetech.springboot.productcredit.app.domain.TypeProductCredit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TypeCreditService {

	
	Mono<TypeProductCredit> save(TypeProductCredit typeProductCredit);
	


	Flux<TypeProductCredit> findAll();

	Mono<TypeProductCredit> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(TypeProductCredit typeProductCredit);
}
