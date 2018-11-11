package Escobar_2BIM.Busca_sequencial;

import java.util.Scanner;

public class Busca_sequencial_ex001 {

	public static void main(String[] args) {
		int vetor [] = {9,7,8,4,6,1,3,5,2,0};

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o numero para buscar:");
		int n = ler.nextInt();

		String c = null;
        
		boolean v = false;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == n) {
				c = "Numero:"+n+" encontrado na posição:"+(i+1);
				v = true;
			}
			else if (vetor[i] != n && !v) {
				c = "Numero não encontrado";
			}
		}
		System.out.println();
		System.out.println(c);

	}
}
