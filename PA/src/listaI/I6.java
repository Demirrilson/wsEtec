package listaI;

import javax.swing.JOptionPane;

public class I6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alunos = "",nome=null, situacao="";
		float media=0, aprovado=0;
		
		
		for (int i = 0; i <20; i++) {
			media = 0;
			situacao = "";
			int cont =i+1;

			
			for (int j = 0; j < 2; j++) {
				if(j == 0) {
				nome= JOptionPane.showInputDialog(null," \n Digite o nome do "+cont+"° Aluno: \n","Cadastro de Aluno",JOptionPane.QUESTION_MESSAGE);
				}
				if (j>0) {
					media =Float.parseFloat( JOptionPane.showInputDialog(null," \n Digite a media do aluno \n"+ nome,"Cadastro de Notas",JOptionPane.QUESTION_MESSAGE));
				}
				
				
			}
			if (media >= 6) {
				aprovado++;
				situacao = "Aprovado";
				
			} else {
				situacao = "Reprovado";

			}
			alunos +="O aluno/a:  -"+ nome+"-   teve média de:  "+media + " - "+situacao +"\n" ;
		}
			
		JOptionPane.showMessageDialog(null,
				alunos+"\n\n numero de alunos aprovados :"+aprovado
				, "Media", JOptionPane.PLAIN_MESSAGE);

	}

}
