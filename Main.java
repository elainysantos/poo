package com.duolearn.main;

import com.duolearn.model.*;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Criar Utilizador e Perfil
        Usuario usuario = new Usuario(1, "Maria Silva", new Date());
        Perfil perfil = new Perfil(101, "Português");
        usuario.setPerfil(perfil);

        // 2. Criar Curso e Lição
        Curso curso = new Curso(1, "Inglês", "Inglês Básico");
        Licao licao1 = new Licao(1, "Saudações", 1);
        curso.adicionarLicao(licao1);

        // 3. Criar Exercícios baseados no UML
        ExercicioMultiplaEscolha ex1 = new ExercicioMultiplaEscolha(
                1,
                "Como se diz 'Olá' em inglês?",
                1,
                Arrays.asList("0) Bye", "1) Hello", "2) Thanks"),
                1
        );

        ExercicioTraducao ex2 = new ExercicioTraducao(
                2,
                "Traduza a frase 'Good morning'",
                2,
                "Good morning",
                "Bom dia"
        );

        licao1.adicionarExercicio(ex1);
        licao1.adicionarExercicio(ex2);

        // 4. Executar fluxo simples de resolução
        System.out.println("=== CURSO: " + curso.getNomeCurso() + " ===");
        System.out.println("=== LIÇÃO: " + licao1.getTitulo() + " ===");
        System.out.println("Utilizador: " + usuario.getNomeUsuario() + "\n");

        for (Exercicio ex : licao1.getExercicio()) {
            ex.realizarExercicio();

            String respostaSimulada = (ex instanceof ExercicioMultiplaEscolha) ? "1" : "Bom dia";
            boolean acertou = ex.avaliarResposta(respostaSimulada);

            if (acertou) {
                int pontos = ex.calcularPontos(1);
                System.out.println("Resposta correta!");
                usuario.getPerfil().adicionarXP(pontos);
            } else {
                System.out.println("Resposta incorreta.");
            }
            System.out.println();
        }

        System.out.println("XP Total do Perfil: " + usuario.getPerfil().getXpTotal());
    }
}
