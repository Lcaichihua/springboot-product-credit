package com.cavetech.springboot.productcredit.app.service;



import com.cavetech.springboot.productcredit.app.domain.ProductCredit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductCreditService {

	
	Mono<ProductCredit> save(ProductCredit productCredit);



	Flux<ProductCredit> findAll();

	Mono<ProductCredit> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(ProductCredit productCredit);
}
