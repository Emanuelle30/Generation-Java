package AtividadesForWhileDoWhile;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1-Informar todos os n�meros de 1000 a 1999, que quando 
		 divididos por 11 obtemos resto = 5*/

			int n;
		
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nPROGRAMA QUE INFORMA TODOS OS N�MEROS DE 1000 A 1999, QUE QUANDO DIVIDIDOS POR 11, OBTEMOS O RESTO 5.");
			
			for (n=1000;n<=2000;n++)
			{
				if (n % 11 == 5)
			{
					System.out.println(""+n);
			}
				
	}

	}}