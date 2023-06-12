package listaJ;

import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Desenvolva um programa para uma Universidade realizar uma pesquisa entre os alunos que
		ingressam nesta Universidade. Para isso, o programa deverá solicitar o sexo do entrevistado e o
		código do curso que deseja realizar.
		
		Código 		Curso
		1 			Engenharia da Computação
		2			Administração
		3 			Medicina
		4 			Psicologia
		
		O programa deverá realizar a pesquisa enquanto houver a solicitação de uma nova entrada
		de dados através da variável RESP. Ao final o programa deverá apresentar os seguintes resultados:
		
		- O total de homens que pretendem cursar Engenharia da Computação;
		- O total de mulheres que pretendem cursar Psicologia;
		- O percentual de pessoas que pretendem cursar Medicina;
		- O percentual de homens que pretendem cursar Administração;
		- O percentual de mulheres que pretendem cursar Medicina. 
		 */
		String resp = "n", sexo;
		int cod;
		float totalH = 0, totalF = 0, totalP = 0, engH = 0, psiF = 0, pMed = 0, pAdmH = 0, admH = 0, pMedF = 0;
		
		Scanner leia = new Scanner (System.in);
		
		
		while(resp.equals("n")){			//inicio do laço de repetição 
			System.out.println("Digite f para feminino e m para masculino");
			sexo = leia.next();
			
			System.out.println("Código 			Curso\r\n"
					+ "1 			Engenharia da Computação\r\n"
					+ "2			Administração\r\n"
					+ "3 			Medicina\r\n"
					+ "4 			Psicologia");
			
			System.out.println("Digite o código do seu curso");
			cod = leia.nextInt();
			
			totalP = totalP +1; 			//total de pessoas
			if (cod == 3) {  				//escolheu medicina
				pMed++;
				if (sexo.equals("f")) {		//sexo feminino
					pMedF++;				//percentual de mulheres que escolheram medicina
				}
			}
			if (sexo.equals("m")) {			//sexo masculino
				totalH = totalH + 1;		//total de Homens
				if (cod == 1) {
					engH = engH + 1;		//homens que escolheram engenharia
				}
				if (cod == 2) {				//escolheu administração
					admH = admH + 1;		//homens que escolheram Administração
				}
			}
			if (sexo.equals("f")) {			//sexo feminino
				totalF++;					//total de Mulheres
				if (cod == 4) {				//escolheu Psicologia
					psiF++;					//mulheres que escolheram Psicologia
				}
			}
			System.out.println("Digite s para SAIR ou n para continuar");
			resp = leia.next();	
			}
			
		pAdmH =((admH * 100)/totalH);		//calculo de percentual de homens em administração
		pMed = ((pMed * 100)/totalP);		//calculo de percentual de pessoas em medicina
		pMedF = ((pMedF * 100)/totalF);		//calculo de percentual de mulheres em medicina
		
		System.out.println("O total de Homens que pretendem cursar Engenharia da Computação: "+engH);
		System.out.println("O total de Mulheres que pretendem cursar Psicologia: "+psiF);
		System.out.println("O percentual de Pessoas que pretendem cursar Medicina: "+pMed+"%");		
		System.out.println("O percentual de Homens que pretendem cursar Administração: "+pAdmH+"%");	
		System.out.println("O percentual de Mulheres que pretendem cursar Medicina: "+pMedF+"%");									
	}

}
