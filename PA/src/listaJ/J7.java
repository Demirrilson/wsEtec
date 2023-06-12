package listaJ;

import java.util.Scanner;

public class J7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Desenvolva um programa para realizar uma pesquisa de saga de filmes.
		O programa deverá solicitar a opção de melhor saga de filme para o usuário.
		As sagas concorrentes são: Matrix e Senhor dos Anéis. 
		Ao final o programa deverá indicar qual foi à saga vencedora e 
		o total de votos de cada saga. Se ocorrer um empate, 
		o mesmo deverá ser indicado. O programa deverá realizar a pesquisa 
		enquanto houver a solicitação de uma nova entrada de dados 
		através da variável RESP.
		*/
		
		String saga, resp = "s", resultado=null;
		float votoTotal=0, votoMatrix=0, votoSenhor=0;
		
		Scanner leia = new Scanner (System.in);
		
		while(resp.equals("s")){
		    votoTotal++;
		    System.out.println("Escolha sua Saga favorita");
		    System.out.println("Digite M para votar em Matrix  e S para votar em Senhor dos Aneis");
		    saga = leia.next();
		    if (saga.equals("m")){
		        votoMatrix++;
		    } 
		    if(saga.equals("s")){
		        votoSenhor++;
		    }
		    if(votoSenhor>votoMatrix){
		        resultado = "Matrix";
		    }
		    if (votoMatrix>votoSenhor){
		        resultado = "Senhor dos Aneis";
		    } 
		    if (votoSenhor==votoMatrix){
		        resultado = "Empate";
		    } 
		    
		    
		    System.out.println("Deseja continuar Digite S para sair Digite outra letra");
		    resp = leia.next();
		}
	System.out.println("fim da Pesquisa!!");
	System.out.println("================================================");
	System.out.println(" A saga vencedora foi: "+ resultado +"!!!!");
	System.out.println("================================================");
	System.out.println("  -"+votoTotal+ " Responderam a pesquisa");
	System.out.println("  -"+votoMatrix+ " Pessoas que votaram em Matrix");
	System.out.println("  -"+votoSenhor+ " Pessoas que votaram em Senhor dos Aneis");

	}

}
