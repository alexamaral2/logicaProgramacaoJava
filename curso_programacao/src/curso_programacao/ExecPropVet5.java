package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExecPropVet5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] valores = new int[N];

		for (int i = 0; i < N; i++) {
			valores[i] = sc.nextInt();
		}

		double soma = 0.0;
		int cont = 0;
		for (int i = 0; i < N; i++) {
			if (valores[i] % 2 ==0) {
				soma += valores[i];
				cont += 1;
			}
		}

		double media = (double) soma / cont;
		
		System.out.printf("%.1f%n", media);
		System.out.println();

		sc.close();
	}

}
