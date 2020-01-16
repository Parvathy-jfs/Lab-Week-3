package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class CloudProductRepository implements ProductRepository {

	@Override
	public List<Product> getProducts() {
		// System.out.println("MongoDBRepository.getProducts()");
		List<Product> products = new ArrayList<>();

		Product product = new Product();
		product.setProductId("P01");
		product.setProductName("Spring");

		products.add(product);

		Product product1 = new Product();
		product1.setProductId("P02");
		product1.setProductName("Hibernate");
		products.add(product1);

		return products;
	}

}
