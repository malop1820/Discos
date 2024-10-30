package com.mx.apiDiscos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.apiDiscos.dao.DiscosDao;
import com.mx.apiDiscos.model.Discos;

@Service
public class DiscosImp implements DiscosServ {

	@Autowired
	DiscosDao discoDao;

	@Override
	public List<Discos> listar() {
		// TODO Auto-generated method stub
		List<Discos> registrosBd = discoDao.findAll();
		return registrosBd;
	}

	@Override
	public void guardar(Discos disco) {
		// TODO Auto-generated method stub
		discoDao.save(disco);
	}

	@Override
	public Discos buscar(Integer id) {
		// TODO Auto-generated method stub
		return discoDao.findById(id).orElse(null);
	}

	@Override
	public void editar(Discos disco) {
		// TODO Auto-generated method stub
		discoDao.save(disco);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		discoDao.deleteById(id);
	}

	@Transactional(readOnly = true)
	public List<Discos> buscarXNombre(String nombre) {
		List<Discos> discosList = discoDao.findAll(); // Lista para almacenar coincidencias
		List<Discos> discosEncontrados = new ArrayList<>(); // Lista para almacenar coincidencias

		// Recorremos la lista de jugadores con un bucle `for`
		for (Discos disco : discosList) {
			if (disco.getNombre().equalsIgnoreCase(nombre)) {
				discosEncontrados.add(disco); // Agrega el jugador a la lista si el nombre coincide
			}
		}
		return discosEncontrados;
	}
	
	@Transactional(readOnly = true)
	public List<Discos> buscarXPrecio(Float precio) {
		List<Discos> discosList = discoDao.findAll(); // Lista para almacenar coincidencias
		List<Discos> discosEncontrados = new ArrayList<>(); // Lista para almacenar coincidencias

		// Recorremos la lista de jugadores con un bucle `for`
		for (Discos disco : discosList) {
			if (disco.getPrecio().equals(precio)) {
				discosEncontrados.add(disco); // Agrega el jugador a la lista si el nombre coincide
			}
		}
		return discosEncontrados;
	}
}
