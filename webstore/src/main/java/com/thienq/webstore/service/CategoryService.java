package com.thienq.webstore.service;

import java.util.List;
import java.util.Map;

import com.thienq.webstore.domain.Category;

public interface CategoryService {
	
	List<Category> findAll();
	Map<String, Category> getCategoryMap();
	Category findOne(Long id);
	void save(Category category);
}
