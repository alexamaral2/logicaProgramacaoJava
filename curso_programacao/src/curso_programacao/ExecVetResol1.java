package curso_programacao;

import java.util.Scanner;

public class ExecVetResol1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N]; 
		
		for(int i = 0; i < N; i++) {
			vet[i] = sc.nextInt();
		}
		

		for(int i = 0; i < N; i++) {
			if (vet[i] < 0){
				System.err.println(vet[i]);
			}
		}
	}

}
