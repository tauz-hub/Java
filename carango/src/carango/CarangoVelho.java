package carango;

import java.util.Scanner;
import java.util.ArrayList;


public class CarangoVelho {
		
		public static void main(String[] args) {
			try {
			char op = 'S';
			int i = 0,receberAno ,receberValor,total =0;
			int quantidademenorouigual2000 = 0,quantidademaior2000 = 0;
			
			Scanner tcd = new Scanner(System.in);
			ArrayList<Integer> ano = new ArrayList<Integer>();
			ArrayList<Integer> valor = new ArrayList<Integer>();
			ArrayList<Integer> valorcomdesconto = new ArrayList<Integer>();
			

			while(op != 'N' && op != 'n') {
				
				System.out.println("Qual o ano do carro?");
				receberAno = tcd.nextInt();
				ano.add(receberAno);
				
				System.out.println("Qual o valor do carro?");
				receberValor = tcd.nextInt();
				valor.add(receberValor);
				
				if(ano.get(i) <= 2000){
					
				 	valorcomdesconto.add(valor.get(i) - valor.get(i) * 12 / 100) ;
				 	System.out.println("Desconto com Desconto : "+valorcomdesconto.get(i));
				 	quantidademenorouigual2000++;
				}else{								                                
					
					valorcomdesconto.add(valor.get(i) - valor.get(i) * 7 / 100);
					System.out.println("Valor com Desconto : "+valorcomdesconto.get(i));
					quantidademaior2000++;
				}
				
				total = total + valorcomdesconto.get(i);
				i++;
				
				System.out.println("Deseja calcular mais algum desconto?");
				op = tcd.next().charAt(0);
			    
			}
				
			System.out.println("Quantidade de veículos de ano menor ou igual a 2000 : " + quantidademenorouigual2000  + "\n Quantidade de veículos de ano maior de ano 2000 : " + quantidademaior2000 + "\n Valor total dos veículos juntos : " + total);
			
			System.out.println("fim");
			}catch(Exception e) {
				System.out.println("erro");
			}
	}
}