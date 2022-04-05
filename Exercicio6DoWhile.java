package AtividadesForWhileDoWhile;

import java.util.Scanner;

public class Exercicio6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*6-Escrever um programa que receba vários números inteiros no teclado. E no final imprima a média dos números múltiplos de 3. 
    Para sair digitar 0(zero).(DO...WHILE)*/
		
		int num,somaNum=0,contMult3=0;
		float numMedia;
				Scanner leia = new Scanner(System.in);
				System.out.println("\nPROGRAMA QUE RETORNA A MÉDIA DOS MULTIPLOS DE 3");
				
		do 
		{
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			
			if(num==0)
				
		{	System.out.println("\nVocê digitou 0, programa finalizado!");
		}
			else
		{	
			if(num %3 == 0)
		{ 	somaNum+=num;
			contMult3++;
		}
	}
					
}
		while (num != 0);
		numMedia = somaNum / contMult3;
		System.out.printf("\nA média dos números multiplos de 3 é: %2.2f",numMedia);
	}
  }

