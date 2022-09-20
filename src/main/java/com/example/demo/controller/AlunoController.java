package com.example.demo.controller;

import com.example.demo.entity.Aluno;
import com.example.demo.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
        public Aluno postAluno(@RequestBody Aluno aluno) {
        Aluno alunoCadastradoComSucesso = alunoService.cadastrarAluno(aluno);
        return alunoCadastradoComSucesso;
    }

    @GetMapping(value = "/{id}")
    public Aluno getAluno(@PathVariable("id") Long id) {
        Aluno alunoEncontrado = alunoService.consultarAlunoPorId(id);
        return alunoEncontrado;
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable long id) {
        alunoService.deletarAluno(id);
    }
}
