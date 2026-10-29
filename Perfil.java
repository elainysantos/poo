package com.duolearn.model;

public class Perfil {
    private int idPerfil;
    private String idiomaNativo;
    private int xpTotal;

    public Perfil(int idPerfil, String idiomaNativo) {
        this.idPerfil = idPerfil;
        this.idiomaNativo = idiomaNativo;
        this.xpTotal = 0;
    }

    public String getIdiomaNativo() {
        return idiomaNativo;
    }

    public int getXpTotal() {
        return xpTotal;
    }

    public void adicionarXP(int xp) {
        if (xp > 0) {
            this.xpTotal += xp;
            System.out.println("+" + xp + " XP adicionado ao perfil!");
        }
    }
}
