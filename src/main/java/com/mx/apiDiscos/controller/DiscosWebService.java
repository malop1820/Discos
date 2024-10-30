package com.mx.apiDiscos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiDiscos.model.Discos;
import com.mx.apiDiscos.service.DiscosImp;





@RestController
@RequestMapping(path ="DiscosWebService")
@CrossOrigin

public class DiscosWebService {
	//Inyeccion de dependencia 
		@Autowired
		DiscosImp discoImp;
		//URL: http://localhost:9000/DiscosWebService/listar
		@GetMapping(path = "listar")
		public List<Discos>listar(){
			return discoImp.listar();
		}

		@PostMapping(path = "guardar")
		public void guardar(@RequestBody Discos disco) {
			discoImp.guardar(disco);
		}
		
		@PostMapping(path ="buscar")
		public Discos buscar (@RequestBody Discos disco) {
		return discoImp.buscar(disco.getIdDisco());
		}
		
		@PostMapping(path = "editar")
		public void editar(@RequestBody Discos disco) {
			discoImp.editar(disco);
			
		}
		
		@PostMapping(path = "eliminar")
		public void eliminar(@RequestBody  Discos disco) {
			discoImp.eliminar(disco.getIdDisco());
		
	}
		
		@PostMapping(path = "buscarXNombre")
		public List<Discos> buscarXNombre(@RequestBody Discos discos) {
			//TODO: process POST request
			
			return discoImp.buscarXNombre(discos.getNombre());
		}
		
		@PostMapping(path = "buscarXPrecio")
		public List<Discos> buscarXPrecio(@RequestBody Discos discos) {
			//TODO: process POST request
			
			return discoImp.buscarXPrecio(discos.getPrecio());
		}
}
