package tryandcatch;

public class Tryandcatchestudo {
	
	public static void main(String[]args) {
		
		try {
			int[] vetor = new int[4];
			 
			System.out.println("Ante do exception");
		
			vetor[4] = 1;
		
			System.out.println("Esse texto nao sera impresso");
		
		} catch(java.lang.ArrayIndexOutOfBoundsException exception) {
			System.out.println("exceçao ao acessar um indice do veotr que nao existe");
			
		}
		System.out.println("esse texto sera impresso apos a exception");
	
	}
}
