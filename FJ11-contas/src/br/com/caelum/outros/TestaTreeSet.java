package br.com.caelum.outros;

import java.util.TreeSet;

public class TestaTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		TreeSet<Integer> reverse = new TreeSet<>();
		
		for(int i = 1; i < 1001; i++) {
			treeSet.add(i);
		}
		
		reverse = (TreeSet) treeSet.descendingIterator();
		System.out.println(reverse);
	}

}
