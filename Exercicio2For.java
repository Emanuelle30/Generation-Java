package AtividadesForWhileDoWhile;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		int x,num = 0;
		float somaPar=0,somaImpar=0;
	
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nPROGRAMA QUE LER E SOMA N�MEROS PARES E �MPARES.");
		
		for(x=1;x<=10;x++)
			{System.out.println("\nEntre com o n�mero: ");
		num=leia.nextInt();
		
		if (num % 2 == 0)
		{
			somaPar++;
			}
		else 
		{	
			somaImpar++;}
			
		}
		System.out.println("\nQuantidade de n�meros pares: "+somaPar);
		System.out.println("\nQuantidade de n�meros �mpares: "+somaImpar);
	}
	}