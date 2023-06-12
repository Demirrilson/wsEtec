package listaF;

import java.util.Scanner;

public class F4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *Desenvolva um programa para ler quatro valores referentes a 
		 *quatro notas escolares de um aluno e imprimir uma mensagem 
		 *dizendo que o aluno foi aprovado, se o valor da média escolar 
		 *for maior ou igual a 7. Se o valor da média for menor que 7, 
		 *solicitar a nota de exame, somar com o valor da média e 
		 *obter nova média. Se a nova média for maior ou igual a 5, 
		 *apresentar uma mensagem dizendo que o aluno foi aprovado em exame. 
		 *Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. 
		 *Apresentar junto com as mensagens o valor da média do aluno, para qualquer condição. 
		 */
		
		float nota1, nota2, nota3, nota4, media, exame;
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
		
		if (media >= 7) {
			situacao = "Aprovado";
		}
		else
		{
			System.out.println("digite a nota do exame:");
			exame = leia.nextFloat();
			
			media = ((media + exame)/2);
			
			if (media >= 5) {
				situacao = "Aprovado";
			}
			else
				situacao = "Reprovado";
		}
		
		System.out.println("Aluno(a) esta " + situacao + " com media de : " + media);

	}

}
