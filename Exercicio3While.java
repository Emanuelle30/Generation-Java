package AtividadesForWhileDoWhile;

import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3-Solicitar a idade de várias pessoas e imprimir: 
		 Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
		 O programa termina quando idade for =-99. (WHILE)*/
		
		int idade=0,menos21=0,mais50=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nPROGRAMA QUE CLASSIFICA E INFORMA A IDADE DE PESSOAS ENTRE <21 E >50.");
		while (idade != -99)
		{	
			System.out.println("\nInforme a idade: ");
			idade = leia.nextInt();
			
			if (idade < 21 && idade >= 0)
			{
				menos21++;
			}
			else if (idade>50)
			{mais50++;}
		}
			System.out.println("\nO total de pessoas com menos de 21 anos é: "+menos21+".");
			System.out.println("\nO total de pessoas com mais de 50 anos é: "+mais50+".");
	}

}