package com.duolearn.model;

public class ExercicioTraducao extends Exercicio {
    private String sentencaOriginal;
    private String sentencaTraduzida;

    public ExercicioTraducao(int id, String pergunta, int dificuldade, String sentencaOriginal, String sentencaTraduzida) {
        super(id, pergunta, dificuldade);
        this.sentencaOriginal = sentencaOriginal;
        this.sentencaTraduzida = sentencaTraduzida;
    }

    public String getSentencaTraduzida() {
        return sentencaTraduzida;
    }

    @Override
    public Boolean avaliarResposta(String resposta) {
        return sentencaTraduzida.equalsIgnoreCase(resposta.trim());
    }

    @Override
    public int calcularPontos(int tentativas) {
        int pontosBase = dificuldade * 15;
        return Math.max(pontosBase - ((tentativas - 1) * 3), 3);
    }
}
