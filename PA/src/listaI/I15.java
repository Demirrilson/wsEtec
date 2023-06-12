package listaI;

import javax.swing.JOptionPane;

public class I15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=0, potencia=0, expoente=0;
		
		base = Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite o valor da base para o calculo: \n","Entrada",JOptionPane.QUESTION_MESSAGE));
		expoente = Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite o valor do expoente para o calculo: \n","Entrada",JOptionPane.QUESTION_MESSAGE));
		potencia = base;
		
		if (expoente == 0) {
			potencia =1;
			
		} else {
		for (int i = 0; i < expoente-1; i++) {
			potencia = potencia *base;
			
		}
		}
		JOptionPane.showMessageDialog(null,
				"A potencia de " +base+" com expoente "+expoente+" = "+potencia
				, "Resultado do Calculo", JOptionPane.PLAIN_MESSAGE);
	}

}
