package lisraD;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desenvolva um programa para efetuar a leitura de três valores (A, B e C) 
		 * e apresentar os valores dispostos em ordem crescente.
		 * */
		
		Float teste, a, b, c, vMenor, vMedio, vMaior;
		Scanner leia = new Scanner (System.in);
		
		vMaior = (float)0;
		vMedio = (float)0;
		vMenor = (float)0;
		
		System.out.println("Digite o 1º valor:");
		a = leia.nextFloat();
		System.out.println("Digite o 2º valor:");
		b = leia.nextFloat();
		System.out.println("Digite o 3º valor:");
		c = leia.nextFloat();
		
		teste =(float) 77;
		vMaior = a;//4
		vMedio = b;//2
		vMenor = c;//4
		
		if (b>vMaior) {
			vMaior = b;
		}
		if (c>vMaior) {
			vMaior = c;
		}
		
		if (a<vMenor) {
			vMenor = a;
		}
		if (b<vMenor) {
			vMenor = b;
		}
		
		if ((a < vMaior)&&(a>vMenor)) {
				vMedio = a;
			}
		if ((c < vMaior)&&(c>vMenor)) {
				vMedio = c;
		}
			
		 if (a == c){
			if ((a <= vMaior)) {
				vMedio = teste;
			}
			if ((c <= vMaior)&&(c >= vMenor)) {
				vMedio = teste ;
		}}
		
		System.out.println("Os valores em ordem são: " + vMenor + ", " + vMedio + " e " + vMaior + "!");
	}

}
