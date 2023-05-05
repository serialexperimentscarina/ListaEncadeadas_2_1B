package view;

import br.com.serialexperimentscarina.listaint.ListaInt;
import controller.OrdernarController;

public class Principal {

	public static void main(String[] args) {
		OrdernarController ordenarCont = new OrdernarController();
		ListaInt lista = new ListaInt();
		int[] valores = {10, 5, 8, 1, 9, 2, 4, 7, 3, 6};
		
		try {
			System.out.print("Lista : ");
			for (int valor : valores) {
				lista.addLast(valor);
				System.out.print(valor + " ");
			}
			
			System.out.print("\nLista ordenada : ");
			ordenarCont.ordenar(lista);
			int tamanho = lista.size();
			for (int i = 0; i < tamanho; i++) {
				System.out.print(lista.get(i) + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
