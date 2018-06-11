package com.philipap.service;



import com.philipap.commands.ProductForm;
import com.philipap.domain.Product;

import java.util.List;

/**
 * PhilipAp.
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);

    void sendProductMessage(String id);
}
