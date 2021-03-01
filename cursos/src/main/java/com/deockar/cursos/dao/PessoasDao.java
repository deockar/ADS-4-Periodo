package com.deockar.cursos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deockar.cursos.entidade.Pessoas;

@Repository
public interface PessoasDao extends JpaRepository<Pessoas, Long>{

}
