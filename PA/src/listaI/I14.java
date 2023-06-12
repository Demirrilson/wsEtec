package listaI;

import javax.swing.JOptionPane;

public class I14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para o calculo:"
				, "Calculo de Fatorial", JOptionPane.QUESTION_MESSAGE));

		
		double fat = x;
		if (x==0) {
			fat=1;
			
		} else {

		
			for (int i = 1; i < x; i++) {
				
				 fat = fat*i;
			}
		}
		JOptionPane.showMessageDialog(null,
				"O fatorial de " +x+"! é igual a "+fat
				, "Resultado do Calculo", JOptionPane.PLAIN_MESSAGE);

	}

}
