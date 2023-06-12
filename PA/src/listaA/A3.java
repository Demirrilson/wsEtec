package listaA;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Desenvolva um programa para ler uma temperatura em graus Centígrados 
		 * e apresentá-la convertida em graus Fahrenheit.
 		A fórmula de conversão é: 
 		F=(9*C+160)/5, onde 
 		F é a temperatura em Fahrenheit e 
 		C é a temperatura em Centígrados.*/
		
		float F, C;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Programa para conversão de temperatura de °C para °F \n \n");
		System.out.println("Digite a temperatura em graus Centígrados");
		C = valor.nextFloat();
		
		F = ((9*C+150)/5);
		
		System.out.println("A temperatura em Fahrenheit é: " + F + "°F"); 
	}

}
