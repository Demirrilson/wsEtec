package listaA;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Desenvolva  um  programa  para  ler  quatro  valores 
		 *  e  calcular e  apresentar a  m�dia  destes valores.*/
		
		float nota1, nota2, nota3, nota4, media;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Programa para Calculo de M�dia de Notas");
		System.out.println("Digite a 1� nota:");
		nota1 = valor.nextFloat();
		System.out.println("Digite a 2� nota:");
		nota2 = valor.nextFloat();
		System.out.println("Digite a 3� nota:");
		nota3 = valor.nextFloat();
		System.out.println("Digite a 4� nota:");
		nota4 = valor.nextFloat();
		
		media = ((nota1 + nota2 + nota3 + nota4)/4);
		
		System.out.println("A m�dia das notas � " + media +"!");

	}

}
