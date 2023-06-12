package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sexoOp = {"masculino", "feminino"};
		String[] curso = {"Engenharia da Computação", "Administração", "Medicina", "Psicologia"}; 
		
		int cod, sexo, resp = 0;
		float totalH = 0, totalF = 0, perHomemEC = 0, perMulherP = 0;
		float totalPessoaMed = 0, totalMulherA = 0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			cod = JOptionPane.showOptionDialog(null, "Curso", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, curso, curso[0]);
			
			sexo  = JOptionPane.showOptionDialog(null, "Sexo", "PESQUISA", 0, JOptionPane.QUESTION_MESSAGE, null, sexoOp, sexoOp[0]);
			
			if (sexo == 0) {
				totalH++;
				if (cod == 0) {
					perHomemEC++;
				}
			}
			if (sexo == 1) {
				totalF++;
				if (cod == 1) {
					totalMulherA++;
				}
				if (cod == 3) {
					perMulherP++;
				}
			}
			if (cod == 2) {
				totalPessoaMed++;
			}
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
			
		} while (resp == 0);
		
		
		perHomemEC =((perHomemEC*100)/totalH);
		perMulherP = ((perMulherP*100)/totalF);
		
		
		JOptionPane.showMessageDialog(null, "O percentual de homens que pretendem cursar Eng. da Computação "+perHomemEC+"%"
				+"\nO percentual de mulheres que pretendem cursar Psicologia "+perMulherP+"%"
				+"\nO total de pessoas que pretendem cursar Medicina: "+ totalPessoaMed
				+"\nO total de mulheres que pretendem cursar Administração: "+ totalMulherA
				, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		
	
		
		
		
		

	}

}
