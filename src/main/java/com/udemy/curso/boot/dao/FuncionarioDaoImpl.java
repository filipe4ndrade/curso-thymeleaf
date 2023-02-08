package com.udemy.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.udemy.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
