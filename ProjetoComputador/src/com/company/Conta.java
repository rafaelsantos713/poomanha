package com.company;

public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public void imprimir(){
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("nome cliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);
    }

    public int sacar(double valor){
        if(valor<=saldo){
            saldo -=  valor;
            return 1;
        }
        return 0;
    }
    public void depositar(double valor){
        saldo += valor;
    }
}
