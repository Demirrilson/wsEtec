package listaI;

import javax.swing.JOptionPane;

public class I3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		String tabuada="";
		
		for (int i = 0; i <= 10; i++) {
			res = (i * 5);
			tabuada += i+" X 5 = "+res+"\n";
		}

		JOptionPane.showMessageDialog(null,
				tabuada
				, "Tabuada do 5", JOptionPane.PLAIN_MESSAGE);
	}
}
