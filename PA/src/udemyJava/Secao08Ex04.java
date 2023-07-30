package udemyJava;

import java.util.Scanner;

public class Secao08Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Verificar se um numero inteiro é um quadrado perfeito");
		System.out.println("Digite um numero: ");
		
		num = teclado.nextInt();
		
		verificador(num);

		
		
		teclado.close();
	}
	
	static public void verificador(int num){
		
		double raiz;
		String resultado;
		raiz = Math.sqrt(num);
		int raiz1 =(int) raiz;
		
		if (raiz == raiz1) {
			resultado = " É um quadrado perfeito";
		}
		else {
			resultado = " Não é um quadrado perfeito";
		}
		
		System.out.println("O numero: "+ ""+num+resultado);
	}

}
