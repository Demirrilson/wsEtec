package rodoviaria;

import javax.swing.JOptionPane;

public class VendaPassagem {

	public static void main(String[] args) {
		//Demirrilson Oliveira Badaró
		
		String filaDireita[][]= {{"j01","c02"},{"j05","c06"},{"j09","c10"},{"j13","c14"},{"j17","c18"},
				{"j21","c22"},{"j25","c26"},{"j29","c30"},{"j33","c34"},{"j37","c38"},{"j41","c42"},{"j45","c46"}};
		String filaEsquerda[][]= {{"j03","c04"},{"j07","c08"},{"j11","c12"},{"j15","c16"},{"j19","c20"},
				{"j23","c24"},{"j27","c28"},{"j31","c32"},{"j35","c36"},{"j39","c40"},{"j43","c44"},{"j47","c48"}};
		String menu[]= {"Mostrar Poltronas", "Vender passagens", "Sair"};
		
		String fila="";
		String compra="", lugar="",lugarE="";
		
		int opMenu;
		 
		do {
			
		opMenu = JOptionPane.showOptionDialog(null,"Venda de Passagens", "Menu",0,JOptionPane.QUESTION_MESSAGE,null, menu, menu[0]);
		
		if (opMenu == 1) {
			
			compra = JOptionPane.showInputDialog(null,"Compra de Passagem", "Digite a poltrona desejada",JOptionPane.QUESTION_MESSAGE);
			
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 2; j++) {
					
					lugar= filaDireita[i][j];
	
					lugarE= filaEsquerda[i][j];
		
					
					if (lugar.equals(compra)) {
						filaDireita[i][j]="000";
						//System.out.println("lugar "+filaDireita[i][j]);
						//System.out.println("compra: "+compra);
					}
					if (lugarE.equals(compra)) {
						filaEsquerda[i][j]="000";
					}
					//System.out.println("compra: " + compra);
					//System.out.println(lugar);
				}
			}
		}
			if (opMenu == 0) {
				
				for (int i = 0; i < 12; i++) {
					for (int j = 0; j < 4; j++) {
						if (j==0) {
							fila += filaDireita[i][0]+"   ";
						}
						if (j==1) {
							fila += filaDireita[i][1]+"   ";
						}
						if (j==2) {
							fila += filaEsquerda[i][1]+"   ";
						}
						if (j==3) {
							fila += filaEsquerda[i][0]+"   ";
						}
					}
					fila += "\n\n";
				}
				//System.out.println(fila);
				JOptionPane.showMessageDialog(null,"Poltronas\n\n"+fila,"Ônibus ETEC",JOptionPane.WARNING_MESSAGE);
			}
			
				
			
		} while (opMenu != 2);
		
	}

}
