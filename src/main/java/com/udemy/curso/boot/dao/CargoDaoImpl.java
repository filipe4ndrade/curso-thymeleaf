package com.udemy.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.udemy.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
