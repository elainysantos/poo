package com.duolearn.model;

public abstract class Exercicio implements Avaliavel {
    protected int id;
    protected String pergunta;
    protected int dificuldade;

    public Exercicio(int id, String pergunta, int dificuldade) {
        this.id = id;
        this.pergunta = pergunta;
        this.dificuldade = dificuldade;
    }

    protected String obterPergunta() {
        return pergunta;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void realizarExercicio() {
        System.out.println("Exercício " + id + " [" + dificuldade + "★]: " + obterPergunta());
    }
}
