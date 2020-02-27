package com.company;

import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ContaTeste contaTeste = new ContaTeste();
        int opc = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Cosultar");
            System.out.println("9.. Sair");
            System.out.println("Digite opção: ");
            opc = Integer.parseInt(leitura.nextLine());
            switch(opc){
                case 1:
                    contaTeste.execCadastrar();
                    break;
                case 2:
                    contaTeste.execDepositar();
                    break;
                case 3:
                    contaTeste.execSacar();
                    break;
                case 4:
                    contaTeste.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("opção inválida");
            }
        }while(opc!=9);
    }

    public  void execCadastrar(){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = leitura.nextLine();
        System.out.println("Digite a agencia da conta: ");
        cc.agencia = leitura.nextLine();
        System.out.println("Digite o numero da conta: ");
        cc.conta = leitura.nextLine();
        System.out.println("Conta cadastrada com sucesso");
    }

    public void execConsultar(){
        System.out.println("Situação da Conta");
        cc.imprimir();
    }

    public void execSacar(){
        Scanner leitura = new Scanner(System.in);
        double valorSaque;
        System.out.println("Digite o valor do saque: ");
        valorSaque = Double.parseDouble(leitura.nextLine());
        if(cc.sacar(valorSaque)==1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente");
        }

    }

    public void execDepositar(){
        Scanner leitura = new Scanner(System.in);
        double valorDeposito;
        System.out.println("Digite o valor do deposito: ");
        valorDeposito = Double.parseDouble(leitura.nextLine());
        cc.depositar(valorDeposito);
    }
}