package curso_programacao;

import java.util.Scanner;

public class ExecMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("Menor = " + a);
		} else if (b < a) {
			System.out.println("Menor = " + b);
		} else {
			System.out.println("Menor = " + c);
		}
		sc.close();

	}

}
