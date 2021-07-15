package carango;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;


public class CarangoVelhov2 {
	
	
		private static Scanner tcd = new Scanner(System.in);
	
	 	private static ArrayList<Integer> ano = new ArrayList<Integer>();
	 
	 	private static ArrayList<Integer> valor = new ArrayList<Integer>();
	 
	 	private static ArrayList<Integer> valorcomdesconto = new ArrayList<Integer>();
		
	 	private static int quantidademenorouigual2000 = 0;
	 	
	 	private static int quantidademaior2000 = 0;
	 	
	 	private static int i = 0;
	 	
	 	public static void exibirEPedirDados() {
	 		
	 		  String tcdAno = "";
	 		  String tcdValor = "";
	 		  int anos = 0;
	 		  int valores = 0;
	 		  
	 		 
	 		    while( !tcdAno.matches("[0-9]+")) {
	 		    	
				tcdAno = JOptionPane.showInputDialog("Qual o ano do carro?");
	 		    	
	 		    }
	 		    
	 		    anos = Integer.parseInt(tcdAno);
	 			ano.add(anos);
	 			
	 			
	 			while( !tcdValor.matches("[0-9]+") ) { 
	 				
				tcdValor = JOptionPane.showInputDialog("Qual o valor do carro?");
	 			}
	 			valores = Integer.parseInt(tcdValor);
	 			
				valor.add(valores);
				
	 	}
	 	
	 	public static int calculartotal() {
	 		int total = 0;
	 		for(int t = 0; t < valorcomdesconto.size(); t++){
	 			total += valorcomdesconto.get(t);
	 		}
	 		return total;
	 	}
	 	
	 	public static void calcularDesconto() {
			
	 		if(ano.get(i) <= 2000){
				
			 	valorcomdesconto.add(valor.get(i) - valor.get(i) * 12 / 100) ;
			 	System.out.println("Desconto com Desconto : "+ valorcomdesconto.get(i));
			 	quantidademenorouigual2000++;
			}else{								                                
				
				valorcomdesconto.add(valor.get(i) - valor.get(i) * 7 / 100);
				System.out.println("Valor com Desconto : "+ valorcomdesconto.get(i));
				quantidademaior2000++;
			}
	 		
	 	}

	 	
	 	public static char opcao() {
	 		char op;
			op = JOptionPane.showInputDialog("Deseja calcular mais algum desconto?").charAt(0);
			return op;
	 	}
	   
		public static void exibirMensagemFinal() {
			JOptionPane.showMessageDialog(null,"Quantidade de veículos de ano menor ou igual a 2000 : " + quantidademenorouigual2000  + "\n Quantidade de veículos de ano maior de ano 2000 : " + quantidademaior2000 + "\n Valor total dos veículos juntos : " + calculartotal());
			System.out.println("Quantidade de veículos de ano menor ou igual a 2000 : " + quantidademenorouigual2000  + "\n Quantidade de veículos de ano maior de ano 2000 : " + quantidademaior2000 + "\n Valor total dos veículos juntos : " + calculartotal());
			
			System.out.println("fim");
		}
	 	
		public static void main(String[] args) {
			
			char op ='S';
			
			while(op != 'N') {
				
				exibirEPedirDados();
				
				calcularDesconto();
				
			    i++;
		
				op = opcao();
				
			}
			exibirMensagemFinal();
			
			
	}
}