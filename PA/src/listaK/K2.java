package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Desenvolva um programa para uma empresa fazer um pesquisa de mercado para
		 saber se as pessoas gostaram ou não de um novo produto lançado no mercado.
		 Para isso, o programa deverá solicitar o sexo do entrevistado e sua resposta (sim ou não).
		 O programa deverá realizar a pesquisa até que a entrada de dados seja finalizada 
		 através da variável RESP. Ao final o programa deverá apresentar os seguintes resultados:
		- O total de pessoas que responderam sim;
		- O total de pessoas que foram entrevistadas;
		- A porcentagem de pessoas do sexo feminino que responderam não;
		- A porcentagem de pessoas do sexo masculino que responderam sim. 
		 */
		
		
		float masculinoTotal=0, sexoMasculino=0, femininoTotal=0, sexoFeminino=0, totalPessoa=0, gostou=0, naoGostou=0;
		int resp = 0, sexo, pesquisa;
		Scanner leia = new Scanner (System.in);
		
		do {
			pesquisa = JOptionPane.showConfirmDialog(null, "Gostou do produto?", "ENTRADA", JOptionPane.YES_NO_OPTION);
			String opcoes[] = {"masculino", "feminino"};
			sexo = JOptionPane.showOptionDialog(null, "Sexo", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			
			totalPessoa++;
			
			if (pesquisa == 0) {
				gostou++;
				if (sexo == 0) {
					sexoMasculino++;
				}
			}	
			if (pesquisa == 1) {
				naoGostou++;
				if (sexo == 1) {
					sexoFeminino++;
				}
			}
			if (sexo == 0) {
				masculinoTotal++;
			}
			if (sexo == 1) {
				femininoTotal++;
			}
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		} while (resp == 0);
		
		
		
		sexoFeminino  = ((sexoFeminino*100)/femininoTotal);
		sexoMasculino = ((sexoMasculino*100)/masculinoTotal);
		
		JOptionPane.showMessageDialog(null, "Total de pessoas que responderam: " +totalPessoa
				+"\nTotal de pessoas que Gostaram: " + gostou
				+"\nPorcentagem de mulheres que não gostaram: "+sexoFeminino+"%"
				+"\nPorcentagem de Homens que gostaram: "+sexoMasculino+"%"
				, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			
	}
}
