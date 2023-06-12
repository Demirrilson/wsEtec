package listaI;

import javax.swing.JOptionPane;

public class I12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int impar=0;
		String resp="";
		for (int i = 0; i < 50; i++) {
			if (i%2!=0) {
				impar= i;
				resp += impar +", ";
			}
			
			
		}
		JOptionPane.showMessageDialog(null, resp , "Resposta", JOptionPane.PLAIN_MESSAGE);

	}

}
