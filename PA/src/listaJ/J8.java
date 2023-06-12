package listaJ;

import java.util.Scanner;

public class J8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resp="s", eleito=null;
		int voto;
		float votoFujiro=0, votoTakaro=0,votoNulo=0, votoTotal=0;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Votação para escolha do novo Gerente \n");
		System.out.println("Vote --- 4 --- para eleger FUJIRO NAKOMBI \n");
		System.out.println("Vote --- 6 --- para eleger TAKARO NÉ \n");
		
		while(resp.equals("s")) {
			
			System.out.println("Digite o número do seu voto:");
			voto = leia.nextInt();
			
			votoTotal++;
			
			if (voto == 4) {
				votoFujiro++;
			}
			if (voto == 6) {
				votoTakaro++;
			}
			if ((voto != 6)&&(voto != 4)) {
				votoNulo++;
			}
			
			System.out.println("Para continuar a votação Digite -- S -- para sair Digite outra letra");
		    resp = leia.next();
		
		}
		
		System.out.println("Fim da votação!!!!");
		
		if (votoTakaro == votoFujiro) {
			System.out.println("Necessario o voto de Desempate");
			System.out.println("Vote --- 4 --- para eleger FUJIRO NAKOMBI \n");
			System.out.println("Vote --- 6 --- para eleger TAKARO NÉ \n");
			System.out.println("Digite o número do seu voto:");
			voto = leia.nextInt();
			votoTotal++;
			if (voto == 4) {
				votoFujiro++;
			}
			if (voto == 6) {
				votoTakaro++;
			}
			if ((voto != 6)&&(voto != 4)) {
				votoNulo++;
			}
		}
		if (votoFujiro > votoTakaro) {
			eleito ="Fujiro NaKombi";
		}
		if (votoTakaro > votoFujiro) {
			eleito = "Takaro Né";
		}
		
		System.out.println("Total de votos: " + votoTotal);
		System.out.println("Votos do Fujiro NaKombi: " + votoFujiro);
		System.out.println("Votos do Takaro Né: " + votoTakaro);
		System.out.println("votos Nulos: " + votoNulo);
		
		votoTakaro = ((votoTakaro*100)/votoTotal);
		votoFujiro = ((votoFujiro*100)/votoTotal);
		
		System.out.println("Percentual do votos: "+votoFujiro+"% votaram no Fujiro NaKombi e "+votoTakaro+"% votaram no Takaro Né");
		System.out.println("\n\n -------Nosso novo Gerente é o Sr. "+eleito+", parabéns!!!--------");
		
	
	}

}
