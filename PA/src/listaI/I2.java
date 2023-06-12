package listaI;

import javax.swing.JOptionPane;

public class I2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] alfabeto={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String txtCrescente ="", txtDecrescente="";
		
		for (int i = 0; i < alfabeto.length; i++) {
			
			txtCrescente += alfabeto[i]+", ";
		}
		
		for (int i = (alfabeto.length-1); i >=0 ; i--) {
			txtDecrescente += alfabeto[i]+", ";
			
		}
		
		JOptionPane.showMessageDialog(null,
				"Alfabeto ordem: \n Crescente \n"+txtCrescente+
				"\n \n Alfabeto ordem: \n Decrescente \n"+ txtDecrescente 
				, "Alfabeto", JOptionPane.PLAIN_MESSAGE);
		
		
		JOptionPane.showMessageDialog(null,
				"Tamanho da lista \n"+alfabeto.length+"\n"+"Escrito usando os termos da Lista \n"+
				alfabeto[3]+alfabeto[4]+alfabeto[12]+alfabeto[8]+alfabeto[17]+alfabeto[17]+alfabeto[8]+alfabeto
				[11]+alfabeto[18]+alfabeto[14]+alfabeto[13] 
				, "Alfabeto", JOptionPane.PLAIN_MESSAGE);
		
	}

}

