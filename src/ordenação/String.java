package ordenação;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] num = new int[10];
	
	for (int i = 0; i < num.length; i++) {
		System.out.print("Digite o valor que você deseja: ");
		num[i] = sc.nextInt();
	}
	
	ordenacao(num);
	
	mostrarArray(num);
	
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
}
