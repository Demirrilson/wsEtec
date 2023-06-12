package listaA;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Desenvolva um programa para ler o raio e a altura 
		 * de uma lata de óleo e calcular o valor do seu volume, 
		 * utilizando a fórmula: VOLUME=3.14159*R*R*ALTURA.*/
		
		
		double r, altura, volume, pi;
		pi = 3.14159;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Programa para calculo de volume de cilíndros");
		System.out.println("Digite o valor do Raio da lata em cm: ");
		r = valor.nextDouble();
		System.out.println("Digite a altura da Lata em cm: ");
		altura = valor.nextDouble();
		
		volume = (pi* r * r * altura);
		
		System.out.println("O volume da Lata é: " + volume + "cm² !");
		
		
	}

}
