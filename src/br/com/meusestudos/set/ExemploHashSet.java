package br.com.meusestudos.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {

		Set<Double> notasAlunos = new HashSet<>();

		// Set e HashSet não garatem a ordem
		notasAlunos.add(5.5);
		notasAlunos.add(3.0);
		notasAlunos.add(2.4);
		notasAlunos.add(1.6);
		notasAlunos.add(7.8);

		System.out.println(notasAlunos);
	}

}
