package com.company;

public class ComputadorTeste {

    public static void main(String[] args) {
	    Computador c1 = new Computador();
	    c1.marca = "HP";
	    c1.preco = 5000.0;
	    c1.imprimir();
	    c1.calcularValor();
	    c1.imprimir();

	    Computador c2 = new Computador();
	    c2.marca = "IbM";
	    c2.preco = 6000.0;
	    c2.imprimir();
	    c2.calcularValor();
	    c2.imprimir();

		int resultado = c2.alterarValor(-500);
		if(resultado==1){
			System.out.println("Preco alterado com sucesso");
		}else{
			System.out.println("Preço nao alterado");
		}
		c2.imprimir();

	}
}
