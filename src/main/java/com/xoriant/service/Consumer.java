package com.xoriant.service;

import com.xoriant.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@Autowired
    private ProductRepository repository;

	

	@JmsListener(destination = "myQueue")
	private void readData(String message) {

		repository.findAll();	
		
		//productRepository.save(new ProductRepo());
		System.out.println("Data::::"+message);
	}
}
