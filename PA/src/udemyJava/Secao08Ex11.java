package udemyJava;

import java.util.Scanner;

public class Secao08Ex11 {

	public static void main(String[] args) {
		double n1,n2,n3;
		String tipoMedia;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo de media do aluno");
		
		System.out.println("Digite a 1ª nota:");
		n1 = teclado.nextDouble();
		
		System.out.println("Digite a 2ª nota:");
		n2 = teclado.nextDouble();
		
		System.out.println("Digite a 3ª nota:");
		n3 = teclado.nextDouble();
		
		System.out.println("Digite --A-- para media aritmetica\n"
				         + "Digite --P-- para media ponderada");
		 tipoMedia = teclado.next();
		
		teclado.close();
		
		mediaNotas(n1, n2, n3, tipoMedia);

	}

	private static void mediaNotas(double n1, double n2, double n3, String tipoMedia) {
		double mediaAr, mediaP;
		if (tipoMedia.equals("a")) {
			
			mediaAr = (n1+n2+n3)/3;
			
			System.out.printf("\n A media Aritmetica é de %.2f ", mediaAr);
		}
		if (tipoMedia.equals("p")) {
			mediaP = ((n1*5)+(n2*3)+(n3*2))/10;
			System.out.printf("\n A media Ponderada é de %.2f ", mediaP);
		}
		
	}

}
