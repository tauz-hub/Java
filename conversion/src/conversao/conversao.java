package conversao;

import java.util.Scanner;

public class conversao {

	public static void main(String args[]) {
		
		//byte < short < int < long . float < double
		
		//implicita
		//double a = 10;
		//int b = a;
		
		//explicita,estou dizendo o que eu quero fazer
		double m = 3.5;
		int n =(int)m;
		
		double r = Double.parseDouble("153.11");
		// a variavel r passou a ser double
		
		int x = Integer.parseInt("2");
		//inteiro para inteiro
		
		double k = 55.3;
		String texto = Double.toString(k);
		//uma double para string
		
		int v = 4;
		String s = Integer.toString(v);
		//inteiro para string
		
	}
	
}
