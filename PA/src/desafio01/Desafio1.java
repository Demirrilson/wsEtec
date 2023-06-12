package desafio01;

import javax.swing.JOptionPane;


public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, x1, x2, delta, raizDelta;
		
		
		
		a = Double.parseDouble(JOptionPane.showInputDialog(null," \n Digite o valor de  x² a: \n","Entrada",JOptionPane.QUESTION_MESSAGE));
		
		while (a == 0) {
			JOptionPane.showMessageDialog(null,
					"O valor de a tem que ser diferente de ZERO"
					, "Bhaskara", JOptionPane.PLAIN_MESSAGE);
			
			a = Double.parseDouble(JOptionPane.showInputDialog(null," \n Digite o valor de  x² a: \n","Entrada",JOptionPane.QUESTION_MESSAGE));
		}
		
		b = Double.parseDouble(JOptionPane.showInputDialog(null," \n Digite o valor de x b: \n","Entrada",JOptionPane.QUESTION_MESSAGE));
		c = Double.parseDouble(JOptionPane.showInputDialog(null," \n Digite o valor de c: \n","Entrada",JOptionPane.QUESTION_MESSAGE));
		
		delta = (b*b)-(4*a*c);
		raizDelta = Math.sqrt(delta);
		
		//System.out.println(delta );
		//System.out.println(raizDelta);
		
		
		x1 = (-(b-raizDelta)/(2*a));
		
		x2 = (-(b+raizDelta)/(2*a));
		
		if (delta <0) {
			JOptionPane.showMessageDialog(null,
					"Equação Bhaskara invalida Delta NEGATIVO valor de Delta: "+delta
					, "Bhaskara", JOptionPane.PLAIN_MESSAGE);
			
		} else {

		JOptionPane.showMessageDialog(null,
				"Delta = "+ delta+
				"\nX1 = "+ x1+
				"\nX2 = "+x2
				, "Bhaskara", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
