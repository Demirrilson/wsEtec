package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Desenvolva um programa para ler os lados de um ret�ngulo
		 *  e calcular a �rea deste ret�ngulo, utilizando a 
		 *  f�rmula: �REA=LADO1*LADO2.*/
		
		float lado1, lado2, area;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Programa para Calculo de �rea de um Ret�ngulo \n ");
		System.out.println("Digite o valor do lado maior do ret�ngulo em (cm)");
		lado1 = valor.nextFloat();
		System.out.println("Digite o valor do lado menor do ret�ngulo em (cm)");
		lado2 = valor.nextFloat();
		
		area = (lado1 * lado2);
		
		System.out.println("A �rea do Ret�ngulo � " + area +"cm");
		
	}

}
