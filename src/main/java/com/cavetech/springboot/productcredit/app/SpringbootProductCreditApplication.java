package com.cavetech.springboot.productcredit.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import com.cavetech.springboot.productcredit.app.domain.ProductCredit;
import com.cavetech.springboot.productcredit.app.domain.TypeProductCredit;
import com.cavetech.springboot.productcredit.app.repository.ProductCreditRepository;
import com.cavetech.springboot.productcredit.app.repository.TypeCreditRepository;

import reactor.core.publisher.Flux;



@EnableEurekaClient
@SpringBootApplication
public class SpringbootProductCreditApplication  implements CommandLineRunner{

	
	
	@Autowired
	private ProductCreditRepository productbank;

	@Autowired
	private TypeCreditRepository typeprodcredt;
	
	@Autowired
	private ReactiveMongoTemplate template;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootProductCreditApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.dropCollection(ProductCredit.class).subscribe();
		template.dropCollection(TypeProductCredit.class).subscribe();
	
		
		TypeProductCredit type = new TypeProductCredit();
		
	
		type.setDescription("Credito");
		
		
		
		
		Flux.just(type)
		.flatMap(tipP -> typeprodcredt.save(tipP))
		.thenMany(	
				Flux.just(new ProductCredit("Cuenta de credito personal" ,2.50,  type),
						  new ProductCredit("Cuenta de credito empresarial" ,2.00,  type),
						  new ProductCredit("Cuents d creditos " ,0.00,  type) ,
						  new ProductCredit("Cuents d creditos " ,0.00,  type) 
					)	
				).flatMap(pro -> productbank.save(pro))
		.subscribe(res -> System.out.println("Producto".concat(res.toString().concat(" " + "Registrado"))));
		
		
		
		
	}

}
