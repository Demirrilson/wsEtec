package lisraD;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um programa para calcular o reajuste salarial dos funcionários de um empresa de desenvolvimento de softwares.
		 *  O programa deverá solicitar a leitura do código e o salário atual do funcionário e 
		 *  realizar o reajuste salarial de acordo com a tabela abaixo. O programa deverá apresentar o salário antigo, 
		 *  o novo salário, o valor do reajuste e a função do funcionário.
			Código 			Função 			Percentual
				1 			Operador 			5%
				2 			Programador 		10%
				3 			Analista 			15%
		 */
		float antigoSal, novoSal = 0, reajuste = 0, percentual = 0, cod = 0;
	
		String funcao = null ;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("	Calculo de reajuste salarial \n \n");
		System.out.println
				("	Código  	    	Função 				Percentual\r\n"
				+ "	1 			Operador 			5%\r\n"
				+ "	2 			Programador 			10%\r\n"
				+ "	3 			Analista 			15%");
		
		System.out.println("\n\n	 Digite o Código do seu cargo: ");
		cod = leia.nextFloat();
		System.out.println("\n\n	 Digite o Seu salário: ");
		antigoSal = leia.nextFloat();
		
		if (cod == 1)
		{
			funcao = "Operador";
			percentual = (5);
		}
		
		if (cod == 2) 
		{
			funcao = "Programador";
			percentual = (10);	
		}
		
		if (cod == 3) 
		{
			funcao = "Analista";
			percentual = (15);			
		}
		
		
		reajuste = ((antigoSal*percentual)/100);
		novoSal = (antigoSal + reajuste);
		
		
		System.out.println("	Função:		"+ funcao);
		System.out.println(" 	Percentual:	" + percentual + "%");
		System.out.println("	Salário antigo:	R$" + antigoSal);
		System.out.println("	Reajuste:	R$" + reajuste);
		System.out.println("	Salário novo:	R$" + novoSal);
		
		
		
	}

}
