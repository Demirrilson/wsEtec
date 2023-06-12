package listaK;

import javax.swing.JOptionPane;

public class K8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Medicina
		//Psicologia
		//Engenharia Elétrica
		String  lugar1=null, lugar2=null,lugar3=null,empate1=null, empate2=" ";
		String [] cursos = {"Engenharia Elétrica", "Psicologia", "Medicina"};
		int resp, voto;
		float votoTotal=0, cursoEE=0, cursoM=0,cursoP=0;
				
		do {
			voto =JOptionPane.showOptionDialog(null, "Digite o Código do curso escolhido:", "PESQUISA", 0, 
		    				JOptionPane.QUESTION_MESSAGE, null, cursos, cursos[0]); 
			
			if (voto == 0) {
				cursoEE++;
			}
			if (voto == 1) {
				cursoM++;
			}			
			if (voto == 2) {
				cursoP++;
			}
			
			votoTotal++;
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
			
		}while(resp == 0);
				
		if ((cursoEE > cursoM)&&(cursoEE > cursoP)) {
			lugar1 = "Engenharia Elétrica";
			if (cursoM>cursoP) {
				lugar2 = "Medicina";
				lugar3 = "Psicologia";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (cursoP>cursoM) {
				lugar2 = "Psicologia";
				lugar3 = "Medicina";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(cursoP == cursoM) {
				empate2 ="Psicologia e Medicina";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEmpate em 2° lugar " + empate2
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}			
		}
		
		if ((cursoM > cursoEE)&&(cursoM > cursoP)) {
			lugar1 = "Medicina";
			if (cursoEE>cursoP) {
				lugar2 = "Engenharia Elétrica";
				lugar3 = "Psicologia";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (cursoP>cursoEE) {
				lugar2 = "Psicologia";
				lugar3 = "Engenharia Elétrica";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(cursoEE == cursoP) {
				empate2 ="Engenharia Elétrica e Psicologia";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEmpate em 2° lugar " + empate2
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
		}
		if ((cursoP > cursoM)&&(cursoP > cursoEE)) {
			lugar1 = "Psicologia";
			if (cursoEE>cursoM) {
				lugar2 = "Engenharia Elétrica";
				lugar3 = "Medicina";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (cursoM>cursoEE) {
				lugar2 = "Medicina";
				lugar3 = "Engenharia Elétrica";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(cursoEE == cursoM) {
				empate2 ="Engenharia Elétrica e Medicina";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEmpate em 2° lugar " + empate2
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}	
		}		
				
		if ((cursoEE == cursoM)&&(cursoEE > cursoP)) {
			empate1 = "Engenharia Elétrica e Medicina";
			lugar3 = "Psicologia";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					+"\nEm 3° lugar " + lugar3
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((cursoEE == cursoP)&&(cursoEE > cursoM)) {
			empate1 = "Engenharia Elétrica e Psicologia";
			lugar3 = "Medicina";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					+"\nEm 3° lugar " + lugar3
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((cursoM == cursoP)&&(cursoM > cursoEE)) {
			empate1 = "Psicologia e Medicina";
			lugar3 = "Engenharia Elétrica";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					+"\nEm 3° lugar " + lugar3
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((cursoM == cursoP)&&(cursoM == cursoEE)) {
			empate1 = "Psicologia, Medicina e Engenharia Elétrica";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		JOptionPane.showMessageDialog(null,
				"O total de votos foi: "+votoTotal
				, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
		cursoEE = ((cursoEE*100)/votoTotal);
		cursoM = ((cursoM*100)/votoTotal);
		cursoP = ((cursoP*100)/votoTotal);
				
		JOptionPane.showMessageDialog(null,
				"O percentual de votos em Engenharia Elétrica é de "+cursoEE+"%"
				+"\nO percentual de votos em Medicina é de "+cursoM+"%"
				+"\nO percentual de votos em Psicologia é de "+cursoP+"%"
				, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
	}

}
