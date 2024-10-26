package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class execResolVet03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];

        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();
        }

        double somaAlturas = 0.0;
        for (double altura : alturas) {
            somaAlturas += altura;
        }
        double mediaAltura = somaAlturas / N;
        System.out.printf("Altura media %.2f%n", mediaAltura);

        int contMenor16 = 0;
        for (int idade : idades) {
            if (idade < 16) {
                contMenor16++;
            }
        }

        double percentualMenor16 = (double) contMenor16 * 100.0 / N;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenor16);

        sc.close();
    }
}
