package listaJ;

import java.util.Scanner;

public class J11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fat, contador, x;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("====Calculo de Fatorial====\n");
		System.out.println("Digite um número para o calculo:");
		x = leia.nextInt();
		
		contador = x;
		fat = x;
		while(contador > 1) {
			contador--;
			fat = fat*contador;
		}
		
		System.out.println("O fatorial de " +x+"! é igual a "+fat);
	}

}
