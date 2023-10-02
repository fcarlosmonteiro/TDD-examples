package org.example;

public class Aluno {
    private String nome;
    private double[] notas;
    private double[] pesos;

    public Aluno(String nome, double[] notas, double[] pesos) {
        this.nome = nome;
        this.notas = notas;
        this.pesos = pesos;
    }

    public double calcularMedia() {
        if (notas.length != pesos.length) {
            throw new IllegalArgumentException("O número de notas deve ser igual ao número de pesos.");
        }

        double somaNotasPesadas = 0;
        double somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotasPesadas += notas[i] *
                    pesos[i];
            somaPesos += pesos[i];
        }

        return somaNotasPesadas / somaPesos;
    }

    public void imprimirNotas() {
        System.out.println("Notas de " + nome + ":");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i] + " (Peso: " + pesos[i] + ")");
        }
    }

    public boolean passou() {
        double media = calcularMedia();
        return media >= 6.0;
    }

    public String situacao() {
        return passou() ? "Aprovado" : "Reprovado";
    }

    public String getNome() {
        return nome;
    }
}