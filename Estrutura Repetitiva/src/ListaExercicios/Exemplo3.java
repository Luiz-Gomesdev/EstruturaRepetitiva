package ListaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o n?mero de casos: ");
		int N = sc.nextInt();
				
		for (int i=0; i<N; i++) {
			
			System.out.println("Escreva 3 n?meros: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = ((a*2)+(b*3)+(c*5))/10;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
