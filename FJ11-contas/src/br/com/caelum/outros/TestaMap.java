package br.com.caelum.outros;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaMap {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.depositar(10000);
		
		Conta c2 = new ContaCorrente();
		c2.depositar(3000);
		
		//Cria o mapa
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
		//adiciona chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		//Qual a conta do diretor?
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());

	}

}
