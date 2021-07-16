package dia2906estudodofor;

import java.util.Scanner;


public class For {
	
	public static void main(String[] args) {
		// int numeroLinhas = 5;
		Scanner tcd = new Scanner(System.in);
		System.out.println("Informe o número de linhas");
		
		int numeroLinhas = tcd.nextInt();
		
		for( int i=1; i<=numeroLinhas; i++ ) {
			
			for( int j=1 ; j<=i; j++ ) {
				
				System.out.print("*");
			}
		}
	}
}
				
			
		
			
		
	


