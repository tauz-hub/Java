package tryandcatch;

import java.util.Scanner;

public class usandothrows {
	
	public static void main(String[] args) {
		
		
		System.out.println("entre com um numero decimal");
		try {
			
			
			double num = leNumero();
			System.out.println("voce escreveu" + num);
		} catch (Exception e) {
			System.out.println("entrada invalida");
			e.printStackTrace();
		}
	}
	public static double leNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}
