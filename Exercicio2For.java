package AtividadesForWhileDoWhile;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int x,num = 0;
		float somaPar=0,somaImpar=0;
	
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nPROGRAMA QUE LER E SOMA NÚMEROS PARES E ÍMPARES.");
		
		for(x=1;x<=10;x++)
			{System.out.println("\nEntre com o número: ");
		num=leia.nextInt();
		
		if (num % 2 == 0)
		{
			somaPar++;
			}
		else 
		{	
			somaImpar++;}
			
		}
		System.out.println("\nQuantidade de números pares: "+somaPar);
		System.out.println("\nQuantidade de números ímpares: "+somaImpar);
	}
	}