package com.deockar.cursos.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deockar.cursos.dao.PessoasDao;
import com.deockar.cursos.entidade.Pessoas;

@RestController
@RequestMapping("/pessoas")
public class PessoasRest {

	@Autowired
	private PessoasDao pessoasDao;
	
	@GetMapping
	public List<Pessoas> get(){
		return pessoasDao.findAll();
	}
	@PostMapping
	public void post (@RequestBody Pessoas pessoas) {
		pessoasDao.save(pessoas);
	}
	
	}
	