package listaA;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Desenvolva um programa para calcular o salário
		líquido de um funcionário a partir do seu salário bruto. 
		 * O programa deverá realizar os seguintes passos:
		- Estabelecer a leitura da variável HT (horas trabalhadas no mês);
		- Estabelecer a leitura da variável VH (valor da hora trabalhada);
		- Estabelecer a leitura da variável PD (percentual de desconto);
		- Calcular o salário bruto (SB), sendo este a multiplicação das variáveis HT e VH;
		- Calcular o total de desconto (TD) com base no valor de PD dividido por 100 e multiplicado pelo SB;
		- Calcular o salário líquido (SL), deduzindo o desconto total do salário bruto (SB – TD);
		Apresentar os valores dos salários bruto e líquido, além do desconto total: SB, TD e SL.*/

		
		
		float horasTrab, valorHoraTrab, percDesconto, salBruto, totalDesc, salLiquido;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Calculo Salarial");
		
		System.out.println("Digite as horas trabalhadas no mês:");
		horasTrab = valor.nextFloat();
		System.out.println("Digite o valor hora:");
		System.out.print("R$");
		valorHoraTrab = valor.nextFloat();
		System.out.println("Digite o Percentual de Desconto do salário em %:");
		percDesconto = valor.nextFloat();
		
		salBruto = (horasTrab * valorHoraTrab);
		totalDesc = ((salBruto/100) * percDesconto);
		salLiquido = (salBruto - totalDesc);
		
		System.out.println("O salário Bruto é R$" + salBruto);
		System.out.println("O salário líquido é R$" + salLiquido);
		System.out.printf("O valor do Desconto é R$" + totalDesc);
		
	}

}
