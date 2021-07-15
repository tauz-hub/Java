package tryandcatch;

public class Tryandcatchestudo {
	
	public static void main(String[]args) {
		
		try {
			int[] vetor = new int[4];
			 
			System.out.println("Antes do exception");
		
			vetor[4] = 1;
		
			System.out.println("Esse texto nao sera impresso");
		
		} catch(java.lang.ArrayIndexOutOfBoundsException exception) {
			System.out.println("exceção ao acessar um indice do veotr que não existe");
			
		}
		System.out.println("esse texto sera impresso após a exception");
	
	}
}
