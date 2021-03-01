package com.deockar.cursos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deockar.cursos.entidade.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long>{

}
