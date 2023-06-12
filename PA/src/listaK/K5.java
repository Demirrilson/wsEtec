package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] opSexo = {"masculino","feminino"};
		String[] nomeRegiao = {"Norte","Sul","Leste","Oeste","Centro"};
		int resp = 0, sexo, regiao;
		int masculinoCentro=0,masculinoLeste=0,masculinoMenor=0,mascMenorNorte=0,masculinoTotal=0;
		int femininoTotal=0,femininoMaior=0,codigo=0,idade=0;
		float perFemininoOeste=0,perFemininoNorte=0,perFemininoSul=0,perFemMaiorOeste=0,perFemininoCentro=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		do {
			codigo = JOptionPane.showOptionDialog(null, "Qual região de São Paulo você mora:", "REGIÂO", 0, JOptionPane.QUESTION_MESSAGE, null, nomeRegiao, nomeRegiao[0]);
		
			idade  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:", "ENTRADA", JOptionPane.QUESTION_MESSAGE));
			
			sexo = JOptionPane.showOptionDialog(null, "Qual se sexo?", "SEXO", 0, JOptionPane.QUESTION_MESSAGE, null, opSexo, opSexo[0]);
			
			
			if (sexo == 0) {
				masculinoTotal++;
				if (codigo == 1) {
					masculinoCentro++;
				}
				if (codigo == 4) {
					masculinoLeste++;
				}
				if (idade<18) {
					masculinoMenor++;
					if (codigo == 2) {
						mascMenorNorte++;
					}
				}
			}
			if (sexo == 1) {
				femininoTotal++;
				if (codigo == 5) {
					perFemininoOeste++;
				}
				if (codigo == 2) {
					perFemininoNorte++;
				}
				if (codigo == 3) {
					perFemininoSul++;
				}
				if (codigo == 1) {
					perFemininoCentro++;
				}
				if (idade >=18) {
					femininoMaior++;
					if (codigo == 5) {
						perFemMaiorOeste++;
					}
				}
			}
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		
	} while (resp == 0);
		
		
		
		perFemininoOeste = ((perFemininoOeste*100)/femininoTotal);
		perFemininoNorte = ((perFemininoNorte*100)/femininoTotal);
		perFemininoSul = ((perFemininoSul*100)/femininoTotal);
		perFemininoCentro = ((perFemininoCentro*100)/femininoTotal);
		perFemMaiorOeste = ((perFemMaiorOeste*100)/femininoMaior);
		
		
		JOptionPane.showMessageDialog(null,
				"O total de homens que residem nas Zonas Leste e Central:"+"\nLeste: "
						+masculinoLeste+"\nCentro: "+masculinoCentro
				 +"\n O percentual de mulheres que residem nas Zonas Oeste, Norte e Sul:"
							+ "\nOeste: "+perFemininoOeste + "%"
							+"\nNorte: "+perFemininoNorte + "%"
							+"\nSul: "+perFemininoSul + "%"
				 +"\nO total de homens menores de idade (menores de 18) que residem na Zona Norte da cidade: "+mascMenorNorte
				 +"\nO percentual de mulheres maiores de idade (maiores de 18) que residem na Zona Oeste da cidade: "+perFemMaiorOeste
				 + "\nO percentual de mulheres que residem na Zona Central da cidade: "+perFemininoOeste
				 , "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
		
	}

}
