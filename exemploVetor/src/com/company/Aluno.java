package com.company;

import java.util.Scanner;

public class Aluno {
    private int ra;
    private String nome;
    private String email;

    public void cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ra: ");
        ra = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite o email: ");
        email = sc.nextLine();
        System.out.println("Cadastrado com sucesso ");
    }
    
    public void imprimir(){
        System.out.println("ra = " + ra);
        System.out.println("nome = " + nome);
        System.out.println("email = " + email);
    }
}
