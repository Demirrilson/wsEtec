package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		- O número de pessoas do sexo feminino que responderam sim;
		- O número de pessoas do sexo masculino que responderam não;
		- A porcentagem de pessoas do sexo feminino que responderam não;
		- A porcentagem de pessoas do sexo masculino que responderam sim; 
		*/
		String[] sexoOp = {"masculino", "feminino"};
		int sexo,  resp;
		int gostou=0, pesquisa, naoGostou=0, masculinoTotal=0, femininoTotal=0, femininoGostou=0, mascNaoGostou=0;
		float percFemNaoGostou=0, percMascGostou=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		do {
			pesquisa = JOptionPane.showConfirmDialog(null, "Gostou do produto?", "ENTRADA", JOptionPane.YES_NO_OPTION);
			
			sexo  = JOptionPane.showOptionDialog(null, "Sexo", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, sexoOp, sexoOp[0]);
			
			if (sexo == 1) {
				femininoTotal++;
				if (pesquisa == 0) {
					femininoGostou++;
				}
				if (pesquisa == 1) {
					percFemNaoGostou++;
				}
			}
			if (sexo == 0) {
				masculinoTotal++;
				if (pesquisa == 1) {
					mascNaoGostou++;
				}
				if (pesquisa == 0) {
					percMascGostou++;
				}
			}
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		} while (resp == 0);
		
		
		
		percFemNaoGostou = ((percFemNaoGostou*100)/femininoTotal);
		percMascGostou = ((percMascGostou*100)/masculinoTotal);
		
		
		JOptionPane.showMessageDialog(null, "O número de pessoas do sexo feminino que Gostaram: "+femininoGostou
				+"\nO número de pessoas do sexo masculino que Não Gostaram: "+mascNaoGostou
				+"\nA porcentagem de pessoas do sexo feminino que Não Gostaram: "+percFemNaoGostou+"%"
				+"\nA porcentagem de pessoas do sexo masculino que Gostaram: "+percMascGostou+"%"
				, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
		
	}

}
