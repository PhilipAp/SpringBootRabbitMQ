package com.philipap.repository;

import com.philipap.domain.Product;
import org.springframework.data.repository.CrudRepository;
/**
 * PhilipAp.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
