	package listaI;

import javax.swing.JOptionPane;

public class I4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0, num=0;
		String tabuada="";
		
		num =Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite o numero para o calculo da Tabuada: \n","Tabuada",JOptionPane.QUESTION_MESSAGE));
		for (int i = 0; i <= 10; i++) {
			res = (i * num);
			tabuada += i+" X "+num+" = "+res+"\n";
		}

		JOptionPane.showMessageDialog(null,
				tabuada
				, "Tabuada", JOptionPane.PLAIN_MESSAGE);

	}

}
