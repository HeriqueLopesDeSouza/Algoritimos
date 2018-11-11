package Escobar_2BIM.Busca_binária;

import java.util.Scanner;

public class Busca_binária_ex01 {

	public static void main(String[] args) {

		int vetor[] = {20,30,25,84,56,12,1,69,78};

		Scanner ler = new Scanner(System.in);
	
		int aux;
		for(int i = 0;  i < vetor.length; i++) {
			for(int j = 0; j < vetor.length -1; j++) {
				if(vetor[j]>vetor[j+1]) {
					aux = vetor[j+1];
					vetor[j+1] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		int y = 0,m,d = vetor.length, resultado = -1;  
		
		System.out.print("Digite um numero para buscar:");
		int busca = ler.nextInt();
		
		while(y <= d) {
			m = (y+d)/2;
			if(vetor[m] == busca) {
				resultado = m;
			}
			if(vetor[m]<busca) {
				y = m + 1;
			}
			else{
				d = m - 1;
			}
		}
		
		System.out.println();
		System.out.println("Numero:"+busca+" encontrado na posição:"+(resultado+1));
	
	
	}
}
