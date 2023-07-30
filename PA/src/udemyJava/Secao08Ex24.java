package udemyJava;

import java.util.Scanner;

public class Secao08Ex24 {

	public static void main(String[] args) {
		int h;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a altura do triangulo:");
		h = teclado.nextInt();
		
		System.out.println(triangulo(h));
		
		teclado.close();
	}

	private static String triangulo(int h) {
	
		int elemento=1;
		int espaco =(h-1);
		String tri="";
		
		for (int i = 0; i <h; i++) {
			
			for (int j = 0; j <=espaco; j++) {
				tri+=" ";
			}
			for (int j = 0; j < elemento; j++) {
				tri+="*";
			}
			espaco--;
			elemento = elemento+2;
			tri+="\n";
		}

		return tri;
	
	}

}
