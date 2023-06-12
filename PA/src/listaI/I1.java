package listaI;

import javax.swing.JOptionPane;

public class I1 {

	public static void main(String[] args) {
		String txtCrescente="", txtDecrescente = "";
		JOptionPane.showMessageDialog(null, "Clique para começar a contagem" , "CONTAGEM", JOptionPane.PLAIN_MESSAGE);
		
		
		for (int i = 1; i <= 100; i++) {
			if (i<10) {
				txtCrescente +="0"+ i + ", ";
			}
			else {
			txtCrescente += i + ", ";
			}
			if (i==25) {
				txtCrescente += "\n";
			} 
			if (i==50) {
				txtCrescente += "\n";
			} 
			if (i==75) {
				txtCrescente += "\n";
			} 
			
		}
		
		
		for (int i = 100; i > 0; i--) {
			if (i<10) {
				txtDecrescente +="0"+ i + ", ";
			}
			else {
			txtDecrescente += i + ", ";
			}
			if (i==26) {
				txtDecrescente += "\n";
			} 
			if (i==51) {
				txtDecrescente += "\n";
			} 
			if (i==76) {
				txtDecrescente += "\n";
			} 
		}
		JOptionPane.showMessageDialog(null,
				"Contagem Crescente\n " +txtCrescente+"\n Contagem Decrescente \n"+txtDecrescente
				, "Resultado do Calculo", JOptionPane.PLAIN_MESSAGE);
		
	

	}

}
