package listaI;


import javax.swing.JOptionPane;

public class I9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  resultado=null;
		int saga;
		float votoTotal=0, votoMatrix=0, votoSenhor=0;
		String[] listaFilmes= {"Matrix","Senhor dos Anéis"};
		
		
		for (int i = 0; i <20; i++) {
		
		    votoTotal++;
		    
		    saga = JOptionPane.showOptionDialog(null, "Escolha sua Saga favorita", "PESQUISA Resposta"
		    		+votoTotal+" de 20", 0, 
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
		    
		    JOptionPane.showMessageDialog(null,
					"Proxima Resposta"
					 , "Pesquisa", JOptionPane.PLAIN_MESSAGE);
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
