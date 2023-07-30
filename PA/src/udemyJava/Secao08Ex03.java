package udemyJava;

import java.util.Scanner;

public class Secao08Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero para verificar se ele é + ou -:");
		num = teclado.nextInt();
		System.out.println("Retorno função \n\n"+ verificador(num));
		teclado.close();

	}
	
	static int verificador(int n) {
		int retorno=0;
		if (n<0) {
			retorno = -1;
		}
		if (n>0) {
			retorno = 1;
		}
		
		
		return retorno;
		
	} 

}
