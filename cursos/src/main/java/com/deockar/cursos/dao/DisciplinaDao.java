package com.deockar.cursos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deockar.cursos.entidade.Disciplina;

@Repository
public interface DisciplinaDao extends JpaRepository<Disciplina, Long>{

}
