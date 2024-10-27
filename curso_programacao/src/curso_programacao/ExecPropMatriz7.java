package curso_programacao;

import java.util.Scanner;

public class ExecPropMatriz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] formacao = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				formacao[i][j] = sc.nextInt();
			}
		}

		int filaGirar = sc.nextInt() - 1;

		int ultimo = formacao[filaGirar][N - 1];
		for (int j = N - 1; j > 0; j--) {
			formacao[filaGirar][j] = formacao[filaGirar][j - 1];
		}
		formacao[filaGirar][0] = ultimo;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(formacao[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
