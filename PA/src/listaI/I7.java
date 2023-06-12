package listaI;

import javax.swing.JOptionPane;

public class I7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resp=0, idade, totalIdade=0, contador=0;
		double media = 0;

		for (int i = 1; resp ==0 ; i++) {
			idade =Integer.parseInt( JOptionPane.showInputDialog(null," \n Digite a Idade do "+i+"º aluno \n","Media",JOptionPane.QUESTION_MESSAGE));
			totalIdade = totalIdade +idade;
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
			contador++;
		}
		
		media = totalIdade/contador;
		
		
		JOptionPane.showMessageDialog(null,
				"A idade média dos alunos é de "+media+"\n O total de Alunos é de "+contador
				, "Media", JOptionPane.PLAIN_MESSAGE);
	}

}
