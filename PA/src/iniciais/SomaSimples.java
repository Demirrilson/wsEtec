package iniciais;

import java.util.Scanner;

public class SomaSimples {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Programa para soma de dois numeros com entrada do usuario */
		
		int n1, n2, res;
		Scanner leia = new Scanner(System.in); //Declaração do Scanner para entrada do usuario
		
		System.out.println("Digite o primeiro valor inteiro: ");
		n1 = leia.nextInt(); // LEIA - Entrada de dados
		
		System.out.print("Digite o segundo valor inteiro: ");
		n2 = leia.nextInt();
		
		res = (n1 + n2); //PROCESSAMENTO - Atribuição das entradas a "res"
		
		System.out.println("O valor somado é " + res + "!");
		
		

	}

}
