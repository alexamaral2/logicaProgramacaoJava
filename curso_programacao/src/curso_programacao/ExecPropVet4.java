package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExecPropVet4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] valores = new double[N];

		for (int i = 0; i < N; i++) {
			valores[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			soma += valores[i];
		}

		double media = (double) soma / N;
		System.out.printf("%.3f%n", media);

		for (int i = 0; i < N; i++) {
			if (valores[i] < media) {
				System.out.println(valores[i]);
			}
		}

		System.out.println();

		sc.close();
	}

}
