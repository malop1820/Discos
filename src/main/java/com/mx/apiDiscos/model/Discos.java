package com.mx.apiDiscos.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//CREATE TABLE DISCOS(
//ID NUMBER PRIMARY KEY,
//NOMBRE VARCHAR2(80) NOT NULL,
//GENERO VARCHAR2(80) NOT NULL,
//PRECIO FLOAT NOT NULL
//);


@Entity
@Table(name = "DISCOS")
public class Discos {
	@Id//representa la llave prmaria key
	@Column(name="ID", columnDefinition = "NUMBER",nullable =false)
	private Integer idDisco;

	@Column(name="NOMBRE", columnDefinition ="VARCHAR2(80)" ,  nullable =false)
	private String nombre;
	

	@Column(name="GENERO", columnDefinition = "VARCHAR2(80)",  nullable =false)
	private String genero;
	
	@Column(name="PRECIO", columnDefinition = "FLOAT",  nullable =false)
	private Float precio;
	
	public Discos () {
		
	}

	public Discos(Integer idDisco, String nombre, String genero, Float precio) {
		super();
		this.idDisco = idDisco;
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Discos [idDisco=" + idDisco + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + "\n]";
	}

	public Integer getIdDisco() {
		return idDisco;
	}

	public void setIdDisco(Integer idDisco) {
		this.idDisco = idDisco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

}