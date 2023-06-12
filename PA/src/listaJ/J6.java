package listaJ;

import java.util.Scanner;

public class J6 {

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
		 int idade=0;
		 float totalHomem=0, totalMulher=0, centerH=0, centerM=0, lesteH=0, lesteM=0, norteH=0, norteM=0;
		 float oesteH=0, oesteM=0, sulH=0, sulM=0, homemMenor=0, mulherMaior=0, totalPessoa=0;
		 String regiao, sexo, resp="s";
		 
		 Scanner leia = new Scanner (System.in);
		 
		 while(resp.equals("s")) {
			 
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			 
			System.out.println("Digite m para masculino e f para feminino");
			sexo = leia.next();
			
			System.out.println("Qual região de São Paulo você mora:\r\n"
					+ "REGIÃO      LETRA\r\n"
					+ "NORTE		n\r\n"
					+ "SUL		s\r\n"
					+ "LESTE		l\r\n"
					+ "OESTE		o\r\n"
					+ "CENTRO		c");
			System.out.println("Digite a letra conrespondente a sua região:");
			regiao = leia.next();
			
			totalPessoa++;
			
			if (sexo.equals("f")) {
				totalMulher++;
				if (regiao.equals("n")) {
					norteM++;
				}
				if (regiao.equals("s")) {
					sulM++;
					if (idade>=18) {
						mulherMaior++;
					}
				}
				if (regiao.equals("l")) {
					lesteM++;
				}
				if (regiao.equals("o")) {
					oesteM++;
				}
				if (regiao.equals("c")) {
					centerM++;
				}
			}
			if (sexo.equals("m")) {
				totalHomem++;
				if (regiao.equals("n")) {
					norteH++;
				}
				if (regiao.equals("s")) {
					sulH++;
					
				}
				if (regiao.equals("l")) {
					lesteH++;
					if (idade < 18) {
						homemMenor++;
					}
				}
				if (regiao.equals("o")) {
					oesteH++;
				}
				if (regiao.equals("c")) {
					centerH++;
				}
			}
			
			System.out.println("Para continuar digite  s    pra sair outra letra");
			resp = leia.next();
		 }
		 
		 System.out.println("---------------------fim-------------------------");
		 
		 System.out.println("\n\rA quantidade de Homens por Região \r\n"
				 	+ "REGIÃO       Quantidade\r\n"
					+ "\r\nNORTE		"+norteH
					+ "\r\nSUL		"+sulH
					+ "\r\nLESTE		"+lesteH
					+ "\r\nOESTE		"+oesteH
					+ "\r\nCENTRO		"+centerH);
		 
		 System.out.println("\n\rA quantidade de Mulheres por Região \r\n"
				 	+ "REGIÃO       Quantidade\r\n"
					+ "\r\nNORTE		"+norteM
					+ "\r\nSUL		"+sulM
					+ "\r\nLESTE		"+lesteM
					+ "\r\nOESTE		"+oesteM
					+ "\r\nCENTRO		"+centerM);
		 
		 norteH = ((norteH*100)/totalHomem);
		 sulH = ((sulH*100)/totalHomem);
		 lesteH = ((lesteH*100)/totalHomem);
		 oesteH = ((oesteH*100)/totalHomem);
		 centerH = ((centerH*100)/totalHomem);
		 
		 System.out.println("\r\nO percentual de Homens por Região \r\n"
				 	+ "REGIÃO       Quantidade\r\n"
					+ "\r\nNORTE		"+norteH+"%"
					+ "\r\nSUL		"+sulH+"%"
					+ "\r\nLESTE		"+lesteH+"%"
					+ "\r\nOESTE		"+oesteH+"%"
					+ "\r\nCENTRO		"+centerH+"%\r\n");
		 
		 norteM = ((norteM*100)/totalMulher);
		 sulM = ((sulM*100)/totalMulher);
		 lesteM = ((lesteM*100)/totalMulher);
		 oesteM = ((oesteM*100)/totalMulher);
		 centerM = ((centerM*100)/totalMulher);
		 
		 System.out.println("\n\rO percentual de Mulheres por Região \r\n"
				 	+ "REGIÃO       Quantidade\r\n"
					+ "\r\nNORTE		"+norteM+"%"
					+ "\r\nSUL		"+sulM+"%"
					+ "\r\nLESTE		"+lesteM+"%"
					+ "\r\nOESTE		"+oesteM+"%"
					+ "\r\nCENTRO		"+centerM+"%\r\n");
		 
		 System.out.println("\r\nO total de homens menores de idade que residem na Zona Leste da cidade: "+homemMenor);
		 
		 mulherMaior = ((mulherMaior*100)/totalMulher);
		 System.out.println("\r\nO percentual de mulheres maiores de idade que residem na Zona Sul da cidade: "+mulherMaior+"%");
		 
		 System.out.println("\r\nO percentual de homens que residem na Zona Central da cidade: "+centerH+"%");
		 
		 System.out.println("\r\nO total de pessoas que residem em São Paulo: "+totalPessoa);
		
	}

}
