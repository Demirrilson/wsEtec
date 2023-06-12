package listaJ2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class J29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  lugar1=null, lugar2=null,lugar3=null,empate1=null, empate2=" ";
		String[] cursos = {"Ciência da Computação","Direito","Letras"};
		int resp=0, voto;
		float votoTotal=0, cursoCC=0, cursoD=0,cursoL=0;
		
		Scanner leia = new Scanner (System.in);
		

		while(resp == 0) {
			//System.out.println("Digite o Código do curso escolhido:");
			voto =JOptionPane.showOptionDialog(null, "Digite o Código do curso escolhido:", "PESQUISA", 0, 
		    		JOptionPane.QUESTION_MESSAGE, null, cursos, cursos[0]); 
			if (voto == 0) {
				cursoCC++;
			}
			if (voto == 1) {
				cursoD++;
			}			
			if (voto == 2) {
				cursoL++;
			}
			votoTotal++;
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		}
		
		if ((cursoCC > cursoD)&&(cursoCC > cursoL)) {
			lugar1 = "Ciência da Computação";
			if (cursoD>cursoL) {
				lugar2 = "Direito";
				lugar3 = "Letras";
				JOptionPane.showMessageDialog(null,
							"Em 1° lugar " + lugar1
							+"\nEm 2° lugar " + lugar2
							+"\nEm 3° lugar " + lugar3
							, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (cursoL>cursoD) {
				lugar2 = "Letras";
				lugar3 = "Direito";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(cursoL == cursoD) {
				empate2 ="Letras e Direito";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEmpate em 2° lugar " + empate2
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
				
			}			
		}
		
		if ((cursoD > cursoCC)&&(cursoD > cursoL)) {
			lugar1 = "Direito";
			if (cursoCC>cursoL) {
				lugar2 = "Ciência da Computação";
				lugar3 = "Letras";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (cursoL>cursoCC) {
				lugar2 = "Letras";
				lugar3 = "Ciência da Computação";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(cursoCC == cursoL) {
				empate2 ="Ciência da Computação e Letras";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEmpate em 2° lugar " + empate2
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
		}
		if ((cursoL > cursoD)&&(cursoL > cursoCC)) {
			lugar1 = "Letras";
			if (cursoCC>cursoD) {
				lugar2 = "Ciência da Computação";
				lugar3 = "Direito";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if (cursoD>cursoCC) {
				lugar2 = "Direito";
				lugar3 = "Ciência da Computação";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEm 2° lugar " + lugar2
						+"\nEm 3° lugar " + lugar3
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}
			if(cursoCC == cursoD) {
				empate2 ="Ciência da Computação e Direito";
				lugar2 = "";
				lugar3 = "";
				JOptionPane.showMessageDialog(null,
						"Em 1° lugar " + lugar1
						+"\nEmpate em 2° lugar " + empate2
						, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			}	
		}
		
				
		if ((cursoCC == cursoD)&&(cursoCC > cursoL)) {
			empate1 = "Ciência da Computação e Direito";
			lugar3 = "Letras";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					+"\nEm 3° lugar " + lugar3
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
			
		}
		if ((cursoCC == cursoL)&&(cursoCC > cursoD)) {
			empate1 = "Ciência da Computação e Letras";
			lugar3 = "Direito";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					+"\nEm 3° lugar " + lugar3
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((cursoD == cursoL)&&(cursoD > cursoCC)) {
			empate1 = "Letras e Direito";
			lugar3 = "Ciência da Computação";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					+"\nEm 3° lugar " + lugar3
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		if ((cursoD == cursoL)&&(cursoD == cursoCC)) {
			empate1 = "Letras, Direito e Ciência da Computação";
			JOptionPane.showMessageDialog(null,
					"Empate em 1° lugar " + empate1
					, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		}
		
		JOptionPane.showMessageDialog(null,
				"O total de votos foi: "+votoTotal
				, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
		cursoCC = ((cursoCC*100)/votoTotal);
		cursoD = ((cursoD*100)/votoTotal);
		cursoL = ((cursoL*100)/votoTotal);
		
		JOptionPane.showMessageDialog(null,
				"O percentual de votos em Ciência da Computação é de "+cursoCC+"%"
				+"\nO percentual de votos em Direito é de "+cursoD+"%"
				+"\nO percentual de votos em Letras é de "+cursoL+"%"
				, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
		
	}

}
