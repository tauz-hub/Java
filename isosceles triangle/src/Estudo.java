/*import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;*/

public class Estudo {
	public static void main(String[] args) {
		
		int f = 1;//fatorial
		int n = 4;//numero de caracteres
		
		//for ( int i = 1; i <= n; i++) {
			//f = f * 1;
			//1=1*1;
		//}
		
		int i=1;
		//variavel i do tp int = 1
		while( i <= n) {
			f = f * i;
			i++;
		}
		
		
		
		System.out.println("fatorial " + n + " sao as possibilidades " + f);
		
		
		
		
	}

}
