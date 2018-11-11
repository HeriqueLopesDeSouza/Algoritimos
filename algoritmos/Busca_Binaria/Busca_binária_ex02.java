package Escobar_2BIM.Busca_binária;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Scanner;

public class Busca_binária_ex02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String vetor [] = {"Alice","Miguel","Ayla","Cloe","Felícia","Ieda","Johanna"};

		String aux;
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j].compareTo(vetor[j+1])>0) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}

		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		System.out.println();
		System.out.print("Digite um nome para buscar:");
		String nome = ler.nextLine();

		int y = 0, d = vetor.length - 1,m,resultado = - 2;

		while(y <= d) {
			m = (y+d)/2;

			if(vetor[m].equals(nome)) {
				resultado = m;
			}

			if(vetor[m].compareTo(nome)<0) {
				y = m + 1;
			}

			else {
				d = m - 1;
			}
		}

		System.out.println();
		System.out.println("Nome:"+nome+" encontrado na posição:"+(resultado+1));
	}
}
