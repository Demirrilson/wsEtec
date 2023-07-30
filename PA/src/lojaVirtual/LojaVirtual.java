package lojaVirtual;

import java.util.Scanner;

public class LojaVirtual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float valorProduto = 0;
		float pesoProduto = 0;
		int codReg;
		String regiao = null;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto:(em R$)");
		valorProduto = leia.nextFloat();
		
		System.out.println("Digite o peso do Produto: (em Kg)");
		pesoProduto = leia.nextFloat();
		
		System.out.println("Digite o código da Região:\n"
				+ "1 	Sul\r\n"
				+ "2	 Sudeste\r\n"
				+ "3	 Centro-Oeste\r\n"
				+ "4	 Norte ou Nordeste\r\n"
				+ "5	Opção de envio Independente da Região ");
		codReg = leia.nextInt();
		
		
		switch (codReg) {
		
		case 1:regiao = "Sul";
			break;
		case 2: regiao = "Sudeste" ;
		    break;		
		case 3: regiao = "Centro Oeste";
	    	break;
		case 4:regiao = "Norte ou nordeste";
	   	 	break;
		case 5 :regiao = "Opção de envio Independente da Região" ;	 	
		    default: regiao = "Opção invalida";
			break;
		}
		

		if (codReg == 1) {
			if ((valorProduto > 300) && (pesoProduto < 5)) {
				System.out.println("Envio Transportadora");
			}
			else
				System.out.println("Envio PAC");
		}

		
		if (codReg == 2) {
			if ((valorProduto > 300) && (pesoProduto < 2)) {
				System.out.println("Envio SEDEX");
			}
			else
				System.out.println("Envio PAC");
		}

		
		if (codReg == 3) {
			if ((valorProduto > 500) && (pesoProduto < 5)) {
				System.out.println("Envio Transportadora");
			}
			else
				System.out.println("Envio PAC");
		}

		
		if (codReg == 4) {
			if ((valorProduto > 1000) && (pesoProduto < 5)) {
				System.out.println("Envio Transportadora");
			}	
			else
				System.out.println("Envio PAC");
		}

		if (codReg == 5) {
			
		
			if ((pesoProduto <= 1) && (valorProduto > 500)) {
				System.out.println("Envio Sedex");
			}
			else if (((pesoProduto > 1) && (pesoProduto <= 5))||(valorProduto < 100)) {
				System.out.println("Envio PAC");	
			}
			
		}
		System.out.println("A região é: " + regiao);
		leia.close();

	}

}
