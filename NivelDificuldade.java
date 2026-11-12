package com.duolearn.model;

public enum NivelDificuldade {
    FACIL(1, "Fácil", 1.0),
    MEDIO(2, "Médio", 1.5),
    DIFICIL(3, "Difícil", 2.0);

    private final int nivel;
    private final String descricao;
    private final double multiplicadorXp;

    NivelDificuldade(int nivel, String descricao, double multiplicadorXp) {
        this.nivel = nivel;
        this.descricao = descricao;
        this.multiplicadorXp = multiplicadorXp;
    }

    public int getNivel() {
        return nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getMultiplicadorXp() {
        return multiplicadorXp;
    }

    // Converte um int (1, 2 ou 3) no Enum correspondente
    public static NivelDificuldade fromInt(int nivel) {
        for (NivelDificuldade d : values()) {
            if (d.nivel == nivel) {
                return d;
            }
        }
        return FACIL; // Padrão caso receba um valor fora de 1 a 3
    }
}
