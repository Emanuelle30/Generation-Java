package AtividadesForWhileDoWhile;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 5-Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
     No final, mostre a soma dos n�meros digitados. */
		
		int num,somaNum=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nPROGRAMA QUE SOMA N� DIGITADOS DIFERENTES DE 0.");
		do
		{	
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();
			
			somaNum+=num;
		}
		while (num != 0);
		System.out.println("\nA soma dos n�meros digitados �: "+somaNum+".");
}
}