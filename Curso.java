package com.duolearn.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int idCurso;
    private String idiomaAlvo;
    private String nomeCurso;
    private List<Licao> licoes;

    public Curso(int idCurso, String idiomaAlvo, String nomeCurso) {
        this.idCurso = idCurso;
        this.idiomaAlvo = idiomaAlvo;
        this.nomeCurso = nomeCurso;
        this.licoes = new ArrayList<>();
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public List<Licao> getLicoes() {
        return licoes;
    }

    public void adicionarLicao(Licao licao) {
        this.licoes.add(licao);
    }
}
