package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class LocalProductRepository implements ProductRepository {

	@Override
	public List<Product> getProducts() {
		// System.out.println("MongoDBRepository.getProducts()");
		List<Product> products = new ArrayList<>();

		Product product = new Product();
		product.setProductId("P01");
		product.setProductName("Angular");

		products.add(product);

		Product product1 = new Product();
		product1.setProductId("P02");
		product1.setProductName("Node");
		products.add(product1);

		return products;
	}

}
