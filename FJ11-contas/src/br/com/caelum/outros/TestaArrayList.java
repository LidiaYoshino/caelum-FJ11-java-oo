package br.com.caelum.outros;

import java.util.ArrayList;
import java.util.Collections;

public class TestaArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		for(int i = 1; i < 1001; i++) {
			lista.add(i);
		}
		
		Collections.reverse(lista);
		System.out.println(lista);

	}

}
