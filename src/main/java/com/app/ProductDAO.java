package com.app;

import java.util.List;

public interface ProductDAO {
	
	public List<Product> findByProductId(Integer productId);
	
	public List<Product> findByProductName(String productName);
	
	public List<Product> findByProductCodeAndProductName(String productCode, String productName);
	
	public List<Object[]> findProductCodeAndProductNameByProductId(Integer productId);
}
