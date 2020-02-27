package com.company;

public class PassagemValor {
    void alterar(int a){
        a = 50;
        System.out.println("Valor de A - interno: " + a);
    }

    public static void main(String[] args) {
	    PassagemValor obj = new PassagemValor();
	    int a  =  28;
	    obj.alterar(a);
        System.out.println("Imprimir a da pilha do main: " + a);
    }
}
