package com.redisappspringboot;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@EnableCaching
public class ProductService {
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@CacheEvict("product")
	public ProductEntity save(String name) {
		System.out.println("Cache Limpo");
		ProductEntity productEntity = new ProductEntity(name);

		ProductEntity saveProductEntity = this.productRepository.save(productEntity);

		return saveProductEntity;
	}

	@Cacheable("product")
	public List<ProductEntity> get() {
		System.out.println("Sem cache");
		return this.productRepository.findAll();
	}
}
