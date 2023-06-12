package listaI;



import javax.swing.JOptionPane;

public class I10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,numeros=0;
	  
	    double maior = 0,menor =0;
	    
	    numeros = Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite a quantidade de Valores: \n","Entrada",JOptionPane.QUESTION_MESSAGE));
	    
	    double valor[]= new double[numeros];
	    
	    for(i=0;i< valor.length;i++){
	    	int x = i+1;
	        valor[i]=Double.parseDouble(JOptionPane.showInputDialog(null," \n Digite o "+x+"º valor:","VALORES",JOptionPane.QUESTION_MESSAGE));
	        menor = valor[i];
	    }
	    
	    
	    for(i = 0;i< valor.length;i++){
	           

	            if(valor[i]>maior){
	                maior= valor[i];
	            }
	            if(valor[i]<menor){
	               menor=valor[i]; 
	            }
	             
	        }
	    
	    JOptionPane.showMessageDialog(null,
	    		"O Menor valor digitado : "+menor
	    		+"\n O maior valor digitado : "+maior
				 , "Resposta", JOptionPane.PLAIN_MESSAGE);
	 

	}

}
