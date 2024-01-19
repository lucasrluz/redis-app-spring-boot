package com.redisappspringboot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/product/{userId}")
	public ProductEntity save(@RequestBody String name, @PathVariable String userId) {
		return this.productService.save(name, userId);
	}

	@GetMapping("/product/{userId}")
	public List<ProductEntity> get(@PathVariable String userId) {
		return this.productService.get(userId);
	}
}
