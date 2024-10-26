package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExecPropVet6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nomes = new String[N];
		double[] idades = new double[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextDouble();
		}

		double maior = 0.0;
		String pessoa = "";
		for (int i = 0; i < N; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				pessoa = nomes[i];
			}
		}

		System.out.printf("Pessoa mais velha: %s %n", pessoa);

		sc.close();
	}

}
