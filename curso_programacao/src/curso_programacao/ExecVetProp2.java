package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExecVetProp2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] pares = new int[N];

		for (int i = 0; i < N; i++) {
			pares[i] = sc.nextInt();
		}

		int quantidade = 0;
		for (int i = 0; i < N; i++) {
			if (pares[i] % 2 ==  0) {
				System.out.println(pares[i]);
				quantidade++;
			}
		}

		System.out.println(quantidade);

		sc.close();
	}

}
