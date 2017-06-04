package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100);
		System.out.println(cc.getValorTmposto());
		//cc.depositar(-50);
		//cc.sacar(-50);
		
		System.out.println(123.4);
		
		//Testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.getValorTmposto());
	}

}
