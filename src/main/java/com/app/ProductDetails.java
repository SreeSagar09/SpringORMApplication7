package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDetails {
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> getProductDetailsByProductId(Integer productId){
		List<Product> productList = productDAO.findByProductId(productId);
		
		return productList;
	}
	
	public List<Product> getProductDetailsByProductName(String productName){
		List<Product> productList = productDAO.findByProductName(productName);
		
		return productList;
	}
	
	public List<Product> getProductDetailsByProductCodeAndProductName(String productCode, String productName){
		List<Product> productList = productDAO.findByProductCodeAndProductName(productCode, productName);
		
		return productList;
	}
	
	public List<Object[]> getProductcodeAndNameByProductId(Integer productId){
		List<Object[]> productCodeAndNameArrayList = productDAO.findProductCodeAndProductNameByProductId(productId);
		
		return productCodeAndNameArrayList;
	}
}

