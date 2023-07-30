package lojaDeTinta;

import java.util.Scanner;

public class LojaTinta {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double largura, altura;
		double area;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("     Loja de tintas");
		System.out.println("==========================\n\n");
		
		System.out.println("Digite a largura da parede em metros:");
		largura = teclado.nextDouble();
		
		System.out.println("Digite a altura da parede em metros:");
		altura = teclado.nextDouble();
		System.out.println("\n");
		
		area = altura*largura;
		
		quantTinta = rendimento(altura, largura);
		System.out.println("");
		System.out.println("Area da parede: "+area+"M²");
		System.out.println("\n");
		
		System.out.println("A quantidade de latas é: "+ quantidadeLata(quantTinta));
		System.out.println("A quantidade de galões é: "+ quantidadeGalao(quantTinta));
		System.out.println("");
		
		System.out.println("A quantidade total de tinta comprada é de: " + lTinta(quantGalao, quantLata)+"L");
		System.out.printf("A quantidade de tinta utilizada é de: %.2fL ", quantTinta);
		System.out.printf("\nA que sobra de tinta é de: %.2fL" , sobraTinta(litrosTinta));
	
		System.out.println("\n");
		System.out.printf("Valor a pagar nas Galões de 3,6L: R$ %.2f" ,valorGastoGalao(quantGalao));
		System.out.println("");
		System.out.printf("Valor a pagar nas Latas de 18L: R$ %.2f" ,valorGastoLata(quantLata));
		System.out.println("");
		System.out.printf("Valor total a pagar: R$ %.2f" ,valorGastoTotal( valorLata,  valorGalao));
		teclado.close();
	}

	static double quantTinta;
	static int quantLata=0;
	static int quantGalao =0;
	static double sobra=0;
	static int lata=18;
	static double galao = 3.6;
	static double litrosTinta=0;
	static double valorLata=0;
	static double valorGalao=0;
	static double valorTotal=0;
	
	public static Double rendimento(double altura, double largura) {
		double quantidadeTinta=0;
		double area=0;
		
		area = altura * largura;
		quantidadeTinta = (area *1.1)/6;
		
		return quantidadeTinta;
			
	}
	
	public static double quantidadeLata (double quantTinta) {
		
		if (quantTinta>=lata) {		
			quantLata = (int) (quantTinta / lata);
			sobra = (quantTinta % (quantLata*lata));
			if (sobra>10.8) {
				quantLata+=1;
				sobra = (quantTinta % (quantLata*lata));
			}
		}
		return quantLata;
	}
	
	public static double quantidadeGalao(double quantTinta) {	
		
		if (sobra < galao) {
			quantGalao=1;
		}
		if (sobra >= galao) {
			quantGalao = (int) (sobra/galao);
			sobra = (sobra % (quantGalao*galao));
			if (sobra >0.00001) {
				quantGalao+=1;
			}
		}
		return quantGalao; 
	}
	
	public static double lTinta(double quantGalao, double quantLata) {

		
		litrosTinta =(quantGalao*galao)+(quantLata*lata);
		
		return litrosTinta;	
	}
	
	
	public static double sobraTinta(double litrosTinta) {
		double sobraTinta=0;
		
		sobraTinta = litrosTinta - quantTinta;

		return sobraTinta;
	}

	public static double valorGastoLata(int quantLata) {
		double lataValor=80;
		
		valorLata = lataValor * quantLata;
		
		return valorLata;
	}

	public static double valorGastoGalao(int quantGalao) {
		double galaoValor=25;
		
		valorGalao = galaoValor * quantGalao;
		
		return valorGalao;
	}
	
	public static double valorGastoTotal(double valorLata, double valorGalao) {
		
		valorTotal = valorLata + valorGalao;
		
		return valorTotal;
	}

}
