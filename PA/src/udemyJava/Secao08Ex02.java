package udemyJava;

import java.util.Scanner;


public class Secao08Ex02 {
	
	static int dia, mes, ano, mesVerificado;
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("Digite o Dia desejado:");
		dia = teclado.nextInt();
		
		System.out.println("Digite o Mês desejado:");
		mes = teclado.nextInt();
		
		System.out.println("Digite o Ano desejado:");
		ano = teclado.nextInt();
		
		validacaoData(ano, mes, dia);
		
		formatacaoData(ano, mesVerificado, dia);
		

	}
	
	static void validacaoData(int ano,int mes, int dia) {
		while (mes>12) {
			System.out.println("\nMês invalido!!!");
			System.out.println("\nDigite o Mês desejado:");
			mes = teclado.nextInt();
		}
		int condicao=0;
		while (condicao == 0) {
			if (mes==1||mes ==3||mes==5||mes==7||mes==8||mes==10||mes==12 ) {
				if (dia<=31) {
					condicao=1;
				}
			}
			if (mes==4||mes ==6||mes==9||mes==11 ) {
				if (dia<=30) {
					condicao=1;	
				}
			}
			if (mes==2 ) {
				if (dia<=29) {
					condicao=1;
				}
			}
			if(condicao == 0) {
				System.out.println("\nDia invalido!!!");
				System.out.println("\nDigite o Dia desejado:");
				dia = teclado.nextInt();
			}
		}
		
		
		mesVerificado = mes;
		Secao08Ex02.dia = dia;
		System.out.println("");
		
		
	}
	
	static void formatacaoData(int ano,int mesVerificado, int dia) {
		String mesTexto, dataTexto;
		
		switch (mesVerificado) {
		case 1:
			mesTexto = "Janeiro";
			break;
		case 2:
			mesTexto = "Fevereiro";
			break;
		case 3:
			mesTexto = "Março";
			break;
		case 4:
			mesTexto = "Abril";
			break;
		case 5:
			mesTexto = "Maio";
			break;
		case 6:
			mesTexto = "Junho";
			break;
		case 7:
			mesTexto = "Julho";
			break;
		case 8:
			mesTexto = "Agosto";
			break;
		case 9:
			mesTexto = "Setembro";
			break;
		case 10:
			mesTexto = "Outubro";
			break;
		case 11:
			mesTexto = "Novembro";
			break;
		case 12:
			mesTexto = "Dezembro";
			break;
		default:
			mesTexto = "Erro";
			break;
		}
		if (dia<10) {
			dataTexto = "   0"+dia+" de "+mesTexto+" de "+ano; 
			
		} else {
			dataTexto = dia+" de "+mesTexto+" de "+ano; 
		}
		
		System.out.println(dataTexto);
	}

}
