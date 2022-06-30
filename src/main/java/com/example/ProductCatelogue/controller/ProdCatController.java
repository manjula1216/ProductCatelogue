package com.example.ProductCatelogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductCatelogue.entity.ProductCatelogEntity;
import com.example.ProductCatelogue.service.ProductCatService;



@RestController
@RequestMapping("/prod")
public class ProdCatController {
	
	@Autowired
	public ProductCatService productCatService;
	
	@PostMapping("/save")
		public List<ProductCatelogEntity> productCatelogEntity(@RequestBody @Validated List<ProductCatelogEntity> productCatelogEntity){
		return productCatService.saveResource(productCatelogEntity);
	}
	
	@GetMapping("/get")
	public List<ProductCatelogEntity> getResource(){
		return productCatService.getResource();
	}
	
	@DeleteMapping(value = "get/delete/{id}")
	public String delResource(@PathVariable("id") int proId){
		productCatService.delResource(proId);
		return "deleted prod sucessfully";
	}
		
	@GetMapping("/get/{id}")
	public ProductCatelogEntity getProduct(@PathVariable("id") int proId) {
		return productCatService.getProduct(proId);
	}
		
	}




