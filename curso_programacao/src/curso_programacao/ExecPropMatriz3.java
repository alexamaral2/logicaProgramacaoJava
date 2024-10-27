package curso_programacao;

import java.util.Scanner;

public class ExecPropMatriz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();

		int[][] mat = new int[M][M];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int[] vet = new int[M];
		for (int i = 0; i < M; i++) {
			int maior = 0;
			for (int j = 0; j < M; j++) {
				if(mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			vet[i] = maior;
		}

		for (int i = 0; i < M; i++) {
			System.out.println(vet[i]);
		}

		sc.close();
	}

}
