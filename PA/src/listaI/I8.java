package listaI;

import javax.swing.JOptionPane;

public class I8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fun=0, cod;
		double salNovo=0, salAnt=0, reajuste=0,porcent=0;
		String[] codigo = {"1 - 5%","2 - 15%","3 - 25%","4 - 30%"};
		
		fun = Integer.parseInt(JOptionPane.showInputDialog(null," \n Digite a quantidade de Funcionários: \n","Entrada",JOptionPane.QUESTION_MESSAGE));
		
		for (int i = 0; i < fun; i++) {
			salAnt = Double.parseDouble(JOptionPane.showInputDialog(null," \n Digite seu salário atual: \n","Salário",JOptionPane.QUESTION_MESSAGE));
			
			cod =JOptionPane.showOptionDialog(null, "Digite o Código do REAJUSTE", "REAJUSTE", 0, 
    				JOptionPane.QUESTION_MESSAGE, null, codigo, codigo[1]); 
			if (cod == 0) {
				porcent =0.05;
			}
			if (cod == 1) {
				porcent =0.15;
			}
			if (cod == 2) {
				porcent =0.25;
			}
			if (cod == 3) {
				porcent =0.30;
			}
			reajuste = salAnt * porcent;
			salNovo = salAnt + reajuste;
			
			JOptionPane.showMessageDialog(null,
					"Seu Salário antigo: R$"+salAnt+"\n Reajuste foi de: R$"+reajuste+"\n Salário Novo é de: R$"+salNovo
					, "Saida", JOptionPane.PLAIN_MESSAGE);
			
		}
		JOptionPane.showMessageDialog(null,
				"Fim das consultas"
				, "Fim", JOptionPane.PLAIN_MESSAGE);

	}

}
