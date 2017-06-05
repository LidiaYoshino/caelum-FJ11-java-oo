package br.com.caelum.contas.modelo;

import br.com.caelum.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{
	
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void sacar(double valor) {
		if(valor < this.saldo) {
			throw new SaldoInsuficienteException(valor);
		} else {
			this.saldo -= (valor + 0.10);
		}
	}

	@Override
	public double getValorTmposto() {
		return this.getSaldo() * 0.01;
	}

}
