package com.truper.demo.exception;

public class ProductNotActiveException extends DomainException {

    public ProductNotActiveException(String message){
        super (message);
    }

    public static ProductNotActiveException of(Long id){
        String message = String.format("El producto con id %s no se encuentra activo",id);
        return new ProductNotActiveException(message);
    }

}
