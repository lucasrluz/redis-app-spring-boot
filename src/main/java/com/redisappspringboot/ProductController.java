package com.redisappspringboot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/product")
	public ProductEntity save(@RequestBody String name) {
		return this.productService.save(name);
	}

	@GetMapping("/product")
	public List<ProductEntity> get() {
		return this.productService.get();
	}
}
