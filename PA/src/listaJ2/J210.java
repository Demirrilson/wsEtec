package listaJ2;

import javax.swing.JOptionPane;

public class J210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  lugar1=null, lugar2=null,lugar3=null,empate1=null, empate2=" ";
		String[] listaCarros= {" Corsa "," Palio ","  Gol  "};
		int resp = 0, voto;
		float votoTotal=0, corsa=0, palio=0,gol=0;		
		
		while(resp == 0) {
			voto =JOptionPane.showOptionDialog(null, "Digite o Código do Carro escolhido:", "PESQUISA", 0, 
		    				JOptionPane.QUESTION_MESSAGE, null, listaCarros, listaCarros[0]); 
			if (voto == 0) {
				corsa++;
			}
			if (voto == 1) {
				palio++;
			}			
			if (voto == 2) {
				gol++;
			}
			
			votoTotal++;
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		}
		
		if ((corsa > palio)&&(corsa > gol)) {
			lugar1 = "Corsa";
			if (palio>gol) {
				lugar2 = "Palio";
				lugar3 = "Gol";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEm 2° lugar " + lugar2
							+"\nEm 3° lugar " + lugar3
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (gol>palio) {
				lugar2 = "Gol";
				lugar3 = "Palio";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEm 2° lugar " + lugar2
							+"\nEm 3° lugar " + lugar3
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(gol == palio) {
				empate2 ="Gol e Palio";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEmpate em 2° lugar " + empate2
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}			
		}
		
		if ((palio > corsa)&&(palio > gol)) {
			lugar1 = "Palio";
			if (corsa>gol) {
				lugar2 = "Corsa";
				lugar3 = "Gol";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEm 2° lugar " + lugar2
							+"\nEm 3° lugar " + lugar3
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (gol>corsa) {
				lugar2 = "Gol";
				lugar3 = "Corsa";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEm 2° lugar " + lugar2
							+"\nEm 3° lugar " + lugar3
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(corsa == gol) {
				empate2 ="Corsa e Gol";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEmpate em 2° lugar " + empate2
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
		}
		if ((gol > palio)&&(gol > corsa)) {
			lugar1 = "Gol";
			if (corsa>palio) {
				lugar2 = "Corsa";
				lugar3 = "Palio";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEm 2° lugar " + lugar2
							+"\nEm 3° lugar " + lugar3
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (palio>corsa) {
				lugar2 = "Palio";
				lugar3 = "Corsa";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEm 2° lugar " + lugar2
							+"\nEm 3° lugar " + lugar3
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(corsa == palio) {
				empate2 ="Corsa e Palio";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEmpate em 2° lugar " + empate2
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}	
		}
		
				
		if ((corsa == palio)&&(corsa > gol)) {
			empate1 = "Corsa e Palio";
			lugar3 = "Gol";
			JOptionPane.showMessageDialog(null,
						"Empate em 1° lugar " + empate1
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((corsa == gol)&&(corsa > palio)) {
			empate1 = "Corsa e Gol";
			lugar3 = "Palio";
			JOptionPane.showMessageDialog(null,
						"Empate em 1° lugar " + empate1
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((palio == gol)&&(palio > corsa)) {
			empate1 = "Gol e Palio";
			lugar3 = "Corsa";
			JOptionPane.showMessageDialog(null,
						"Empate em 1° lugar " + empate1
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((palio == gol)&&(palio == corsa)) {
			empate1 = "Corsa, Palio e Gol";
			JOptionPane.showMessageDialog(null,
						"Empate em 1° lugar " + empate1
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		JOptionPane.showMessageDialog(null,
					"O total de votos foi: "+votoTotal
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
		corsa = ((corsa*100)/votoTotal);
		palio = ((palio*100)/votoTotal);
		gol = ((gol*100)/votoTotal);
		
		System.out.println();
		System.out.println();
		System.out.println();
		JOptionPane.showMessageDialog(null,
					"O percentual de votos no Corsa é de "+corsa+"%"
					+"\nO percentual de votos no Palio é de "+palio+"%"
					+"\nO percentual de votos no Gol é de "+gol+"%"
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
	}

}
