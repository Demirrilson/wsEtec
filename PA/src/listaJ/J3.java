package listaJ;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sexo, resp;
		int continuar=0;
		float pMasc, pFem, contSim = 0, contNao = 0, mascS = 0, femS = 0, mascN = 0, femN = 0;
		
		Scanner leia = new Scanner (System.in);
		
		while (continuar != 1) {
			System.out.println("Você gostou do novo produto?");
			System.out.println("Digite s para sim e n para não");
			resp = leia.next();
			System.out.println("Digite m para masculino e f para feminino");
			sexo = leia.next();
			
			if (resp.equals("s") ) {
				contSim = contSim + 1;
				if (sexo.equals("f")) {
					femS = femS + 1;
				}
				if (sexo.equals("m")) {
					mascS = mascS + 1;
				}
			}
			
			if (resp.equals("n")) {
				contNao = contNao + 1;
				if (sexo.equals("m")) {
					mascN = mascN + 1;
				}
				if (sexo.equals("f")) {
					femN = femN + 1;
				}
			}
			System.out.println("Digite 1 para SAIR ou outro valor para continuar");
			continuar = leia.nextInt();
			
		}
		pFem =((femS * 100)/(femS + femN));
		pMasc = ((mascN * 100)/(mascS + mascN));
		
		System.out.println(" O número de pessoas que responderam Sim foi de: "+contSim);
		System.out.println(" O número de pessoas que responderam Não foi de: "+contNao);
		System.out.println(" A porcentagem de mulheres que responderam Sim foi de: "+pFem+"%");
		System.out.println(" A porcentagem de Homens que responderam Não foi de: "+pMasc+"%");
	}

}
