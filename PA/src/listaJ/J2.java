package listaJ;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  	Desenvolva um programa para ler um número e 
		 	escrever todos os números de 0 até este
			número, indicando se cada um é par ou ímpar. 
		 */
		
		int contador =0 , contagem = 0;
		float teste;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		contador = leia.nextInt();
		
		System.out.println("Inicio da Contagem");
		
		while (contador >=0) {
			System.out.print(contagem);
			teste = contagem % 2;
			if (teste == 0) {
				System.out.println(" PAR");
			}else {
				System.out.println(" IMPAR");
			}
			contagem = contagem +1;	
			contador = contador -1;
		}
		System.out.println("Fim da Contagem");

	}

}
