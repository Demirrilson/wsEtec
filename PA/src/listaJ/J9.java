package listaJ;

import java.util.Scanner;

public class J9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resp="s", lugar1=null, lugar2=null,lugar3=null,empate1=null, empate2=" ";
		int voto;
		float votoTotal=0, cursoCC=0, cursoD=0,cursoL=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Votação de Pretenção de Curso \r\n");
		System.out.println("Curso				Código do Curso \r\n"
				+ "Ciência da Computação			2 \r\n"
				+ "Direito					4 \r\n"
				+ "Letras					6 \r\n");
		while(resp.equals("s")) {
			System.out.println("Digite o Código do curso escolhido:");
			voto = leia.nextInt();
			if (voto == 2) {
				cursoCC++;
			}
			if (voto == 4) {
				cursoD++;
			}			
			if (voto == 6) {
				cursoL++;
			}
			
			votoTotal++;
			System.out.println("Para continuar a votação Digite -- S -- para sair Digite outra letra");
		    resp = leia.next();
		}
		System.out.println("Fim da votação!!!!");
		
		if ((cursoCC > cursoD)&&(cursoCC > cursoL)) {
			lugar1 = "Ciência da Computação";
			if (cursoD>cursoL) {
				lugar2 = "Direito";
				lugar3 = "Letras";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if (cursoL>cursoD) {
				lugar2 = "Letras";
				lugar3 = "Direito";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if(cursoL == cursoD) {
				empate2 ="Letras e Direito";
				lugar2 = "";
				lugar3 = "";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Empate em 2° lugar " + empate2);
			}			
		}
		
		if ((cursoD > cursoCC)&&(cursoD > cursoL)) {
			lugar1 = "Direito";
			if (cursoCC>cursoL) {
				lugar2 = "Ciência da Computação";
				lugar3 = "Letras";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if (cursoL>cursoCC) {
				lugar2 = "Letras";
				lugar3 = "Ciência da Computação";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if(cursoCC == cursoL) {
				empate2 ="Ciência da Computação e Letras";
				lugar2 = "";
				lugar3 = "";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Empate em 2° lugar " + empate2);
			}
		}
		if ((cursoL > cursoD)&&(cursoL > cursoCC)) {
			lugar1 = "Letras";
			if (cursoCC>cursoD) {
				lugar2 = "Ciência da Computação";
				lugar3 = "Direito";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if (cursoD>cursoCC) {
				lugar2 = "Direito";
				lugar3 = "Ciência da Computação";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Em 2° lugar " + lugar2);
				System.out.println("Em 3° lugar " + lugar3);
			}
			if(cursoCC == cursoD) {
				empate2 ="Ciência da Computação e Direito";
				lugar2 = "";
				lugar3 = "";
				System.out.println("Em 1° lugar " + lugar1);
				System.out.println("Empate em 2° lugar " + empate2);
			}	
		}
		
				
		if ((cursoCC == cursoD)&&(cursoCC > cursoL)) {
			empate1 = "Ciência da Computação e Direito";
			lugar3 = "Letras";
			System.out.println("Empate em 1° lugar " + empate1);
			System.out.println("Em 3° lugar " + lugar3);
		}
		if ((cursoCC == cursoL)&&(cursoCC > cursoD)) {
			empate1 = "Ciência da Computação e Letras";
			lugar3 = "Direito";
			System.out.println("Empate em 1° lugar " + empate1);
			System.out.println("Em 3° lugar " + lugar3);
		}
		if ((cursoD == cursoL)&&(cursoD > cursoCC)) {
			empate1 = "Letras e Direito";
			lugar3 = "Ciência da Computação";
			System.out.println("Empate em 1° lugar " + empate1);
			System.out.println("Em 3° lugar " + lugar3);
		}
		if ((cursoD == cursoL)&&(cursoD == cursoCC)) {
			empate1 = "Letras, Direito e Ciência da Computação";
			System.out.println("Empate em 1° lugar " + empate1);
		}
		System.out.println("\n\n O total de votos foi: "+votoTotal);
		
		cursoCC = ((cursoCC*100)/votoTotal);
		cursoD = ((cursoD*100)/votoTotal);
		cursoL = ((cursoL*100)/votoTotal);
		
		System.out.println("O percentual de votos em Ciência da Computação é de "+cursoCC+"%");
		System.out.println("O percentual de votos em Direito é de "+cursoD+"%");
		System.out.println("O percentual de votos em Letras é de "+cursoL+"%");
	}

}
