package udemyJava;

import java.util.Scanner;

public class Secao04Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero =0, dn1=0, dn2=0, dn3=0, dn4=0, dn5=0, dn6=0, soma=0, resulNumero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro maior que zero para soma dos algarismos");
		numero = teclado.nextInt();
		resulNumero = numero;
		if (numero>0&& numero<=999999) {

			if (numero>10) {
				dn2 = numero%10;
				numero = numero/10;
			}
			if (numero>10) {
				dn3 = numero%10;
				numero = numero/10;
			}
			if (numero>10) {
				dn4 = numero%10;
				numero = numero/10;
			}
			if (numero>10) {
				dn5 = numero%10;
				numero = numero/10;
			}
			if (numero>10) {
				dn6 = numero%10;
				numero = numero/10;
			}
			dn1 = numero%10;
			
			soma=dn1+dn2+dn3+dn4+dn5+dn6;
			System.out.println("A soma dos algarismos do numero: "+resulNumero+" é: "+soma);
			
		}
		else {
			System.out.println("Numero Invalido");
			
			teclado.close();
		}
		
		

	}

}
