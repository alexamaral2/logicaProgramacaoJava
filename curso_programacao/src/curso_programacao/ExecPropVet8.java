package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExecPropVet8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] alturas = new double[N];
		char[] sexo = new char[N];

		for (int i = 0; i < N; i++) {
			alturas[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}

		double menor = alturas[0];
		double maior = alturas[0];
		double somaMulheres = 0.0;
		int numMulheres = 0;
		int numHomens = 0;

		for (int i = 0; i < N; i++) {
			if (alturas[i] > maior) {
				maior = alturas[i];
			}
			if (alturas[i] < menor) {
				menor = alturas[i];
			}

			if (sexo[i] == 'F') {
				somaMulheres += alturas[i];
				numMulheres++;
			} else if (sexo[i] == 'M') {
				numHomens++;
			}
		}

		double mediaMulheres = (double) somaMulheres / numMulheres;

		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
		System.out.printf("Numero de homens = %d%n", numHomens);

		sc.close();
	}
}
