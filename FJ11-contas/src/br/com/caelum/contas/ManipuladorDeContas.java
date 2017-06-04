package br.com.caelum.contas;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta c1;
	
	public void criaConta(Evento e) {
		String tipo = e.getSelecionadoNoRadio("tipo");
		if(tipo.equals("Conta Corrente")) {
			this.c1 = new ContaCorrente();
		} else if(tipo.equals("Conta Poupança")) {
			this.c1 = new ContaPoupanca();
		}
		this.c1.setAgencia(e.getString("agencia"));
		this.c1.setNumero(e.getInt("numero"));
		this.c1.setTitular(e.getString("titular"));
	}
	
	public void deposita(Evento e) {
		double valorDigitado = e.getDouble("valorOperacao");
		this.c1.depositar(valorDigitado);
	}
	
	public void saca(Evento e) {
		double valorDigitado = e.getDouble("valorOperacao");
		this.c1.sacar(valorDigitado);
	}
	
	public void transfere(Evento e) {
		Conta destino = (Conta) e.getSelecionadoNoCombo("destino");
		this.c1.transferir(e.getDouble("valorTransferencia"), destino);
	}
	
	public void ordenaLista(Evento evento) {
		List<Conta> contas = evento.getLista("destino");
		Collections.sort(contas);
		Collections.rotate(contas, -1);
	}
	
	public void salvaDados(Evento e) {
		List<Conta> contas = e.getLista("listaContas");
		RepositorioDeContas repositorio = new RepositorioDeContas();
		repositorio.salva(contas);
	}
	
	public List<Conta> carregaDados() throws FileNotFoundException {
		RepositorioDeContas repositorio = new RepositorioDeContas();
		return repositorio.carrega();
	}
	
}