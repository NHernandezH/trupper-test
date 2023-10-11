package com.truper.demo.service;

import com.truper.demo.exception.ClientNotActiveException;
import com.truper.demo.exception.ClientNotFoundException;
import com.truper.demo.repository.ClientRepository;
import com.truper.demo.repository.entity.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;
    public Client getClientById(Long id){
        Client client = clientRepository.findById(id)
                .orElseThrow(()->ClientNotFoundException.of(id));


        if(!client.getActive()){
            throw ClientNotActiveException.of(id);
        }
        return client;
    }
}
