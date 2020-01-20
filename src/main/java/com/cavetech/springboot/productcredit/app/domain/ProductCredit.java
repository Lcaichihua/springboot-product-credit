package com.cavetech.springboot.productcredit.app.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "productCredit")
public  @Data  class ProductCredit {

	private String id;
	private String description;
	private double interes;
	private TypeProductCredit typeProductCredit;
	
	
	



	public ProductCredit(String description, double interes, TypeProductCredit typeProductCredit) {
		super();
		this.description = description;
		this.interes = interes;
		this.typeProductCredit = typeProductCredit;
	}
	
	
}
