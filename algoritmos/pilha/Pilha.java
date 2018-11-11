package atividade_pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<Parametro> {
	
	private List<Parametro> objetos = new LinkedList<Parametro>();
	
	public void inserir(Parametro objeto) {
		this.objetos.add(objeto);
	}
	
	public Parametro remover() {
		return this.objetos.remove(this.objetos.size() - 1);
		
	}
	
	public boolean vazia() {
		return this.objetos.size() == 0;
	}

	@Override
	public String toString() {
		return "Pilha:" + objetos;
	}
	
	
}