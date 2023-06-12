package listaJ2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class J28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eleito=null;
		String[] candidatos = {"Fujiro Nakombi","Tajaro Né","NULO"};
		int voto, resp=0 ;
		float votoFujiro=0, votoTakaro=0,votoNulo=0, votoTotal=0;

		Scanner leia = new Scanner (System.in);
		
		/*System.out.println("Votação para escolha do novo Gerente \n");
		System.out.println("Vote --- 4 --- para eleger FUJIRO NAKOMBI \n");
		System.out.println("Vote --- 6 --- para eleger TAKARO NÉ \n");*/
		
		while(resp ==0) {
			
			
			voto =JOptionPane.showOptionDialog(null, "Votação para escolha do novo Gerente ", "VOTAÇÂO", 0, 
		    		JOptionPane.QUESTION_MESSAGE, null, candidatos, candidatos[0]);
		    
			
			votoTotal++;
			
			if (voto == 0) {
				votoFujiro++;
			}
			if (voto == 1) {
				votoTakaro++;
			}
			if ((voto != 1)&&(voto != 0)) {
				votoNulo++;
			}
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		
		}
		
		JOptionPane.showMessageDialog(null,"Fim da votação!!!!"
				 , "FIM", JOptionPane.PLAIN_MESSAGE);
		
		if (votoTakaro == votoFujiro) {
			
			JOptionPane.showMessageDialog(null,"EMPATE \n"
					+ "Voto de Desempate"
					 , "EMPATE", JOptionPane.PLAIN_MESSAGE);
			
			 String[] candidatos2 = {"Fujiro Nakombi","Tajaro Né"};
			 
			voto =JOptionPane.showOptionDialog(null, "Votação para escolha do novo Gerente", "DESEMPATE", 0, 
		    		JOptionPane.QUESTION_MESSAGE, null, candidatos2, candidatos2[0]);
			
			votoTotal++;
			if (voto == 0) {
				votoFujiro++;
			}
			if (voto == 1) {
				votoTakaro++;
			}
		}
		if (votoFujiro > votoTakaro) {
			eleito ="Fujiro NaKombi";
		}
		if (votoTakaro > votoFujiro) {
			eleito = "Takaro Né";
		}
		
		JOptionPane.showMessageDialog(null," -------Nosso novo Gerente é o Sr. "+eleito+", parabéns!!!--------"
				 , "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null,"Total de votos: " + votoTotal
					+"\nVotos do Fujiro NaKombi: " + votoFujiro
					+"\nVotos do Takaro Né: " + votoTakaro
					+"\nVotos Nulos: " + votoNulo
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
		votoTakaro = ((votoTakaro*100)/votoTotal);
		votoFujiro = ((votoFujiro*100)/votoTotal);
		
		JOptionPane.showMessageDialog(null,"Percentual do votos: \n\n"
					+votoFujiro+"% votaram no Fujiro NaKombi\n"
					+votoTakaro+"% votaram no Takaro Né"
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);

	}

}
