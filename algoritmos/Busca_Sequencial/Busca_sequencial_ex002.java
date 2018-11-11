package Escobar_2BIM.Busca_sequencial;

import java.util.Scanner;

public class Busca_sequencial_ex002 {

	public static void main(String[] args) {
		String vetor[] = {"Mystique","Jean Gray","Beast","Logan","Xavier"};

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um nome para buscar:");
		String g = ler.nextLine();
		String a = null; boolean v = false;

		for(int i = 0; i <= vetor.length - 1;i++) {
			if(vetor[i].equals(g)) {
				a = "Nome:"+g+" Encontrado na posição:"+(i+1);
				v = true;
			}
			else if(!vetor[i].equals(g) && !v) {
				a = "Nome não esta na lista";
			}
		}
		System.out.println();
		System.out.println(a);


	}
}
