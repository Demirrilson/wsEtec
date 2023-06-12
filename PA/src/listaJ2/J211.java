package listaJ2;

import javax.swing.JOptionPane;

public class J211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int contador, x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para o calculo:"
				, "Calculo de Fatorial", JOptionPane.QUESTION_MESSAGE));

		
		contador = x;
		double fat = x;
		while(contador > 1) {
			contador--;
			 fat = fat*contador;
		}
		JOptionPane.showMessageDialog(null,
				"O fatorial de " +x+"! é igual a "+fat
				, "Resultado do Calculo", JOptionPane.PLAIN_MESSAGE);
	}
}
