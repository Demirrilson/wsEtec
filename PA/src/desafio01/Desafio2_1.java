package desafio01;

import javax.swing.JOptionPane;

public class Desafio2_1 {

	public static void main(String[] args) {
		int n1, n2, n3, n4, n5;
		
		int maior =0,menor=0;
		    
		String maiorTxt="", menorTxt="";
		
		/*String x = "";
		
		
		for (int i = 1; i <= 5; i++) {
		x = " Digite o"+ i + "º valor:";
			
		}*/
		
		
		    
		n1 =Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite o 1º valor:","VALORES",JOptionPane.QUESTION_MESSAGE));
		n2 =Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite o 2º valor:","VALORES",JOptionPane.QUESTION_MESSAGE));
		n3 =Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite o 3º valor:","VALORES",JOptionPane.QUESTION_MESSAGE));
		n4 =Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite o 4º valor:","VALORES",JOptionPane.QUESTION_MESSAGE));
		n5 =Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite o 5º valor:","VALORES",JOptionPane.QUESTION_MESSAGE));
		
		maior = n1;
		menor = n1;
		
		if (n2>maior) {
			maior = n2;
		}
		if (n3>maior) {
			maior = n3;
		}
		if (n4>maior) {
			maior = n4;
		}
		if (n5>maior) {
			maior = n5;
		}
		
		if (n2<menor) {
			menor = n2;
		}
		if (n3<menor) {
			menor = n3;
		}
		if (n4<menor) {
			menor = n4;
		}
		if (n5<menor) {
			menor = n5;
		}
		
		 if (maior%2==0) {
				maiorTxt = " Par";
			}
	        else {
	        	maiorTxt = " Impar";
	        }
	        if (menor%2==0) {
				menorTxt = " Par";
			}
	        else {
	        	menorTxt = " Impar";
	        }
		    
		    JOptionPane.showMessageDialog(null,
		    		"O Menor valor digitado : "+menor+ " Este valor é "+ menorTxt
		    		+"\n\nO Maior valor digitado : "+maior+ " Este valor é "+ maiorTxt
					 , "Resposta", JOptionPane.PLAIN_MESSAGE);
		

	}

}
