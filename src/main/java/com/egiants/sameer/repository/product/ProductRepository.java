package com.egiants.sameer.repository.product;

import org.springframework.data.repository.CrudRepository;

import com.egiants.sameer.entity.product.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	//
}
