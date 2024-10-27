package curso_programacao;

import java.util.Scanner;

public class ExecPropMatriz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] matA = new int[M][N];
		int[][] matB = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matA[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matB[i][j] = sc.nextInt();
			}
		}

		int[][] matSoma = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matSoma[i][j] = matA[i][j] + matB[i][j];
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matSoma[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
