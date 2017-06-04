package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			Conta conta = new ContaCorrente();
			Random random = new Random();
			int valor = random.nextInt(1000);
			conta.depositar(valor);
			contas.add(conta);
			System.out.println(conta.getSaldo());
		}
	}

}
