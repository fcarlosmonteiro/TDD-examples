package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        System.out.print("Quantos alunos deseja calcular a média? ");
        int numAlunos = scanner.nextInt();

        System.out.print("Quantas notas cada aluno possui? ");
        int numNotas = scanner.nextInt();

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Nome do aluno: ");
            String nome = scanner.next();

            double[] notas = new double[numNotas];
            double[] pesos = new double[numNotas];

            for (int j = 0; j < numNotas; j++) {
                try {
                    System.out.print("Nota " + (j + 1) + ": ");
                    notas[j] = scanner.nextDouble();
                    System.out.print("Peso da nota " + (j + 1) + ": ");
                    pesos[j] = scanner.nextDouble();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Por favor, insira um valor numérico válido.");
                    scanner.nextLine(); // Limpar a entrada inválida
                    j--; // Repetir a entrada para a mesma nota
                }
            }

            Aluno aluno = new Aluno(nome, notas, pesos);
            alunos.add(aluno);
        }

        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Média: " + media);

            aluno.imprimirNotas();

            System.out.println("Situação: " + aluno.situacao());
            System.out.println();
        }

        scanner.close();
    }
}