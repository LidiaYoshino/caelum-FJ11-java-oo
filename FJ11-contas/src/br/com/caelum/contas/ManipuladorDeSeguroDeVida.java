package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
	
	private SeguroDeVida seguroDeVida;
	
	public void criaSeguro(Evento e) {
		this.seguroDeVida = new SeguroDeVida();
		this.seguroDeVida.setNumeroApolice(e.getInt("numeroApolice"));
		this.seguroDeVida.setTitular(e.getString("titular"));
		this.seguroDeVida.setValor(e.getDouble("valor"));
	}

}
