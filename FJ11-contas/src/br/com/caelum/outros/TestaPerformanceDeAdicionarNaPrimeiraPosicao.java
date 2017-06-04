package br.com.caelum.outros;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		System.out.println("Iniciando inserção...");
		List<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		for(int i = 0; i < total; i++){
			teste.add(i, i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Fim! \nTempo gasto: " + tempo);
		
		System.out.println("Iniciando get...");
		inicio = System.currentTimeMillis();
		
		for(int i = 0; i < total; i++){
			teste.get(i);
		}
		
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Fim! \nTempo gasto: " + tempo);

	}

}
