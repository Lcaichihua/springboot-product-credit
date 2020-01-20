package com.cavetech.springboot.productcredit.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


import com.cavetech.springboot.productcredit.app.domain.ProductCredit;


public interface ProductCreditRepository extends ReactiveMongoRepository<ProductCredit, String>{

}
