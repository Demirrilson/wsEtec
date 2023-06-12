package lisraD;

import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Desenvolva um programa para realizar a leitura de um número entre 0 e 10. 
		 * O programa deverá apresentar a descrição deste número. Exemplo: 9 – nove.
		 * */
		
		String v, name;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o número de 0 à 10");
		v = leia.next();
		switch (v) {
		case "0": name = "Zero";
		    break;
		case "1": name = "Um";
			break;
		case "2": name = "Dois";
		    break;		
		case "3": name = "Três";
	    	break;
		case "4": name = "Quatro";
	   	 	break;
		case "5": name = "Cinco";
	    	break;
		case "6": name = "Seis";
	   	 	break;
		case "7": name = "Sete";
	   	 	break;
		case "8": name = "Oito";
		    break;
		case "9": name = "Nove";
	    	break;
		case "10": name = "Dez";
	    	break;
		    default: name = "opção invalida";
			break;
		}
System.out.println(v + " - " + name);
	}

}
