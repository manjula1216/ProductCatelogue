package com.example.ProductCatelogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductCatelogue.entity.ProductCatelogEntity;
import com.example.ProductCatelogue.repository.ProductCatelogueRepoInterface;

@Service
public class ProductCatService {
	
	private static final Integer Long = null;
	@Autowired
	public ProductCatelogueRepoInterface productCatelogueRepoInterface;

	public List<ProductCatelogEntity> saveResource(List<ProductCatelogEntity> productCatelogEntity) {
		
		return productCatelogueRepoInterface.saveAll(productCatelogEntity);
	}

	public List<ProductCatelogEntity> getResource() {
		
		return productCatelogueRepoInterface.findAll();
	}

	

	public void delResource(Integer proId) {
		
		productCatelogueRepoInterface.deleteById(proId);
	}

	
	public ProductCatelogEntity getProduct(Integer proId) {
		
		return productCatelogueRepoInterface.findById(proId).get();
	}

	

	
	

}
