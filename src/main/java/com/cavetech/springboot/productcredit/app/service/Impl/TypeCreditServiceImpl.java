package com.cavetech.springboot.productcredit.app.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cavetech.springboot.productcredit.app.domain.TypeProductCredit;
import com.cavetech.springboot.productcredit.app.repository.TypeCreditRepository;
import com.cavetech.springboot.productcredit.app.service.TypeCreditService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class TypeCreditServiceImpl implements TypeCreditService{

	
	@Autowired
	TypeCreditRepository typeProductRepo;

	@Override
	public Mono<TypeProductCredit> save(TypeProductCredit typeProductCredit) {
		return typeProductRepo.save(typeProductCredit);
	}

	@Override
	public Flux<TypeProductCredit> findAll() {
		return typeProductRepo.findAll();
	}

	@Override
	public Mono<TypeProductCredit> findById(String id) {
		return typeProductRepo.findById(id) ;
	}

	@Override
	public Mono<Void> deletexId(String id) {
	return typeProductRepo.deleteById(id);
	}

	@Override
	public Mono<Void> delete(TypeProductCredit typeProductCredit) {
		return typeProductRepo.delete(typeProductCredit);
	}
	


}
