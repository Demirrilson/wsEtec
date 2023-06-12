package listaI;

import javax.swing.JOptionPane;

public class I13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0, soma=0;
		long multiplo=1;
		String txtSoma="", txtMult = "";
		for (int i = 0; i <20; i++) {
			
		
			
			if ((contador%2)!= 0) {
				soma = soma + contador;
				txtSoma += contador + " - " + soma + "\n";
			}
			
			contador++;
			
			if ((contador%2)== 0) {
				multiplo = multiplo * contador;
				txtMult += contador + " * " + multiplo + "\n";
			}
			
		} 
		
		JOptionPane.showMessageDialog(null,
				"A Soma dos Impares de 0 a 20 é: \n" + txtSoma + "\n" + soma
				, "Resultado do Calculo", JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(null,
				"A Multiplicação dos Pares de 0 a 20 é: \n" + txtMult + "\n" + multiplo
				, "Resultado do Calculo", JOptionPane.PLAIN_MESSAGE);

	}

}
