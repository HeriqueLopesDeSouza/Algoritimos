package Lista_Ligada;

import atividade_lista_ligada.Celula;

public class Lista_Ligada {

	private Celula pri;

	private Celula ult;

	private int total;


	//Adiciona No Começo
	public void adicionar_No_Comeco(Object valor) {
		if(this.total == 0) {
			Celula nova = new Celula(valor);
			this.pri = nova;
			this.ult = nova;
		}else {
			Celula nova = new Celula(this.pri,valor);
			this.pri.setAnterior(nova);
			this.pri = nova;
		}
		this.total++;
	}

	//Adiciona No Fim
	public void adiciona(Object valor) {
		if(this.total == 0) {
			this.adicionar_No_Comeco(valor);
		}else {
			Celula nova = new Celula(valor);
			this.ult.setProxima(nova);
			nova.setAnterior(this.ult);
			this.ult = nova;
			this.total++;
		}
	}

	//Verifica se a posição existe
	private boolean posicaoExiste(int posicao) {
		return posicao >= 0 && posicao < this.total;
	}


	//Pega a Celula
	private Celula pegaCelula(int posicao) {
		if(this.posicaoExiste(posicao)) {

			Celula atual = pri;
			for(int i = 0; i < posicao;i++) {
				atual = atual.getProxima();
			}
			return atual;
		}
		throw new IllegalArgumentException("Posição não Existe");
	}

	//Adiciona Em Determinada Posição	
	public void adiciona(int posicao,Object valor) {
		if(posicao == 0) {
			this.adicionar_No_Comeco(valor);
		} else if(posicao == this.total) {
			this.adiciona(valor);
		}else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProxima();
			Celula nova = new Celula(anterior.getProxima(),valor);
			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			this.total++;
		}
	}


	//Remove do Começo
	public void removeDoComeco() {
		if(!this.posicaoExiste(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}

		this.pri = this.pri.getProxima();
		this.total--;

		if(this.total == 0) {
			this.ult = null;
		}
	}

	//Remove Do Fim 
	public void removeDoFim() {
		if(!this.posicaoExiste(this.total - 1)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		if (this.total == 1) {
			this.removeDoComeco();
		}else {
			Celula penultima = this.ult.getAnterior();
			penultima.setProxima(null);
			this.ult = penultima;
			this.total--;
		}
	}

	//Remove De Qualquer Posição
	public void remove(int posicao) {
		if(!this.posicaoExiste(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}

		if(posicao == 0) {
			this.removeDoComeco();
		}else if (posicao == this.total - 1) {
			this.removeDoFim();
		}else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProxima();
			Celula proxima = atual.getProxima();

			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);

			this.total--;
		}
	}

	//Pega um determindao valor
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	//Verifica Se existe um valor na Lista
	public boolean contem(Object valor) {
		Celula atual = this.pri;

		while(atual != null) {
			if(atual.getElemento().equals(valor)) {
				return true;
			}
			atual = atual.getProxima();
		}
		return false;
	}



	//To String
	public String toString() {

		//Verificar se a Lista está vazia
		if(this.total == 0) {
			return "[]";
		}

		StringBuilder construtor = new StringBuilder("[");
		Celula atual = pri;

		//Vai até o último valor
		for(int i = 0; i < this.total - 1; i++) {
			construtor.append(atual.getElemento());
			construtor.append(", ");
			atual = atual.getProxima(); 
		}

		//Último valor
		construtor.append(atual.getElemento());
		construtor.append("]");

		return construtor.toString();
	}


}
