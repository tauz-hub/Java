package aula13maio;

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		
		int ano = 0;
		
		try {
			while( ano < 1800 ) {
				System.out.println("escreva o ano maior ou = a 1800: ");
				ano = tcd.nextInt();
				
				
			}
			
			
			if(ano % 4 == 0) {
				
				if(ano % 100 == 0 ) {
				   
					 if(ano % 400 == 0) {
						 
						 System.out.println("é bissexto");
					 }else {
						 System.out.println("n é bissexto");
					 }
				}else {
					System.out.println("é bissexto");
				}
			}else {
				 System.out.println("n é bissexto");
			}
		} catch(Exception e) {
			System.out.println("erro : " + e.getMessage());
		}
	}

}
