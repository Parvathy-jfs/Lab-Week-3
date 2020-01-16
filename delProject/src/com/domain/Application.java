package com.domain;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

public class Application {
	public static void main(String[] args) {
	ProductRepository productRepository = null;  // because interface maybe referenced, but not initiated.
	
	//TRADITIONAL HARD CODED INSTANCES
	//productRepository = new LocalProductRepository();
	//productRepository = new com.domain.repository.LocalProductRepository();
	//productRepository = new CloudProductRepository();
	
	//USING SPRING FRAMEWORK
	//Creating the IOC Container and configuring the spring beans
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	productRepository = applicationContext.getBean("productRepositoryLocal",ProductRepository.class);
	List <Product> products = productRepository.getProducts();
	System.out.println(products);
	
	productRepository = applicationContext.getBean("productRepositoryCloud",ProductRepository.class);
	products = productRepository.getProducts();
	System.out.println(products);
	}
}
