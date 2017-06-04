package br.com.caelum.contas.modelo;

import java.util.List;
import java.util.Map;

public class Banco {
	private List<Conta> contas;
	private Map<String, Conta> mapa;
	
	public void adiciona(Conta c) {
		contas.add(c);
		mapa.put(c.getTitular(), c);
	}
	
	public Conta pega(int x) {
		return contas.get(x);
	}
	
	public int pegaQuantidadeDeContas() {
		return contas.size();
	}
	
	public Conta buscaPorTitular(String nome) {
		return mapa.get(nome);
	}
}
