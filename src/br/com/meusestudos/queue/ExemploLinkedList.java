package br.com.meusestudos.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {

		Queue<String> filaBanco = new LinkedList<String>();
		filaBanco.add("Patricia"); // 1º
		filaBanco.add("Roberto");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");

		System.out.println("Fila do Banco = " + filaBanco);

		// --> peek() Retorna primeiro elemento mas não remove
		String primeiroCliente = filaBanco.peek();
		System.out.println("Primeiro Cliente = " + primeiroCliente);
		System.out.println("Fila do Banco = " + filaBanco);

		// --> poll() chama o cliente a ser atendido e o remove
		String clienteASerAtendido = filaBanco.poll();

		System.out.println("Cliente a ser atendido =  " + clienteASerAtendido);
		System.out.println("Fila do Banco após remoção = " + filaBanco);

	//	filaBanco.clear();

		String primeiroClienteOuErro = filaBanco.element();
		System.out.println(filaBanco);

		for (String element : filaBanco) {
			System.out.println();
		}

		Iterator<String> iteratorFilaBanco = filaBanco.iterator();

		while (iteratorFilaBanco.hasNext()) {
			System.out.println("---->" + iteratorFilaBanco.next());

		}
		// tamanho da lista
		System.out.println(filaBanco.size());
		
		filaBanco.clear();
		// Lista está vazia
		System.out.println(filaBanco.isEmpty());
	}

}
