package com.duolearn.model;

import java.util.Date;

public class Usuario {
    private int idUsuario;
    private String nomeUsuario;
    private Date dataNascimento;
    private Perfil perfil;

    public Usuario(int idUsuario, String nomeUsuario, Date dataNascimento) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
