package lisraD;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desenvolva um programa que leia um número e informe se este número é maior, menor ou igual a 100.
		 * */
		
		float valor;
		Scanner leia = new Scanner (System.in);
		System.out.println("digite um valor");
		valor=leia.nextFloat();
		if (valor == 100) {
			System.out.println("O valor digitado é igual a 100");
			}
		else if(valor > 100) {
			System.out.println("O valor digitado é maior que 100");
			
		}
		else {
			System.out.println("O valor digitado é menor que 100");
		}
	}

}
