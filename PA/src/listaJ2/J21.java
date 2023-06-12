package listaJ2;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class J21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador =200 , contagem = 0;
		 ArrayList<Integer> num = new ArrayList<Integer>();
		 ArrayList<Integer> num2 = new ArrayList<Integer>();
		
		
		JOptionPane.showMessageDialog(null, "Clique para começar a contagem" , "CONTAGEM", JOptionPane.PLAIN_MESSAGE);
		while (contador >100) {
				contagem = contagem +1;
				num.add (contagem);
				//System.out.println(contagem);
				contador = contador -1;
				
		}
		
		
		while (contador >0) {
			//System.out.println(contagem);
			num2.add (contagem);
			contagem = contagem -1;
			contador = contador -1;
	}
	System.out.println("FIM!");
	System.out.println("Crescente");
	System.out.println(num);
	//JOptionPane.showMessageDialog(null, num , "CONTAGEM", JOptionPane.PLAIN_MESSAGE);
	System.out.println("Decrescente");
	System.out.println(num2);
	}

}
