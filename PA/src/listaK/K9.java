package listaK;

import javax.swing.JOptionPane;

public class K9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FERRARI, PORSCHE e MERCEDES.
		String[] listaCarros = {"Ferrari","Porsche","Mercedes"};
		String  lugar1=null, lugar2=null,lugar3=null,empate1=null, empate2=" ";
		int resp, voto;
		float votoTotal=0, ferrari=0, porsche=0,mercedes=0;
						
		do{
			voto =JOptionPane.showOptionDialog(null, "Digite o Código do Carro escolhido:", "PESQUISA", 0, 
    				JOptionPane.QUESTION_MESSAGE, null, listaCarros, listaCarros[1]); 
			if (voto == 0) {
				ferrari++;
			}
			if (voto == 1) {
				porsche++;
			}			
			if (voto == 2) {
				mercedes++;
			}
			
			votoTotal++;
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
			
		}while(resp==0);
		
		if ((ferrari > porsche)&&(ferrari > mercedes)) {
			lugar1 = "FERRARI";
			if (porsche>mercedes) {
				lugar2 = "PORSCHE";
				lugar3 = "MERCEDES";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (mercedes>porsche) {
				lugar2 = "MERCEDES";
				lugar3 = "PORSCHE";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(mercedes == porsche) {
				empate2 ="MERCEDES e PORSCHE";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEmpate em 2° lugar " + empate2
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}			
		}
		
		if ((porsche > ferrari)&&(porsche > mercedes)) {
			lugar1 = "PORSCHE";
			if (ferrari>mercedes) {
				lugar2 = "FERRARI";
				lugar3 = "MERCEDES";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (mercedes>ferrari) {
				lugar2 = "MERCEDES";
				lugar3 = "FERRARI";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(ferrari == mercedes) {
				empate2 ="FERRARI e MERCEDES";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEmpate em 2° lugar " + empate2
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
		}
		if ((mercedes > porsche)&&(mercedes > ferrari)) {
			lugar1 = "MERCEDES";
			if (ferrari>porsche) {
				lugar2 = "FERRARI";
				lugar3 = "PORSCHE";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (porsche>ferrari) {
				lugar2 = "PORSCHE";
				lugar3 = "FERRARI";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(ferrari == porsche) {
				empate2 ="FERRARI e PORSCHE";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEmpate em 2° lugar " + empate2
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}	
		}
		
				
		if ((ferrari == porsche)&&(ferrari > mercedes)) {
			empate1 = "FERRARI e PORSCHE";
			lugar3 = "MERCEDES";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					+"\nEm 3° lugar " + lugar3
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((ferrari == mercedes)&&(ferrari > porsche)) {
			empate1 = "FERRARI e MERCEDES";
			lugar3 = "PORSCHE";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					+"\nEm 3° lugar " + lugar3
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((porsche == mercedes)&&(porsche > ferrari)) {
			empate1 = "MERCEDES e PORSCHE";
			lugar3 = "FERRARI";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					+"\nEm 3° lugar " + lugar3
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((porsche == mercedes)&&(porsche == ferrari)) {
			empate1 = "MERCEDES, PORSCHE e FERRARI";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		JOptionPane.showMessageDialog(null,
				"O total de votos foi: "+votoTotal
				, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
		ferrari = ((ferrari*100)/votoTotal);
		porsche = ((porsche*100)/votoTotal);
		mercedes = ((mercedes*100)/votoTotal);
		
		JOptionPane.showMessageDialog(null,
				"O percentual de votos em FERRARI é de "+ferrari+"%"
				+"\nO percentual de votos em PORSCHE é de "+porsche+"%"
				+"\nO percentual de votos em MERCEDES é de "+mercedes+"%"
				, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
	}

}
