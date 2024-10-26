package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExecPropVet9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] nomes = new String[N];
		double[] precoCompra = new double[N];
		double[] precoVenda = new double[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			precoCompra[i] = sc.nextDouble();
			precoVenda[i] = sc.nextDouble();
		}

		int lucroAbaixo10 = 0;
		int lucroEntre10e20 = 0;
		int lucroAcima20 = 0;
		double totalCompra = 0.0;
		double totalVenda = 0.0;

		for (int i = 0; i < N; i++) {
			double lucro = (precoVenda[i] - precoCompra[i]) / precoCompra[i] * 100;

			if (lucro < 10) {
				lucroAbaixo10++;
			} else if (lucro <= 20) {
				lucroEntre10e20++;
			} else {
				lucroAcima20++;
			}

			totalCompra += precoCompra[i];
			totalVenda += precoVenda[i];
		}

		double lucroTotal = totalVenda - totalCompra;

		System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
		System.out.println("Lucro entre 10% e 20%: " + lucroEntre10e20);
		System.out.println("Lucro acima de 20%: " + lucroAcima20);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", lucroTotal);

		sc.close();
	}
}
