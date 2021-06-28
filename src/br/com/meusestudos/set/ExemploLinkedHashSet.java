package br.com.meusestudos.set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		
		// Mantem a ordem dos elementos
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<Integer>();
		
		sequenciaNumerica.add(3);
		sequenciaNumerica.add(6);
		sequenciaNumerica.add(9);
		sequenciaNumerica.add(1);
		
		System.out.println(sequenciaNumerica);
		
	

	}

}
