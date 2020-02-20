package com.company;

/**
 * @author Maromo
 * @since 2020 feb
 * @version 1.0 Beta
 */
public class Conta {
    public int numero;
    public String nomeCliente;
    public double saldo;
    public static double cpmf;

    /**
     *
     * @param valor - Recebe um valor flutuante para efetuar o saque
     *              (Considera-se o cpmf na transação)
     */
    public void efetuarSaque(double valor){
        saldo -= (valor + (valor * cpmf));
    }

    /**
     *
     * @param valor - Recebe um valor flutuante e acrescenta ao saldo da conta
     */
    public void efetuarDeposito(double valor){
        saldo += valor;
    }

    /**
     * Imprime o extrato de uma conta
     */
    public void imprimirExtrato(){
        System.out.println("Dados da conta: ");
        System.out.println("numero = " + numero);
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);
    }


}
