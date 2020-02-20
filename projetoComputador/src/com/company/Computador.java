package com.company;

public class Computador {
    //1. Atributos
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    //2. Métodos
    public void imprimir(){
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("cor = " + cor);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("hp")){
            preco *= 1.3;
            return;
        }
        if(marca.equalsIgnoreCase("ibm")){
            preco *= 1.5;
            return;
        }
    }
    public int alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return 1;
        }
        return 0;
    }
}
