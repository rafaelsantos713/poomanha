package com.company;

public class Main {

    public static void main(String[] args) {
	    int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            matriz[i][i] = 1;
        }
        //Percorrer e imprimir bem formatado
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[%2d] ", matriz[i][j]);
            }
            System.out.println();

        }
    }
}
