package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> findByProductId(Integer productId) {
		String queryString = "from Product p where p.productId= ?0";
		List<Product> productList = (List<Product>) hibernateTemplate.find(queryString, productId);
		
		return productList;
	}

	@Override
	public List<Product> findByProductName(String productName) {
		String queryString = "from Product p where p.productName= ?0";
		List<Product> productList = (List<Product>) hibernateTemplate.find(queryString, productName);
		
		return productList;
	}

	@Override
	public List<Product> findByProductCodeAndProductName(String productCode, String productName) {
		String queryString = "from Product p where p.productCode= ?0 and p.productName= ?1";
		List<Product> productList = (List<Product>) hibernateTemplate.find(queryString, productCode, productName);
		
		return productList;
	}

	@Override
	public List<Object[]> findProductCodeAndProductNameByProductId(Integer productId) {
		String queryString = "select p.productCode, p.productName from Product p where p.productId= ?0";
		List<Object[]> productCodeAndNameArrayList = (List<Object[]>) hibernateTemplate.find(queryString, productId);
		
		return productCodeAndNameArrayList;
	}

}
