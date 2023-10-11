package com.truper.demo.service;

import com.truper.demo.exception.ProductNotActiveException;
import com.truper.demo.exception.ProductNotFoundException;
import com.truper.demo.repository.ProductRepository;
import com.truper.demo.repository.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findProducts(List<com.truper.demo.dto.Product> products){
        return products.stream()
                .map(com.truper.demo.dto.Product::getId)
                .map(this::findProductById)
                .collect(Collectors.toList());
    }

    public Product findProductById(Long id){
        Product product = productRepository.findById(id)
                .orElseThrow(()-> ProductNotFoundException.of(id));
        if(!product.getActive()){
            throw ProductNotActiveException.of(id);
        }
        return product;
    }
}
