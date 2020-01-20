package com.cavetech.springboot.productcredit.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


import com.cavetech.springboot.productcredit.app.domain.TypeProductCredit;


public interface TypeCreditRepository  extends ReactiveMongoRepository<TypeProductCredit, String>{

}
