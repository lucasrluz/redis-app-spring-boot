package com.redisappspringboot;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_tb")
public class ProductEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID productId;

	@Column(nullable = false)
	private String name;

	public ProductEntity() {}

	public ProductEntity(String name) {
		this.name = name;
	}

	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product {productId: " + this.productId.toString() + ", name: " + this.name + "}";
	}
}
