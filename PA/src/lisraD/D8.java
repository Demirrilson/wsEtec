package lisraD;

import java.util.Scanner;

public class D8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Desenvolva um programa para ler dois números e realizar a divisão do maior pelo menor, apresentando o resultado.
		 */
		
		float valor1, valor2, valorMaior, valorMenor, resultado;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor");
		valor1 = leia.nextFloat();
		System.out.println("Digite o segundo valor");
		valor2 = leia.nextFloat();
		
		if (valor1 > valor2) {
		valorMaior = valor1;
		valorMenor = valor2;
	    resultado = valorMaior / valorMenor;
		System.out.println("A Divisão entre os valores é de:" +resultado);
		}
		else if (valor2 > valor1) {
			valorMaior = valor2;
		    valorMenor = valor1;
		    resultado = valorMaior / valorMenor;
		    System.out.println("A Divisão entre os valores é de:" +resultado);
		}
		else {
			
			System.out.println("Os dois valores são iguais a Divisão é 1");
			
		}
		
		

	}

}
