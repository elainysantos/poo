package com.duolearn.model;

import java.util.ArrayList;
import java.util.List;

public class Licao {
    private int idLicao;
    private String titulo;
    private int ordemNoCurso;
    private List<Exercicio> exercicios;

    public Licao(int idLicao, String titulo, int ordemNoCurso) {
        this.idLicao = idLicao;
        this.titulo = titulo;
        this.ordemNoCurso = ordemNoCurso;
        this.exercicios = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Exercicio> getExercicio() {
        return exercicios;
    }

    public void adicionarExercicio(Exercicio exercicio) {
        this.exercicios.add(exercicio);
    }
}
