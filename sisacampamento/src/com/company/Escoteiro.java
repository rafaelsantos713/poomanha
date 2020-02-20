package com.company;

public class Escoteiro {
    //1. Definir os atributos
    public int id;
    public String nome;
    public int idade;
    protected char grupo;

    //2. Definir os métodos (comportamento)
    public void registrarAcampamento(){
        if(idade < 6){
            grupo = '-';
            return;
        }
        if(idade  < 11){
            grupo = 'A';
            return;
        }
        if(idade < 18){
            grupo = 'B';
            return;
        }
        grupo = 'C';
    }
    public void listar(){
        System.out.println("Dados do Acampamento");
        System.out.println("Escoteiro: " + nome);
        System.out.println("Registro do Escoteiro: " + id);
        System.out.println("Sua idade: " + idade);
        System.out.println("Você foi selecionado para o ");
        System.out.println("GRUPO: " + grupo);

    }
}
