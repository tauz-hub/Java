package aula13maio;

import java.util.Scanner;

public class JurosSimples {
	
	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		float p, r, t, result;
		
		System.out.println("escreva o valor principal");
		p = tcd.nextFloat();
		
		System.out.println("escreva a taxa de juros");
		r = tcd.nextFloat();
		
		System.out.println("escreva o periodo");
		t = tcd.nextFloat();
		
		result = (p * r * t)/100;
		
		System.out.println("o juros é " + result);
		
	}
	

}
