package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] candidatos = {"Ricardo Teixeira", "Paulo Falcão", "Nulo"}; 
		String eleito=null;
		int voto, resp = 0;
		float votoRT=0, votoPF=0,votoNulo=0, votoTotal=0;

		Scanner leia = new Scanner (System.in);
		
	
		
		do {
			
			voto =JOptionPane.showOptionDialog(null, "Votação para escolha do novo presidente ", "VOTAÇÂO", 0, 
		    		JOptionPane.QUESTION_MESSAGE, null, candidatos, candidatos[0]);
			
			votoTotal++;
			
			if (voto == 0) {
				votoRT++;
			}
			if (voto == 1) {
				votoPF++;
			}
			if ((voto != 1)&&(voto != 0)) {
				votoNulo++;
			}
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		
		}while(resp == 0);
		
		
		JOptionPane.showMessageDialog(null,"Fim da votação!!!!"
				 , "FIM", JOptionPane.PLAIN_MESSAGE);
		
		
		if (votoPF == votoRT) {

			JOptionPane.showMessageDialog(null,"EMPATE \n"
					+ "Voto de Desempate"
					 , "EMPATE", JOptionPane.PLAIN_MESSAGE);
			
			 String[] candidatos2 = {"Ricardo Teixeira", "Paulo Falcão"};
			 
			voto =JOptionPane.showOptionDialog(null, "Votação para escolha do novo presidente ", "DESEMPATE", 0, 
		    		JOptionPane.QUESTION_MESSAGE, null, candidatos2, candidatos2[0]);
			votoTotal++;
			if (voto == 0) {
				votoRT++;
			}
			if (voto == 1) {
				votoPF++;
			}
			if ((voto != 1)&&(voto != 0)) {
				votoNulo++;
			}
		}
		if (votoRT > votoPF) {
			eleito ="Ricardo Teixeira";
		}
		if (votoPF > votoRT) {
			eleito = "Paulo Falcão";
		}
		
		
		
		JOptionPane.showMessageDialog(null," -------Nosso novo Presidente é o Sr. "+eleito+", parabéns!!!--------"
				 , "Resultado da  Votação", JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"Total de votos: " + votoTotal
					+"\nVotos do Ricardo Teixeira: " + votoRT
					+"\nVotos do Paulo Falcão: " + votoPF
					+"\nVotos Nulos: " + votoNulo
					, "Resultado da  Votação", JOptionPane.PLAIN_MESSAGE);
		
		
		votoPF = ((votoPF*100)/votoTotal);
		votoRT = ((votoRT*100)/votoTotal);
		
		JOptionPane.showMessageDialog(null,"Percentual do votos: \n\n"
				+votoRT+"% votaram no Ricardo Teixeira\n"
				+votoPF+"% votaram no Paulo Falcão"
				, "Resultado da Votação", JOptionPane.PLAIN_MESSAGE);

		
		
		

	}

}
