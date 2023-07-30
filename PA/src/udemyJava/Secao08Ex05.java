package udemyJava;

import java.util.Scanner;

public class Secao08Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raio;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo de volume de uma esfera\n");
		System.out.println("Digite o raio da esfera em cm:");
		raio= teclado.nextDouble();
		
		volume(raio);
		
		
		
		teclado.close();
	}

	private static void volume(double raio) {
		double v,cR,p;
		
		cR =Math.pow(raio,3);
		p = Math.PI;
		v = (4 * (p) * (cR))/3;
		

		System.out.printf("O volume é de: %.2f cm³", v);
	}
}
