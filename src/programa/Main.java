package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int auxiliar = 0;
		int v[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe um número: ");
			v[i] = sc.nextInt();
			for(int g = 0; g < 10; g++) {
				if(v[i] < v[g]) {
					auxiliar = v[i];
					v[i] = v[g];
					v[g] = auxiliar;
					
				}
			}
		}
		
		for(int i = 0; i<10; i++) {
			System.out.print(v[i] + " ");
		}
		
		sc.close();
		

	}

}
