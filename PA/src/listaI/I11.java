package listaI;

import javax.swing.JOptionPane;

public class I11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for (int i = 1; i <=100; i++) {
			total = total+i;
			
		}
		JOptionPane.showMessageDialog(null,
	    		" A soma dos 100 primeiros numeros inteiros é: : "+total
				 , "Resposta", JOptionPane.PLAIN_MESSAGE);

	}

}
