package udemyJava;

import java.util.Scanner;

public class Secao08Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=0, b=0, c=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("\n Verificação de Triângulos \n\n");
		do {
			System.out.println("Digite o valor do 1º lado:");
			a = teclado.nextDouble();
		} while (a<1);
		do {
			System.out.println("Digite o valor do 2º lado:");
			b = teclado.nextDouble();
		} while (b<1);
		do {
			System.out.println("Digite o valor do 3º lado:");
			c = teclado.nextDouble();
		} while (c<1);
		
		System.out.println(a+"-"+b+"-"+c);
		
		teclado.close();
		
		if (verificarLados(a, b, c)==true) {
			System.out.println(" Os valores digitados correspondem a um triângulo "+tipoTriangulo(a, b, c));
		}
		if (verificarLados(a, b, c)==false) {
			System.out.println("Valores invalidos \nNão correspondem a um triângulo");
		}

	}

	private static String tipoTriangulo(double a, double b, double c) {
		if ((a==b) && (a==c)) {
			return "Equilátero";
		}
		if ((a==b)||(a==c)||(b==c)) {
			return "Isósceles";
		}
		
		else {
			return "Escaleno";
		}
		
		
	}

	private static Boolean verificarLados(double a, double b, double c) {
		int verificador=0;
		
		if (a>(b+c)) {
			verificador=1;
		}
		if (b>(a+c)) {
			verificador=1;
		}
		if (c>(b+a)) {
			verificador=1;
		}
		if (verificador == 1) {
			
			return false;
		}
		else {
		return (Boolean) true;
		}
		
	}

}
