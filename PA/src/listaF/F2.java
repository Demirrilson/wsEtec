package listaF;

import java.util.Scanner;

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um programa para auxiliar uma escolinha de futebol na classificação
		 *  das categorias das equipes de futebol. O programa deverá ler a idade da criança 
		 *  e apresentar o nome da categoria em a criança deve jogar, através da tabela abaixo:
		   
		 
			Idade 					Categoria
			6 à 8 	anos 			Dente de Leite
			9 à 11 	anos 			Pré-Mirim
			12 e 13 anos 			Mirim
			14 e 15 anos 			Infantil
			16 e 17 anos 			Juvenil
			18 à 20 anos 			Juniores
		 */
		
		int idade = 0;
		String categoria = null;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a idade do Jodogador:");
		idade = leia.nextInt();
		
		if ((idade >=6)&&(idade <=8)) {
			categoria = "Dente de Leite";
		}
		else if ((idade >=9)&&(idade <=11)) {
			categoria = "Pré-Mirim";
		}
		else if ((idade >=12)&&(idade <=13)) {
			categoria = "Mirim";
		}
		else if ((idade >=14)&&(idade <=15)) {
			categoria = "Infantil";
		}
		else if ((idade >=16)&&(idade <=17)) {
			categoria = "Juvenil";
		}
		else if ((idade >=18)&&(idade <=20)) {
			categoria = "Juniores";
		}
		else {
			categoria = "Categoria Invalida";
		}
		
		System.out.println("A categoria do Jogador é: " + categoria);
		

	}

}
