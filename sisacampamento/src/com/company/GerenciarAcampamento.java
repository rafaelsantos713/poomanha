package com.company;

public class GerenciarAcampamento {

    public static void main(String[] args) {
        Escoteiro escoteiro1 = new Escoteiro();
        escoteiro1.id = 121;
        escoteiro1.nome = "Marlon";
        escoteiro1.idade = 13;
        //Listar os dados do Marlon no momento
        escoteiro1.listar();

        //Registrar o acampamento para o Marlon
        escoteiro1.registrarAcampamento();
        escoteiro1.listar();

        //Representar a escoteira Maria
        Escoteiro escoteiro2 = new Escoteiro();
        escoteiro2.id = 232;
        escoteiro2.nome = "Maria";
        escoteiro2.idade = 8;
        //Registrar Maria no Acampamento
        escoteiro2.registrarAcampamento();
        //Listar os dados da Maria
        escoteiro2.listar();

    }
}
