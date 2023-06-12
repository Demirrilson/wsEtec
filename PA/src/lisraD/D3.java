package lisraD;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Desenvolva um programa para auxiliar uma empresa na classificação dos funcionários nos departamentos da empresa.
		 *  O programa devera solicitar a cada funcionário o código do departamento em que ele deverá trabalhar e 
		 *  apresentar ao funcionário a descrição do departamento correspondente ao código indicado.
		 *  
			Código 			Departamento
				1 			Expedição
				2 			Recursos Humanos
				3 			Logística
				4 			Contabilidade
		  */
		
		String cod, dep;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Código                 Departamento \n");
		System.out.println("1 			Expedição\r\n"
				+ "2 			Recursos Humanos\r\n"
				+ "3 			Logística\r\n"
				+ "4 			Contabilidade \r\n");
		
		System.out.println("Digite o código do seu departamento:");
		cod = leia.next();
		
		switch (cod) {
		case "1": dep = "Expedição";
			break;
		case "2": dep = "Recursos Humanos";
			break;
		case "3": dep = "Logística";
			break;
		case "4": dep = "Contabilidade";
			break;	
		default: dep = "Código Invalido";	
		}
		System.out.println("O código " +cod+" é referente ao departamento "+ dep);

	}

}
