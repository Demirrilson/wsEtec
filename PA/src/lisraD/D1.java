package lisraD;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um programa que leia dois valores e informe qual dos valores é o maior.
		 * Se os números forem iguais, o programa deverá indicar esta igualdade.
		 * */
		
		float valor1, valor2;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Digite o 1º valor: ");
		valor1 = valor.nextFloat();
		
		System.out.println("Digite o 2° valor: ");
		valor2 = valor.nextFloat();
		
		if (valor1 == valor2) {
			System.out.println("Os valores são iguais");	
		}
		else if (valor1 > valor2) {
			System.out.println("O primeiro valor é o maior");
			
		}
		else {
			System.out.println("O segundo valor é o maior");
		}
	}
	

}
