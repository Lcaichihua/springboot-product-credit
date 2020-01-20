package com.cavetech.springboot.productcredit.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "typeProductCredit")
public @Data class TypeProductCredit {
	@Id
	private String id;
	private String description;
	public TypeProductCredit(String description) {
		super();
		this.description = description;
	}
	

}
