package com.duolearn.main;

import com.duolearn.model.*;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Maria Silva", new Date());
        Perfil perfil = new Perfil(101, "Português");
        usuario.setPerfil(perfil);

        Curso curso = new Curso(1, "Inglês", "Inglês Básico");
        Licao licao1 = new Licao(1, "Saudações e Frases", 1);
        curso.adicionarLicao(licao1);

        // Exercício FÁCIL (10 XP * 1.0 = 10 XP)
        ExercicioMultiplaEscolha ex1 = new ExercicioMultiplaEscolha(
                1,
                "Como se diz 'Olá' em inglês?",
                NivelDificuldade.FACIL,
                Arrays.asList("0) Bye", "1) Hello", "2) Thanks"),
                1
        );

        // Exercício MÉDIO (15 XP * 1.5 = 22 XP)
        ExercicioTraducao ex2 = new ExercicioTraducao(
                2,
                "Traduza a frase 'Good morning'",
                NivelDificuldade.MEDIO,
                "Good morning",
                "Bom dia"
        );

        // Exercício DIFÍCIL (15 XP * 2.0 = 30 XP)
        ExercicioTraducao ex3 = new ExercicioTraducao(
                3,
                "Traduza a frase 'I would like a cup of coffee, please'",
                NivelDificuldade.DIFICIL,
                "I would like a cup of coffee, please",
                "Eu gostaria de uma xícara de café, por favor"
        );

        licao1.adicionarExercicio(ex1);
        licao1.adicionarExercicio(ex2);
        licao1.adicionarExercicio(ex3);

        System.out.println("=== CURSO: " + curso.getNomeCurso() + " | LIÇÃO: " + licao1.getTitulo() + " ===\n");

        for (Exercicio ex : licao1.getExercicio()) {
            ex.realizarExercicio();

            // Simulando respostas corretas
            String respostaSimulada = switch (ex.getNivelDificuldade()) {
                case FACIL -> "1";
                case MEDIO -> "Bom dia";
                case DIFICIL -> "Eu gostaria de uma xícara de café, por favor";
            };

            if (ex.avaliarResposta(respostaSimulada)) {
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
