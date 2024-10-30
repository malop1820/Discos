package com.mx.apiDiscos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.apiDiscos.model.Discos;

public interface DiscosDao extends JpaRepository<Discos, Integer>
{

}
