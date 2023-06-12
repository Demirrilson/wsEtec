package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Desenvolva um programa para ler os lados de um retângulo
		 *  e calcular a área deste retângulo, utilizando a 
		 *  fórmula: ÁREA=LADO1*LADO2.*/
		
		float lado1, lado2, area;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Programa para Calculo de Área de um Retângulo \n ");
		System.out.println("Digite o valor do lado maior do retângulo em (cm)");
		lado1 = valor.nextFloat();
		System.out.println("Digite o valor do lado menor do retângulo em (cm)");
		lado2 = valor.nextFloat();
		
		area = (lado1 * lado2);
		
		System.out.println("A área do Retângulo é " + area +"cm");
		
	}

}
