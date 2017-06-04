package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {
	
	private double total;
	
	public void calculaImpostos(Evento e) {
		total = 0;
		int tamanho = e.getTamanhoDaLista("listaTributaveis");
		for(int i = 0; i < tamanho; i++) {
			Tributavel t = e.getTributavel("listaTributaveis", i);
			total += t.getValorTmposto();
		}
	}
	
	public double getTotal() {
		return this.total;
	}
}
