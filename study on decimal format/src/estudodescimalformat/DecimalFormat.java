package estudodescimalformat;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormat {
	
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
		System.out.println("escreva O RAIO DO CIRCULO");
		double raio = tcd.nextDouble();
		
		double area = Math.PI * raio *raio;
		
		double comprimento = 2 * Math.PI * raio;
		
		NumberFormat nf = new DecimalFormat("#,##0.00");
		
		
		
		System.out.println("area é : " + nf.format(area) );
		
		System.out.println("comprimento é : " + nf.format(comprimento) );
		
	}

}
