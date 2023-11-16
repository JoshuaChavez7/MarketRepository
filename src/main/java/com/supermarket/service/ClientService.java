package com.supermarket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supermarket.entity.Client;
import com.supermarket.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	/**	C */
	public void create(Client client) {
		clientRepository.save(client);
		
	}
	
	/**	R */
	public List<Client> getAll(){
		return clientRepository.findAll();
	}
	
	/**	U */
	public void update(Client client, String nit){
		
		client.setNit(nit);
		clientRepository.save(client);
		
	}
	
	/**	D */
	public void delete(String code) {
		clientRepository.deleteById(code);
	}
	
	
	public Client getOne(String code) { 
		Optional<Client> searchedClient = clientRepository.findById(code);
		
		if(searchedClient.isPresent()) {
			return searchedClient.get();
		}else {
			throw new RuntimeException("El cajero no existe!");
		}
		
	}
	
	

}
