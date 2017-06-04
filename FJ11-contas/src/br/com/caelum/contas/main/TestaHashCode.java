package br.com.caelum.contas.main;

import java.util.HashSet;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaHashCode {

	public static void main(String[] args) {
		HashSet<Conta> contas = new HashSet<>();
		
		Conta c1 = new ContaCorrente();
		c1.setAgencia("1234");
		c1.setNumero(4567);
		c1.setTitular("José");
		contas.add(c1);
		
		Conta c2 = new ContaCorrente();
		c2.setAgencia("1234");
		c2.setNumero(4567);
		c2.setTitular("Maria");
		contas.add(c2);
		
		System.out.println(contas);
	}

}
