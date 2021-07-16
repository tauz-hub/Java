package aula13maio;

public class JurosCompostos {
	public static void main(String[] args) {
		
	
	
	double p, t, r, n, result;
	
	p = 2000;
	t = 5;
	r = 0.08;
	n = 12;
	
	result = p * Math.pow(1 + (r/n) , n*t);
	System.out.println("Valor apos " + t + " anos: " + result);
	double juroscalculado = result;
	
	}
}
