package ListaExercicios;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de N: ");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		
		for (int i=0; i<n ; i++) {
			System.out.println("Digite um n?mero: ");
			int x = sc.nextInt();
			if (x>= 10 && x <= 20) {
				in += 1;
			}else {
				out += 1;
			}
		}
		
		System.out.println("SA?DA DE VALORES: ");
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}
