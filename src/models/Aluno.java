package models;

import exceptions.AlunoNaoEncontradoException;
import exceptions.MatriculaInvalidaException;


public class Aluno {
    private String nome;
    private String matricula;

  
    public Aluno(String nome, String matricula) throws AlunoNaoEncontradoException, MatriculaInvalidaException {
        if (nome == null || nome.isEmpty()) {
            throw new AlunoNaoEncontradoException("Nome invalido");
        }
        if (matricula == null || matricula.isEmpty()) {
            throw new MatriculaInvalidaException("Matricula invalida");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setNome(String nome) throws AlunoNaoEncontradoException {
        if (nome == null || nome.isEmpty()) {
            throw new AlunoNaoEncontradoException("Nome invalido");
        }
        this.nome = nome;
    }

    public void setMatricula(String matricula) throws MatriculaInvalidaException {
        if (matricula == null || matricula.isEmpty()) {
            throw new MatriculaInvalidaException("Matricula invalida");
        }
        this.matricula = matricula;
    }
}