package com.company;

public class GerenciarConta {

    public static void main(String[] args) {
        Conta.cpmf = 0.01;
        Conta conta1, conta2;
        conta1 = new Conta();
        conta1.numero = 111;
        conta1.nomeCliente = "Maria Silva";
        conta1.cpmf = 0.02;
        conta1.efetuarDeposito(1000.0);
        conta1.efetuarSaque(100.0);
        conta1.imprimirExtrato();

        conta2 = new Conta();
        conta2.numero = 222;
        conta2.nomeCliente = "Jose";
        conta2.efetuarDeposito(2000.0);
        conta2.efetuarSaque(100.0);
        conta2.imprimirExtrato();
    }
}
