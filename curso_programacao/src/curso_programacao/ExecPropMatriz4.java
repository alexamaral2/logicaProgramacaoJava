package curso_programacao;

import java.util.Scanner;

public class ExecPropMatriz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();

		int[][] mat = new int[M][M];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int soma = 0;
		for (int i = 0; i < M; i++) {
			for (int j = i + 1; j < M; j++) {
				soma += mat[i][j];
			}
		}

		System.out.println(soma);

		sc.close();
	}
}
