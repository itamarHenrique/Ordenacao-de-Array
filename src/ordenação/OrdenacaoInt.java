package ordenação;

import java.util.Scanner;

public class OrdenacaoInt {

	public static void main(java.lang.String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] num = new int[10];
	
	for (int i = 0; i < num.length; i++) {
		System.out.print("Digite o valor que você deseja: ");
		num[i] = sc.nextInt();
	}
	
	ordenacao(num);
	
	mostrarArray(num);
	
	pesquisaBinaria(num);
	
	sc.close();
}

	public static void ordenacao(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
				 int aux = array[i];
				 array[i] = array[j];
				 array[j] = aux;
			}
		}
		
	}
}

	public static void mostrarArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
			
	}
	
	public static void pesquisaBinaria(int[] array) {
		Scanner sc = new Scanner(System.in);
		boolean acha = false;
		int inicio = 0;
		int fim = array.length - 1;
		int meio;
		int procurar;
		
		System.out.print("Qual numero você quer procurar? ");
		procurar = sc.nextInt();
		
		while(inicio <= fim) {
			meio = (int)((inicio + fim) / 2); //Como os indices só possuem numeros inteiros, queremos apenas os numeros inteiros
			
			if(array[meio] == procurar) {
				acha = true;
				break;
			}else if(array[meio] < procurar) {
				inicio = meio + 1;
			}else {
				fim = meio - 1;
			}
			
		}
		
		if(acha == true) {
			System.out.println(procurar + " foi localizado.");
		}else {
			System.out.println(procurar + " nao foi localizado.");
		}
		sc.close();
	}
	
	
}