package listaJ;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador =200 , contagem = 0;
		
		System.out.println("Crescente");
		
		while (contador >100) {
				contagem = contagem +1;
				System.out.println(contagem);
				contador = contador -1;
		}
		System.out.println("Decrescente");
		
		while (contador >0) {
			System.out.println(contagem);
			contagem = contagem -1;
			contador = contador -1;
	}
	System.out.println("FIM!");

	}

}
