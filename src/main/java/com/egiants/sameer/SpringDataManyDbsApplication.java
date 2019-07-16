package com.egiants.sameer;

import javax.annotation.PostConstruct;

import com.egiants.sameer.repository.product.ProductRepository;
import com.egiants.sameer.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.egiants.sameer.entity.product.Product;
import com.egiants.sameer.entity.user.User;

@SpringBootApplication
public class SpringDataManyDbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataManyDbsApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostConstruct
	void init () {
		
		User chickCorea = new User("Chick", "Corea");
		userRepository.save(chickCorea);
		
		Product cleanCode = new Product("Mad Hatter", 19);
		productRepository.save(cleanCode);
		
		
	}
	
}
