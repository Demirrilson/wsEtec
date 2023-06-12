package listaJ2;

import javax.swing.JOptionPane;

public class J25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resp = 0, gostou, sexo, contGostou = 0, contNGostou = 0, totEntr, contGostFem = 0, contNGostMasc = 0;		
		float pFemG, pMascNG;
		
		
		while(resp==0) {
			gostou = JOptionPane.showConfirmDialog(null, "Gostou do produto?", "ENTRADA", JOptionPane.YES_NO_OPTION);
			String opcoes[] = {"masculino", "feminino"};
			sexo = JOptionPane.showOptionDialog(null, "Sexo", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			if (gostou == 0) {
				contGostou = (contGostou + 1);
				if (sexo == 1) {
					contGostFem++;
				}
				//System.out.println("entrevistado gostou do produto");
			}else {
				contNGostou++;
				if (sexo == 0) {
					contNGostMasc++;
				}
				//System.out.println("entrevistado não gostou do produto");
			}
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		}
		
		System.out.println("Gostaram " + contGostou);
		System.out.println("Não gostaram " + contNGostou);
		totEntr = (contGostou + contNGostou);
		pFemG = ((contGostFem*100)/totEntr);
		pMascNG = ((contNGostMasc*100)/totEntr);
		
		
		System.out.println("Gostaram feminino " + pFemG + " %");
		System.out.println("Não gostaram masculino " + pMascNG + " %");

	}

}
