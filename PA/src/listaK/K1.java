package listaK;

import javax.swing.JOptionPane;

public class K1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Desenvolva um programa para apresentar os números de 
		 1 até 100 em ordem crescente e depois em ordem decrescente. 
		 */
		
		int contador=0,contagem=0;
		JOptionPane.showMessageDialog(null, "Clique para começar a contagem" , "CONTAGEM", JOptionPane.PLAIN_MESSAGE);
		do {
			if (contador<100) {
				contagem++;
				System.out.println( contagem);
			}
			if (contador >100) {
				System.out.println(contagem);
				contagem--;
				
			}
			contador++;
		} while (contador<=200);
		System.out.println("Fim da contagem");
	}

}
