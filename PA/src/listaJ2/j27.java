package listaJ2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class j27 {

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
		
		String  resultado=null;
		int saga, resp = 0;
		float votoTotal=0, votoMatrix=0, votoSenhor=0;
		String[] listaFilmes= {"Matrix","Senhor dos Anéis"};
		
		Scanner leia = new Scanner (System.in);
		
		while(resp==0){
		    votoTotal++;
		    
		    saga = JOptionPane.showOptionDialog(null, "Escolha sua Saga favorita", "PESQUISA", 0, 
		    		JOptionPane.QUESTION_MESSAGE, null, listaFilmes, listaFilmes[0]);
		    
		    if (saga==0){
		        votoMatrix++;
		    } 
		    if(saga==1){
		        votoSenhor++;
		    }
		    if(votoSenhor<votoMatrix){
		        resultado = "Matrix";
		    }
		    if (votoMatrix<votoSenhor){
		        resultado = "Senhor dos Aneis";
		    } 
		    if (votoSenhor==votoMatrix){
		        resultado = "Empate";
		    } 
		    
		    resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ENTRADA", JOptionPane.YES_NO_OPTION);
		}
		
		JOptionPane.showMessageDialog(null,
				"Fim da Pesquisa!!\n\n"
				+" A saga vencedora foi: "+ resultado +"!!!!\n\n"
				+votoTotal+ " Responderam a pesquisa\n"
				+votoMatrix+ " Pessoas que votaram em Matrix\n"		
				+votoSenhor+ " Pessoas que votaram em Senhor dos Aneis"
				 , "Resultado da Pesquisa", JOptionPane.PLAIN_MESSAGE);
	}

}
