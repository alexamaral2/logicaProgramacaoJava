package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExecPropMatriz6 {

    public static void main(String[] args) {
        
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[][] matriz = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double somaPositivos = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] > 0) {
                    somaPositivos += matriz[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", somaPositivos);

        int linhaEscolhida = sc.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < N; j++) {
            System.out.printf("%.1f ", matriz[linhaEscolhida][j]);
        }
        System.out.println();

        int colunaEscolhida = sc.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.1f ", matriz[i][colunaEscolhida]);
        }
        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.1f ", matriz[i][i]);
        }
        System.out.println();

        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
                System.out.printf("%.1f ", matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
