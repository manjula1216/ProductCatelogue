package com.example.ProductCatelogue.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProductCatelogue.entity.ProductCatelogEntity;

@Repository
public interface ProductCatelogueRepoInterface extends JpaRepository<ProductCatelogEntity, Integer>{

	

	
}
