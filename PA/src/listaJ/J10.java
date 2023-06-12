package listaJ;

import java.util.Scanner;

public class J10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resp="s", lugar1=null, lugar2=null,lugar3=null,empate1=null, empate2=" ";
		int voto;
		float votoTotal=0, corsa=0, palio=0,gol=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Votação de Pretenção de Automóveis \r\n");
		System.out.println("Carro				Código do Carro \r\n"
				+ "Corsa					2 \r\n"
				+ "Palio					4 \r\n"
				+ "Gol					6 \r\n");
		while(resp.equals("s")) {
			System.out.println("Digite o Código do Carro escolhido:");
			voto = leia.nextInt();
			if (voto == 2) {
				corsa++;
			}
			if (voto == 4) {
				palio++;
			}			
			if (voto == 6) {
				gol++;
			}
			
			votoTotal++;
			System.out.println("Para continuar a votação Digite -- S -- para sair Digite outra letra");
		    resp = leia.next();
		}
		System.out.println("\nFim da votação!!!!\n\n");
		
		if ((corsa > palio)&&(corsa > gol)) {
			lugar1 = "Corsa";
			if (palio>gol) {
				lugar2 = "Palio";
				lugar3 = "Gol";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if (gol>palio) {
				lugar2 = "Gol";
				lugar3 = "Palio";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if(gol == palio) {
				empate2 ="Gol e Palio";
				lugar2 = "";
				lugar3 = "";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Empate em 2° lugar " + empate2);
			}			
		}
		
		if ((palio > corsa)&&(palio > gol)) {
			lugar1 = "Palio";
			if (corsa>gol) {
				lugar2 = "Corsa";
				lugar3 = "Gol";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if (gol>corsa) {
				lugar2 = "Gol";
				lugar3 = "Corsa";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if(corsa == gol) {
				empate2 ="Corsa e Gol";
				lugar2 = "";
				lugar3 = "";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Empate em 2° lugar " + empate2);
			}
		}
		if ((gol > palio)&&(gol > corsa)) {
			lugar1 = "Gol";
			if (corsa>palio) {
				lugar2 = "Corsa";
				lugar3 = "Palio";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if (palio>corsa) {
				lugar2 = "Palio";
				lugar3 = "Corsa";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if(corsa == palio) {
				empate2 ="Corsa e Palio";
				lugar2 = "";
				lugar3 = "";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Empate em 2° lugar " + empate2);
			}	
		}
		
				
		if ((corsa == palio)&&(corsa > gol)) {
			empate1 = "Corsa e Palio";
			lugar3 = "Gol";
			System.out.println("Empate em 1° lugar " + empate1);
			System.out.println("Em 3° lugar " + lugar3);
		}
		if ((corsa == gol)&&(corsa > palio)) {
			empate1 = "Corsa e Gol";
			lugar3 = "Palio";
			System.out.println("Empate em 1° lugar " + empate1);
			System.out.println("Em 3° lugar " + lugar3);
		}
		if ((palio == gol)&&(palio > corsa)) {
			empate1 = "Gol e Palio";
			lugar3 = "Corsa";
			System.out.println("Empate em 1° lugar " + empate1);
			System.out.println("Em 3° lugar " + lugar3);
		}
		if ((palio == gol)&&(palio == corsa)) {
			empate1 = "Corsa, Palio e Gol";
			System.out.println("Empate em 1° lugar " + empate1);
		}
		System.out.println("\n\n O total de votos foi: "+votoTotal);
		
		corsa = ((corsa*100)/votoTotal);
		palio = ((palio*100)/votoTotal);
		gol = ((gol*100)/votoTotal);
		
		System.out.println("O percentual de votos no Corsa é de "+corsa+"%");
		System.out.println("O percentual de votos no Palio é de "+palio+"%");
		System.out.println("O percentual de votos no Gol é de "+gol+"%");
	}

}