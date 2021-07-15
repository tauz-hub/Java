package tryandcatch;

public class Finally {
	
	public static void main(String[]args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
	
		for (int i = 0; i < numeros.length; i++) {
			try {
				
			System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
		
		
		
			//}catch(java.lang.ArithmeticException e1){
				//System.out.println("erro ao dividir por 0");
			}catch(Exception e) {
				//topo de erros
				System.out.println("falta numeros");
				//System.exit(0);//finally nao é executado
			}
			finally {
				System.out.println("essa line é impressao sempre apos o try ou catch");
			}
			
		}
	}
}
