package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    int a, b;
	    int soma;
        System.out.println("Entre valor de a: ");
        a = Integer.parseInt(entrada.nextLine());
        String letra;
        System.out.println("Digite uma letra: ");
        letra = entrada.nextLine();
        System.out.println("Entre valor de b: ");
        b = Integer.parseInt(entrada.nextLine());
        soma = a + b;
        System.out.println(soma);
    }
}
