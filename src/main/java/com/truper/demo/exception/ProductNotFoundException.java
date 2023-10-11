package com.truper.demo.exception;

public class ProductNotFoundException extends DomainException {

    public ProductNotFoundException(String message){
        super (message);
    }

    public static ProductNotFoundException of(Long id){
        String message = String.format("El producto con id %s no se encuentra en el sistema",id);
        return new ProductNotFoundException(message);
    }
}
