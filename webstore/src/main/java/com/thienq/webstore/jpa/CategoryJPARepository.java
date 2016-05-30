package com.thienq.webstore.jpa;

import org.springframework.data.repository.CrudRepository;

import com.thienq.webstore.domain.Category;

public interface CategoryJPARepository extends CrudRepository<Category, Long>{

	
}
