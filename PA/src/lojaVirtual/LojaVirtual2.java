package lojaVirtual;

import java.util.Scanner;

public class LojaVirtual2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float valorProduto = 0;
		float pesoProduto = 0;
		int codReg;
		String regiao = "independente da região";
		String envio = null;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto:(em R$)");
		valorProduto = leia.nextFloat();
		
		System.out.println("Digite o peso do Produto: (em Kg)");
		pesoProduto = leia.nextFloat();
		
		System.out.println("Digite o código da Região:\n"
				+ "1 	Sul\r\n"
				+ "2	 Sudeste\r\n"
				+ "3	 Centro-Oeste\r\n"
				+ "4	 Norte ou Nordeste");
		codReg = leia.nextInt();
		
		
		if ((pesoProduto <= 1) && (valorProduto > 500)) {
	    	envio = "SEDEX";
		}
		else if ((valorProduto < 100)) {
			envio = "PAC";	
		}
		
		
		else if ((envio != "SEDEX") && (envio != "PAC")) {
			
			switch (codReg) {
			
			case 1:regiao = "Sul";
				{
						if ((valorProduto > 300) && (pesoProduto < 5)) {
							envio = "Transportadora";
						}
						else
							envio = "PAC";
					}
				break;
			case 2: regiao = "Sudeste" ;
			{
				if ((valorProduto > 300) && (pesoProduto < 2)) {
					envio = "SEDEX";
				}
				else
					envio = "PAC";
			}
			    break;		
			case 3: regiao = "Centro Oeste";
			{
				if ((valorProduto > 500) && (pesoProduto < 5)) {
					envio = "Transportadora";
				}
				else
					envio = "PAC";
			}
		    	break;
			case 4:regiao = "Norte ou nordeste";
			 {
					if ((valorProduto > 1000) && (pesoProduto < 5)) {
						envio = "Transportadora";
					}	
					else
						envio = "PAC";
				}
		   	 	break;
			    default: regiao = "opção de região invalida";
			    {
				    
			    }
				break;
			}
		
		}	
		System.out.println("O metodo de envio é: " + envio);
		System.out.println("A região é: " + regiao);

		leia.close();
	}

}
