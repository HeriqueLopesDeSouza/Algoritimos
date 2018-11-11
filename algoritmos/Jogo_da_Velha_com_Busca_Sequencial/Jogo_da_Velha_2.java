import java.util.Scanner;

public class Jogo_da_Velha_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [][] v = new char [3][3];
		String s = " "; String r = " "; int i; boolean game = false; 
		boolean velha = false;
		boolean o = false; int count = 9;

		Scanner ler = new Scanner(System.in);
		//inicia o tabuleiro 
		for( i = 0; i < v.length; i++) {
			for(int j = 0; j <v[0].length; j++) {	
				System.out.print("Digite o valor:");
				char x = ler.next().charAt(0);
				v[i][j] = x;
			}
		}

		System.out.println();
		//mostra o tabuleiro
		for( i = 0; i < v.length; i++) {
			for(int j = 0; j <v[0].length; j++) {	
				System.out.print("|"+v[i][j]);	 
			}
			System.out.println("|");
		}

		System.out.println();

		do {
			//Bolinha faz sua jogada 
			System.out.println("Jogador 1 BOLINHA");		
			char busca = ler.next().charAt(0);

			for( i = 0; i < v.length; i++) {
				for(int j = 0; j <v[0].length; j++) {
					if(busca == v[i][j]) {	
						busca = 'O';
						v[i][j] = busca;

					}
				}
			}

			//verifica se Bolinha ganhou 
			for( i = 0; i < v.length; i++) {
				for(int j = 0; j <v[0].length; j++) {
					if(v[0][j]== 'O' && v[1][j] =='O' && v[2][j] =='O' ) {	
						game = true;      
						velha = true;
						s = "Vencedor O";
						o = true;
					}

					else if(v[i][0] == 'O' && v[i][1] =='O' && v[i][2] =='O' ) {	
						game = true;
						velha = true;
						s = "Vencedor O";
						o = true;	
					}

					else if(v[0][0] == 'O' && v[1][1] =='O' && v[2][2] =='O' || v[2][0] == 'O' && v[1][1] =='O' && v[0][2] =='O') {	
						game = true;
						velha = true;
						s = "Vencedor O";
						o = true;
					}
				}
			}

			//conta o numero de jogadas  de 9 a 0 chegando em 0 da velha
			count --;

			//verifica o contador
			if(!velha) {	  
				if (count == 0) {
					s = "Velha";
					game = true;
					o = true;
				}
			}
			//mostra o tabuleiro
			for( i = 0; i < v.length; i++) {
				for(int j = 0; j <v[0].length; j++) {	
					System.out.print("|"+v[i][j]);	 
				}
				System.out.println("|");
			}

			System.out.println();

			if( o != true) {

				// X faz sua jogada
				System.out.println("Jogador 2 X ");
				busca = ler.next().charAt(0);

				for( i = 0; i < v.length; i++) {
					for(int j = 0; j <v[0].length; j++) {
						if(busca == v[i][j]) {	
							busca = 'X';
							v[i][j] = busca;								
						}
					}
				}

				//mostra o tabuleiro
				for( i = 0; i < v.length; i++) {
					for(int j = 0; j <v[0].length; j++) {	
						System.out.print("|"+v[i][j]);	 
					}
					System.out.println("|");
				}

				//verifica se X ganhou 
				for( i = 0; i < v.length; i++) {
					for(int j = 0; j <v[0].length; j++) {
						if(v[0][j]== 'X' && v[1][j] =='X' && v[2][j] =='X' ) {	
							game = true;
							velha = true;
							s = "Vencedor X";
							break;
						}

						else if(v[i][0] == 'X' && v[i][1] =='X' && v[i][2] =='X' ) {	
							game = true;  
							velha = true;
							s = "Vencedor X";
							break;
						}

						else if(v[0][0] == 'X' && v[1][1] =='X' && v[2][2] =='X' || v[2][0] == 'X' && v[1][1] =='X' && v[0][2] =='X' ) {	
							game = true;
							velha = true;
							s = "Vencedor X";
							break;
						}
					}
				}
				
				//conta o numero de jogadas  de 9 a 0 chegando em 0 da velha
				count --;
				
				//verifica o contador
				if(!velha) {	  
					if (count == 0) {
						s = "Velha";
						game = true;
					}
				}
			}

		}while(game != true);
		System.out.println("---------------------");
		System.out.println(s);
	}
}
