package com.thienq.webstore.jpa;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.thienq.webstore.domain.Product;

@Repository
public interface ProductJPARepository extends PagingAndSortingRepository<Product, Long> {

	Product findByCode(String code);
	Page<Product> findByCategoryName(String category, Pageable pageable);
	Page<Product> findByManufacturer(String manufacturer, Pageable pageable);
	List<Product> findByCategoryName(String category);
	List<Product> findByManufacturer(String manufacturer);
}
