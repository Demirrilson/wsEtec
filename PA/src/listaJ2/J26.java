package listaJ2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class J26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Desenvolva um programa para realizar um censo na cidade de São Paulo. 
		 O programa deverá solicitar a leitura da idade, da região em que reside
		 (Centro, Leste, Norte, Oeste ou Sul) e o sexo das pessoas. 
		 O programa deverá realizar a pesquisa enquanto houver a 
		 solicitação de uma nova entrada de dados através da variável RESP. 
		 Ao final o programa deverá apresentar os seguintes resultados:
		  	- O total de homens e mulheres que residem em cada região da cidade;
			- O percentual de homens e mulheres que residem em cada região da cidade;
			- O total de homens menores de idade (menores de 18) que residem na Zona Leste da cidade;
			- O percentual de mulheres maiores de idade (maiores de 18) que residem na Zona Sul da cidade;
			- O percentual de homens que residem na Zona Central da cidade;
			- O total de pessoas que residem em São Paulo.
		 */
		 int idade=0, sexo;
		 float totalHomem=0, totalMulher=0, centerH=0, centerM=0, lesteH=0, lesteM=0, norteH=0, norteM=0;
		 float oesteH=0, oesteM=0, sulH=0, sulM=0, homemMenor=0, mulherMaior=0, totalPessoa=0;
		 int regiao, resp = 0;
		 String[] nomeRegiao = {"Norte","Sul","Leste","Oeste","Centro"};
		 String[] opSexo = {"Masculino","Feminino"};
		 
		 while(resp==0) {

			 idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua idade:", "ENTRADA", JOptionPane.QUESTION_MESSAGE));

			 sexo = JOptionPane.showOptionDialog(null, "Qual se sexo?", "SEXO", 0, JOptionPane.QUESTION_MESSAGE, null, opSexo, opSexo[0]);
			
			 regiao = JOptionPane.showOptionDialog(null, "Qual região de São Paulo você mora:", "REGIÂO", 0, JOptionPane.QUESTION_MESSAGE, null, nomeRegiao, nomeRegiao[0]);
			 
			totalPessoa++;
			
			if (sexo==1) {
				totalMulher++;
				if (regiao==0) {
					norteM++;
				}
				if (regiao==1) {
					sulM++;
					if (idade>=18) {
						mulherMaior++;
					}
				}
				if (regiao==2) {
					lesteM++;
				}
				if (regiao==3) {
					oesteM++;
				}
				if (regiao==4) {
					centerM++;
				}
			}
			if (sexo==0) {
				totalHomem++;
				if (regiao==0) {
					norteH++;
				}
				if (regiao==1) {
					sulH++;
					
				}
				if (regiao==2) {
					lesteH++;
					if (idade < 18) {
						homemMenor++;
					}
				}
				if (regiao==3) {
					oesteH++;
					}
				if (regiao==4) {
					centerH++;
					}
			}

			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		 }

		 JOptionPane.showMessageDialog(null,"\n\rA quantidade de Mulheres por Região \r\n"
				 	+ "REGIÃO       Quantidade\r\n"
					+ "\r\nNORTE		"+norteM
					+ "\r\nSUL		"+sulM
					+ "\r\nLESTE		"+lesteM
					+ "\r\nOESTE		"+oesteM
					+ "\r\nCENTRO		"+centerM 
					+"\n\rA quantidade de Homens por Região \r\n"
					+ "REGIÃO       Quantidade\r\n"
					+ "\r\nNORTE		"+norteH
					+ "\r\nSUL		"+sulH
					+ "\r\nLESTE		"+lesteH
					+ "\r\nOESTE		"+oesteH
					+ "\r\nCENTRO		"+centerH, "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		 
		 
		 norteH = ((norteH*100)/totalHomem);
		 sulH = ((sulH*100)/totalHomem);
		 lesteH = ((lesteH*100)/totalHomem);
		 oesteH = ((oesteH*100)/totalHomem);
		 centerH = ((centerH*100)/totalHomem);
		 
		 JOptionPane.showMessageDialog(null,"\r\nO percentual de Homens por Região \r\n"
				 	+ "REGIÃO       Quantidade\r\n"
					+ "\r\nNORTE		"+norteH+"%"
					+ "\r\nSUL		"+sulH+"%"
					+ "\r\nLESTE		"+lesteH+"%"
					+ "\r\nOESTE		"+oesteH+"%"
					+ "\r\nCENTRO		"+centerH+"%\r\n", "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		 
		 norteM = ((norteM*100)/totalMulher);
		 sulM = ((sulM*100)/totalMulher);
		 lesteM = ((lesteM*100)/totalMulher);
		 oesteM = ((oesteM*100)/totalMulher);
		 centerM = ((centerM*100)/totalMulher);
		 
		 JOptionPane.showMessageDialog(null,"\n\rO percentual de Mulheres por Região \r\n"
				 	+ "REGIÃO       Quantidade\r\n"
					+ "\r\nNORTE		"+norteM+"%"
					+ "\r\nSUL		"+sulM+"%"
					+ "\r\nLESTE		"+lesteM+"%"
					+ "\r\nOESTE		"+oesteM+"%"
					+ "\r\nCENTRO		"+centerM+"%\r\n", "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
		 
		 JOptionPane.showMessageDialog(null,
					 "\r\n\nO total de homens menores de idade que residem na Zona Leste da cidade: "+homemMenor
					 +"\r\n\nO percentual de mulheres maiores de idade que residem na Zona Sul da cidade: "+mulherMaior+"%"
					 +"\r\n\nO percentual de homens que residem na Zona Central da cidade: "+centerH+"%"
					 +"\r\nO total de pessoas que residem em São Paulo: "+totalPessoa
					 , "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
	}
}
