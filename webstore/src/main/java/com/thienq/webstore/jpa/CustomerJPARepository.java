package com.thienq.webstore.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thienq.webstore.domain.Customer;

@Repository
public interface CustomerJPARepository extends CrudRepository<Customer, Long> {

}
