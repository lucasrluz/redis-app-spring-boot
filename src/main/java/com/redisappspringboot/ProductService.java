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

	@CacheEvict(value = "products", key = "#userId")
	public ProductEntity save(String name, String userId) {
		System.out.println("Cache Limpo");
		ProductEntity productEntity = new ProductEntity(name);

		ProductEntity saveProductEntity = this.productRepository.save(productEntity);

		return saveProductEntity;
	}

	@Cacheable(value = "products", key = "#userId")
	public List<ProductEntity> get(String userId) {
		System.out.println("Sem cache");
		return this.productRepository.findAll();
	}
}
