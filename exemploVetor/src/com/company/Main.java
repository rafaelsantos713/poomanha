package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   /* int valores[] = new int[5];
	    valores[3] = 16;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor: " + valores[i]);
        } */
	   Aluno vetAlunos[] = new Aluno[10]; //Vetor para acondicionar 10 alunos
       Scanner sc = new Scanner(System.in);
       System.out.println("Quantos alunos deseja cadastrar ? ");
       int qtd = Integer.parseInt(sc.nextLine());
       if(qtd>10){
           System.out.println("Impossível cadastrar");
       }else{
           //Cadastrar até a quantidade desejada pelo usuário.

           for (int i = 0; i < qtd; i++) {
               Aluno aluno = new Aluno();
               aluno.cadastrar();
               vetAlunos[i] = aluno;
           }
       }
        for (Aluno aluno: vetAlunos) {
            if(aluno!=null) {
                aluno.imprimir();
            }else{
                break;
            }
        }
    }
}
