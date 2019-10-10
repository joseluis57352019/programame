import java.util.*;

import java.util.Scanner;

public class P362DiaNavidad {

	public static void main(String[] args) {

		int x, d, m;
		
		Scanner teclado = new Scanner(System.in);

		x = teclado.nextInt();
		
		while(x>0 ){

			d = teclado.nextInt();
			m = teclado.nextInt();
		
			if(d==25 &&m==12) {
					System.out.println("SI");
			}
			else {
				System.out.println("NO");
			}
			x--;
		}
	}

}
