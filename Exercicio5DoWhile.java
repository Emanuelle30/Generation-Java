package AtividadesForWhileDoWhile;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 5-Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
     No final, mostre a soma dos números digitados. */
		
		int num,somaNum=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nPROGRAMA QUE SOMA Nº DIGITADOS DIFERENTES DE 0.");
		do
		{	
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			
			somaNum+=num;
		}
		while (num != 0);
		System.out.println("\nA soma dos números digitados é: "+somaNum+".");
}
}