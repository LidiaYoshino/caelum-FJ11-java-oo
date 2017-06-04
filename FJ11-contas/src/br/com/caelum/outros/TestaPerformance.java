package br.com.caelum.outros;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando inserção ArrayList...");
		Collection<Integer> teste = new HashSet<>();
		long inicioInsercao = System.currentTimeMillis();
		
		int total = 50000;
		
		for(int i = 0; i < total; i++){
			teste.add(i);
		}
		
		long fimInsercao = System.currentTimeMillis();
		long tempo = fimInsercao - inicioInsercao;
		System.out.println("Fim! \nTempo gasto: " + tempo);
		
		System.out.println("Iniciando busca ArrayList...");
		long inicioBusca = System.currentTimeMillis();
		
		for(int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fimBusca = System.currentTimeMillis();
		long tempoBusca = fimBusca - inicioBusca;
		System.out.println("Fim! \nTempo gasto: " + tempoBusca);
	}

}
