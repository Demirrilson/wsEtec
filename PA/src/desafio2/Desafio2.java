package desafio2;
import javax.swing.JOptionPane;
public class Desafio2 {

	public static void main(String[] args) {
		//Grupo4
		//Demirrilson 
		//Lucas Lemos
		//Vinicius Ribeiro
	
	int amigos = 8;
	int pacote1 = 4;
	int pacote2 = 2;
	int pacote3 = 2;
	int pacote4 = 1;
	int pacote5 = 5;
	int escolha = 0;
	int i ;
	
	String[] listaItems = {"500g Carne","500g Tulipa","500g Linguiça", "1Kg Farofa ","1L Refrigerante"};
	
	
	String opcoes ="";
	
	
	for( i = 1; i<amigos; i++) {
		
		
		int cont = 0;
		
		JOptionPane.showMessageDialog(null,
				"Amigo: "+i,"Churrasco", JOptionPane.PLAIN_MESSAGE);
		do {
			
			if(pacote1==0) 
			{
				listaItems[0]="ESGOTADO";	
			}
			if(pacote2==0) 
			{
				listaItems[1]="ESGOTADO";	
			}
			if(pacote3==0) 
			{
				listaItems[2]="ESGOTADO";	
			}
			if(pacote4==0) 
			{
				listaItems[3]="ESGOTADO";	
			}
			if(pacote5==0) 
			{
				listaItems[4]="ESGOTADO";	
			}
			
			escolha =JOptionPane.showOptionDialog(null, "Escolha dois itens:", "Churrasco", 0, 
					JOptionPane.QUESTION_MESSAGE, null, listaItems, listaItems[1]);
					
					if (escolha==0) {
						
						if(pacote1==0) {
						while(escolha==0) {
							JOptionPane.showMessageDialog(null,
									"Item esgotado","Alerta", JOptionPane.PLAIN_MESSAGE);
							escolha =JOptionPane.showOptionDialog(null, "Escolha dois itens:", "Churrasco", 0, 
									JOptionPane.QUESTION_MESSAGE, null, listaItems, listaItems[1]);
						}
					}
						pacote1--;
						}
					if (escolha==1) {
						
						if(pacote2==0) {
						while(escolha==1) {
							JOptionPane.showMessageDialog(null,
									"Item esgotado","Alerta", JOptionPane.PLAIN_MESSAGE);
							escolha =JOptionPane.showOptionDialog(null, "Escolha dois itens:", "Churrasco", 0, 
									JOptionPane.QUESTION_MESSAGE, null, listaItems, listaItems[1]);
						}
					}
						pacote2--;
					}
					if (escolha==2) {
						
						if(pacote3==0) {
						while(escolha==2) {
							JOptionPane.showMessageDialog(null,
									"Item esgotado","Alerta", JOptionPane.PLAIN_MESSAGE);
							escolha =JOptionPane.showOptionDialog(null, "Escolha dois itens:", "Churrasco", 0, 
									JOptionPane.QUESTION_MESSAGE, null, listaItems, listaItems[1]);
						}
					}
						pacote3--;
					}
					if (escolha==3) {
						
						if(pacote4==0) {
						while(escolha==3) {
							JOptionPane.showMessageDialog(null,
									"Item esgotado","Alerta", JOptionPane.PLAIN_MESSAGE);
							escolha =JOptionPane.showOptionDialog(null, "Escolha dois itens:", "Churrasco", 0, 
									JOptionPane.QUESTION_MESSAGE, null, listaItems, listaItems[1]);
						}
					}
						pacote4--;
					}
					if (escolha==4) {
						
						if(pacote5==0) {
						
						while(escolha==4) {
							JOptionPane.showMessageDialog(null,
									"Item esgotado","Alerta", JOptionPane.PLAIN_MESSAGE);
							escolha =JOptionPane.showOptionDialog(null, "Escolha dois itens:", "Churrasco", 0, 
									JOptionPane.QUESTION_MESSAGE, null, listaItems, listaItems[1]);
						}
					}
						pacote5--;
					}
					opcoes += "amigo: "+ i + "  Escolheu: "+ listaItems[escolha]+"\n";
					cont++;
					//System.out.println(opcoes);
					
					
					
		}while(cont<2);
		
		
	} 
		
	JOptionPane.showMessageDialog(null,
			opcoes+"\n Bom Churras!!","Churrasco", JOptionPane.PLAIN_MESSAGE);
	
			
	}

}
