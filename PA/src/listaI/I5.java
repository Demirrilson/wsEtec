package listaI;

import javax.swing.JOptionPane;

public class I5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alunos = "",nome=null;
		float media=0, nota, totalNota=0;
		
		
		for (int i = 0; i <2; i++) {
			media = 0;
			totalNota = 0;
			int cont =i+1;
			
			for (int j = 0; j < 5; j++) {
				if(j == 0) {
				nome= JOptionPane.showInputDialog(null," \n Digite o nome do "+cont+"° Aluno: \n","Cadastro de Aluno",JOptionPane.QUESTION_MESSAGE);
				}
				if (j>0) {
					nota =Float.parseFloat( JOptionPane.showInputDialog(null," \n Digite a "+j+"ª nota: \n","Cadastro de Notas",JOptionPane.QUESTION_MESSAGE));
					totalNota = totalNota + nota;
					nota = 0;
				}
				media = totalNota/4;
				
				
			}
			String str = String.format("%.02f", media);
			alunos +="O aluno/a:  -"+ nome+"-   teve média de:  "+ str +"\n" ;
		}
			
		JOptionPane.showMessageDialog(null,
				alunos
				, "Media", JOptionPane.PLAIN_MESSAGE);

	}

}
