package com.cliente.apirestcli.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.apirestcli.entities.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {

	//criando os endpoints
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client());
		list.add(new Client());
		return ResponseEntity.ok().body(list);
	}
}
