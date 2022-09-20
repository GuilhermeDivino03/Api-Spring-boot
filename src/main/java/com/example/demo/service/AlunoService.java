package com.example.demo.service;

import com.example.demo.entity.Aluno;
import com.example.demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno cadastrarAluno(Aluno novoAluno) {
        Aluno alunoCadastrado = alunoRepository.save(novoAluno);
        return alunoCadastrado;
    }

    public Aluno consultarAlunoPorId(Long id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        return aluno.get();
    }

    public void deletarAluno(long id) {
        alunoRepository.deleteById(id);
    }
}
