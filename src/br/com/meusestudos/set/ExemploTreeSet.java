package br.com.meusestudos.set;

import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
	
		TreeSet<String> treeCapitais = new TreeSet<String>();

		// Monta uma arvore com as capitais
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianopolis");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		// Retorna a primeira capital do topo da arvore
		System.out.println(treeCapitais.first());
		
		//Retorna a ultima capital no final da arvore 
		System.out.println(treeCapitais.last());
		
		//Retorna a primira capital abaixo na arvore da capital parametrizada
		System.out.println(treeCapitais.lower("Florianopolis"));
		
		//Retorna a primira capital acima na arvore da capital parametrizada
		System.out.println(treeCapitais.higher("Florianopolis"));
		
		//exibe todas as capitais no console 
		System.out.println(treeCapitais);
		
		//Retorna a primeira capital no topo da arvore, removendo do set 
		System.out.println(treeCapitais.pollFirst());
		
		//Retorna a primeira capital no topo da arvore, removendo do set 
		System.out.println(treeCapitais.pollLast());
	}

}
