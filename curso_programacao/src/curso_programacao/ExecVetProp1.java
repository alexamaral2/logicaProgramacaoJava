package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExecVetProp1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		double maior = 0.0;
		int indice = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				indice = i;
			}
		}

		System.out.println(maior);
		System.out.println(indice);

		sc.close();
	}

}
