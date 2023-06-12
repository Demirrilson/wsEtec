package listaA;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Faça um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem,
		 *  utilizando um automóvel que faz 12Km por litro.
 			Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem 
 			e a velocidade média durante ela. 
			Desta forma, será possível obter a distância percorrida com a 
			fórmula DISTANCIA = TEMPO * VELOCIDADE. 
			Tendo o valor da distância, basta calcular a quantidade de litros de combustível 
			utilizada na viagem com a
			fórmula: LITROS_USADOS = DISTANCIA / 12. 
			O programa deve apresentar os valores da velocidade média, 
			tempo gasto na viagem, a distância percorrida 
			e a quantidade de litros utilizada na viagem.*/
		
		float litrosUsados, distancia, tempoViagem, velMedia, rendimento;
		rendimento = 12;
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Programa para Calculo de Autonomia de um Veiculo");
		System.out.println("Digite o tempo que levou e viagem (Horas):");
		tempoViagem = valor.nextFloat();
		System.out.println("Digite a Velocidade média do veiculo (KM):");
		velMedia = valor.nextFloat();
		
		distancia = (tempoViagem * velMedia);
		litrosUsados = (distancia / rendimento);
		
		System.out.println("Para uma velocidade média de " + velMedia + "Km/h" + " e um tempo de " + tempoViagem + "h");
		System.out.println("\n A distância percorrida foi de " + distancia + "Km");
		System.out.println("A quatidade de combustivel gasto foi de " + litrosUsados +"L");
		
		
		
		
		
		
	}

}
