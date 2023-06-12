package listaA;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um programa para ler dois valores para as variáveis A e B, 
		 * efetuar a troca dos valores de forma que a 
		 * variável A passe a possuir o valor da variável B 
		 * e que a variável B passe a possuir o valor da variável A. 
		 * Apresentar os valores trocados.
		 */
		
		int a, b, c;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Programa para troca de valores de Variáveis");
		System.out.println("Digite o 1° valor inteiro: ");
		a = valor.nextInt();
		System.out.println("Digite o 2° valor inteiro:");
		b = valor.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Valores trocados!");
		System.out.println("valor da 1ª variável: " + a);
		System.out.println("valor da 2ª variável: " + b);
		
		
		
	}

}
