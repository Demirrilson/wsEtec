package listaK;

import javax.swing.JOptionPane;

public class K11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int contador, x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para o calculo:"
				, "Calculo de Fatorial", JOptionPane.QUESTION_MESSAGE));

		
		contador = x;
		double fat = x;
		do {
			contador--;
			 fat = fat*contador;
		}while(contador > 1);
		JOptionPane.showMessageDialog(null,
				"O fatorial de " +x+"! é igual a "+fat
				, "Resultado do Calculo", JOptionPane.PLAIN_MESSAGE);
	}

}
