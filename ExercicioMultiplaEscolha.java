package com.duolearn.model;

import java.util.List;

public class ExercicioMultiplaEscolha extends Exercicio {
    private List<String> opcoes;
    private int indiceCorreto;

    public ExercicioMultiplaEscolha(int id, String pergunta, int dificuldade, List<String> opcoes, int indiceCorreto) {
        super(id, pergunta, dificuldade);
        this.opcoes = opcoes;
        this.indiceCorreto = indiceCorreto;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public int getIndiceCorreto() {
        return indiceCorreto;
    }

    @Override
    public Boolean avaliarResposta(String resposta) {
        try {
            int escolha = Integer.parseInt(resposta);
            return escolha == indiceCorreto;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public int calcularPontos(int tentativas) {
        int pontosBase = dificuldade * 10;
        return Math.max(pontosBase - ((tentativas - 1) * 2), 2);
    }
}
