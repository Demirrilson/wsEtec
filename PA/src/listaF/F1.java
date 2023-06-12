package listaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um programa para auxiliar uma empresa na 
		 * classificação dos funcionários nos departamentos da empresa. 
		 * O programa devera solicitar a cada funcionário o código do 
		 * departamento em que ele deverá trabalhar e apresentar ao funcionário 
		 * a descrição do departamento correspondente ao código indicado.
		 * 
			Código 		Departamento
			10 			Contabilidade
			12 			Almoxarifado
			14 			Informática
		 **/
		
		float cod = 0;
		String departamento =null;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o código referente ao seu departamento:");
		cod = leia.nextFloat();
		
		if (cod == 10) {
			departamento = "Contabilidade";
		}
		else if (cod == 12) {
			departamento = "Almoxarifado";
		}
		else if (cod == 14) {
			departamento = "Informática";
		}
		else {
			departamento = "Codigo invalido";
		}
		
		System.out.println("O código: " +cod+ " é referente ao departamento: " + departamento);
		
	}
	

}
