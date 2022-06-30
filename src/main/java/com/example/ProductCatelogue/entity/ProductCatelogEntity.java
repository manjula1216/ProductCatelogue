package com.example.ProductCatelogue.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProductCatelogEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int proId;
	private String proName;
	private int proPrice;
	
	public ProductCatelogEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	@Override
	public String toString() {
		return "ProductCatelogEntity [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}

}
