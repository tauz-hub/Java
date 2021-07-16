import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Isosceles {
	
	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			
			System.out.println("escreva a medida do mesmo lado");
			double b = tcd.nextDouble();
			System.out.println("escreva a medida da base");
			double v = tcd.nextDouble();
			
			/*
			double area = (v/4) * Math.sqrt((4 *b*b)- (v*v));
			*/
			double o = Math.sqrt(b*b - (v/2)*(v/2));
			double area = (v*o)/2;
			
			System.out.println("a area é : "+ area);
			
			//exibindo o formatado
			NumberFomat n = new DecimalFormat("#.##0.00");
			System.out.println("area é : "+  n.format(area));
		}catch(Exception e) {
			System.out.println("Falha: " + e.getMessage());
			
		}
			
	}

}
