package controller;

import br.com.serialexperimentscarina.listaint.ListaInt;
import br.com.serialexperimentscarina.pilhaint.PilhaInt;

public class OrdernarController {
	
	public void ordenar(ListaInt lista) throws Exception {
		PilhaInt pilha = new PilhaInt();
		
		// Puxa o menor valor atual da lista para a pilha e o remove da lista, até que a lista esteja vazia
		while (!lista.isEmpty()) {
			int tamanho = lista.size();
			int menor = lista.get(0), pos = 0;
			
			for (int i = 1; i < tamanho; i++) {
				int val = lista.get(i);
				if (val < menor) {
					menor = val;
					pos = i;
				}
			}
			pilha.push(menor);
			lista.remove(pos);
		}
		// Repopula a lista com os valores em ordem, removendo-os da pilha até que esta esteja vazia
		while(!pilha.isEmpty()) {
			lista.addFirst(pilha.pop());
		}
	}

}
