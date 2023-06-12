package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Desenvolva um programa para ler o preço de um produto e calcular
		 *  o preço à vista deste produto com 10% de desconto. 
		 *  O programa deverá realizar os seguintes passos:
		- Estabelecer a leitura da variável PRECO (preço bruto do produto);
		- Calcular o valor do desconto (DESCONTO) dividindo o preço por 100 e 
			multiplicando pelo percentual de desconto ((PRECO/100)*10).
		- Calcular o preço do produto à vista (PRECO_VISTA), 
			descontando o valor do desconto do preço bruto do produto (PRECO - DESCONTO).
			Apresentar os valores do preço bruto e do preço à vista, além do desconto:
 			PRECO, DESCONTO e PRECO_VISTA.*/

		float preco, desconto, precoAvista;
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Digite o Preço do produto");
		System.out.print("R$");
		preco = valor.nextFloat();
		
		desconto = ((preco/100)*10);
		precoAvista = (preco - desconto);
		
		System.out.println("O preço bruto do produto é de R$" + preco);
		System.out.println("O valor do desconto de 10% para esse preço é de R$" + desconto);
		System.out.println("O valor do produto com o desconto \n para pagamento à vista é de R$" + precoAvista);
		
		
		
		
		
		
		
	}

}
