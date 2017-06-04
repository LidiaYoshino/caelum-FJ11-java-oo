package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel{

	private double valor;
	private String titular;
	private int numeroApolice;
	private String tipo;
	
	@Override
	public double getValorTmposto() {
		return 42 + this.valor * 0.02;
	}

	@Override
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	public void setValor(double valor) {
		this.valor = valor;
		
	}
	
	public double getValor() {
		return this.valor;
	}
	
}
