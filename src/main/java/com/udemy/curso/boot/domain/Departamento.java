package com.udemy.curso.boot.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;


	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Cargo> getCargo() {
		return cargos;
	}

	public void setCargo(List<Cargo> cargo) {
		this.cargos = cargo;
	}
	
}
