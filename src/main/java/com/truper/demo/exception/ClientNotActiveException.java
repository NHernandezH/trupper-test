package com.truper.demo.exception;

public class ClientNotActiveException extends DomainException{

    public ClientNotActiveException(String message){
        super (message);
    }

    public static ClientNotActiveException of(Long id){
        String message = String.format("El cliente con id %s no se encuentra activo",id);
        return new ClientNotActiveException(message);
    }

}
