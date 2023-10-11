package com.truper.demo.exception;

public class ClientNotFoundException extends DomainException{

    public ClientNotFoundException(String message){
        super (message);
    }

    public static ClientNotFoundException of(Long id){
        String message = String.format("El cliente con id %s no se encuentra en el sistema",id);
        return new ClientNotFoundException(message);
    }
}
