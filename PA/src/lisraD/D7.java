package lisraD;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um programa para ler um número e verificar se o mesmo é menor que 5, maior que 10 ou entre 5 e 10.
		 * */
		
	
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um valor:");
		Float valor = leia.nextFloat();
		
		if ((valor >= 5)&&(valor <= 10) ) {
			System.out.println("O valor   "+ valor +"   digitado esta entre 5 e 10");
		}
		else if(valor <5) { 
			System.out.println("O valor   "+ valor +"   digitado é menor que 5");
		}
		else if(valor >10) {
			System.out.println("O valor    "+ valor +"   digitado é maior que 10");
		}

	}

}
