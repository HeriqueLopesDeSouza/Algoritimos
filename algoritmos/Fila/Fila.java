package atividade_fila;

import java.util.LinkedList;
import java.util.List;

public class Fila<Parametro> {

	  private List<Parametro> objetos = new LinkedList<Parametro>();

	  public void insere(Parametro t) {
	    this.objetos.add(t);
	  }

	  public Parametro remove() {
	    return this.objetos.remove(0);
	  }

	  public boolean vazia() {
	    return this.objetos.size() == 0;
	  }
	}
