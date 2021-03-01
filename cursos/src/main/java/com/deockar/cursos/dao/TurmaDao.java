package com.deockar.cursos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deockar.cursos.entidade.Turma;

@Repository
public interface TurmaDao extends JpaRepository<Turma, Long>{

}
