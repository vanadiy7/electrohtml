package com.fortegroup.elasticsearch.service;

import com.fortegroup.elasticsearch.model.Products;
import com.fortegroup.elasticsearch.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Eugene Pankov
 */

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

//    @Autowired
//    public ProductsServiceImpl(ProductsRepository productsRepository) {
//        this.productsRepository = productsRepository;
//    }

    @Override
    public Page<Products> findById(String id, Pageable pageable) {
        return productsRepository.findCustomById(id, pageable);
    }
}