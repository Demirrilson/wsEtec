package listaF;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um programa para ler quatro valores referentes a 
		 * quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o 
		 * aluno foi aprovado, se o valor da média escolar for maior ou igual a 5.
		 * Se o aluno não foi aprovado, indicar uma mensagem informando esta condição.
		 * Apresentar junto com a mensagem o valor da média do aluno para qualquer condição.
		 */
		float media, nota1, nota2, nota3, nota4;
		String situacao;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a 1ª nota:");
		nota1 = leia.nextFloat ();
		System.out.println("Digite a 2ª nota:");
		nota2 = leia.nextFloat ();
		System.out.println("Digite a 3ª nota:");
		nota3 = leia.nextFloat ();
		System.out.println("Digite a 4ª nota:");
		nota4 = leia.nextFloat ();
		
		media = ((nota1+nota2+nota3+nota4)/4);
		
		if (media >=5) {
			situacao = "Aprovado";
		}
		else
			situacao = "Reprovado";
		
		System.out.println("Aluno(a) esta " + situacao + " com media de : " + media);

	}

}
