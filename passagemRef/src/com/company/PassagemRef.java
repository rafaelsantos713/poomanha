package com.company;

public class PassagemRef {

    public static void meuMetodo(Pessoa p){
        p.nome = "Oscar";
        p.idade = 25;
        System.out.println(p.hashCode());
    }
    public static void main(String[] args) {
	    Pessoa p1 = new Pessoa();
	    p1.nome = "Maria";
	    p1.idade = 12;
	    meuMetodo(p1);
        System.out.println("p1.nome = " + p1.nome);
        System.out.println("p1.idade = " + p1.idade);
        System.out.println(p1.hashCode());
    }
}
