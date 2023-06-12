package desafio01;

import javax.swing.JOptionPane;

public class Desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int maior =0,menor=0, x, i;
	    
	    String maiorTxt="", menorTxt="";
	    
	    int valor[]= new int[5];
	    
	    for(i=0;i< valor.length;i++){
	    	x = i+1;
	        valor[i]=Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite o "+x+"º valor:","VALORES",JOptionPane.QUESTION_MESSAGE));
	        menor = valor[i];
	        maior = valor[i];
	    }
	    
	    
	    for(i = 0;i< valor.length;i++){
	           

	            if(valor[i]>maior){
	                maior= valor[i];
	            }
	            if(valor[i]<menor){
	               menor=valor[i]; 
	            }
	              
	             
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
