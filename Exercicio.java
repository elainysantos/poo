package com.duolearn.model;

public abstract class Exercicio implements Avaliavel {
    protected int id;
    protected String pergunta;
    protected int dificuldade;

    public Exercicio(int id, String pergunta, NivelDificuldade nivelDificuldade) {
        this.id = id;
        this.pergunta = pergunta;
        this.dificuldade = nivelDificuldade.getNivel();
    }

    // Mantém compatibilidade caso queira instanciar passando int diretamente
    public Exercicio(int id, String pergunta, int dificuldade) {
        this(id, pergunta, NivelDificuldade.fromInt(dificuldade));
    }

    protected String obterPergunta() {
        return pergunta;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public NivelDificuldade getNivelDificuldade() {
        return NivelDificuldade.fromInt(this.dificuldade);
    }

    public void realizarExercicio() {
        NivelDificuldade nivel = getNivelDificuldade();
        System.out.println("Exercício " + id + " [" + nivel.getDescricao().toUpperCase() + "]: " + obterPergunta());
    }
}
