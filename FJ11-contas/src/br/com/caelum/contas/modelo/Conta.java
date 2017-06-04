package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta>{

	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	

	public Conta() {
	}

	public Conta(String titular, int numero, String agencia) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public abstract String getTipo();

	public void depositar(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo.");
		} else {
			this.saldo += valor;
		}
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void transferir(double valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	@Override
	public String toString() {
		return "[Titular= " + titular.toUpperCase() + ", numero= " + numero + ", agencia= " + agencia + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

}
