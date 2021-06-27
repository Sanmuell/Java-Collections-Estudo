package br.com.meusestudos.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Anderson");
		nomes.add("Juliana");
		nomes.add("Joao");

		System.out.println(nomes);

		// Ordenando 
		Collections.sort(nomes);
		System.out.println(nomes);
		
		//mostrando indice do item
		int posicao = nomes.indexOf("Carlos");
		System.out.println("Indice de carlos na lista é = " + posicao);

		// Alterando o elemento 2
		nomes.set(2, "Larissa");
		System.out.println(nomes);

		// Removendo elemento 4
		nomes.remove(4);
		System.out.println(nomes);
		
		// Retornando nome em uma posicao 
		String nome = nomes.get(0);
		System.out.println(nome);
		
		//retornando o tamanho da fonte
		int tamanho = nomes.size();
		System.out.println(tamanho);


		boolean temAnderson = nomes.contains("Anderson");
		System.out.println(temAnderson);
		
		boolean listaEstaVazia = nomes.isEmpty();
		System.out.println(listaEstaVazia);
		
		// pecorre toda a lista e imprime todos os itens 
		for (String nomeDoItem : nomes) {
			System.out.println("-----> " + nomeDoItem);
		}
		
		// retorna um interator de String
		Iterator<String> iterator = nomes.iterator();
		while (iterator.hasNext()) { //retornar um booleano TRUE sempre que existir mais 1 elemento na lista  
			System.out.println(iterator.next());; // retorna o objeto q está interando
			
		}
	}

}
