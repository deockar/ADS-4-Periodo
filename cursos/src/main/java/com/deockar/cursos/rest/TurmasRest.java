package com.deockar.cursos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deockar.cursos.dao.TurmaDao;
import com.deockar.cursos.entidade.Turma;

@RestController
@RequestMapping("/turma")
public class TurmasRest {

	@Autowired
	private TurmaDao turmaDao;
	
	@GetMapping
	public List<Turma> get() {
		return turmaDao.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		turmaDao.deleteById(id);
	}
}
