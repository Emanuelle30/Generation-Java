package AtividadesForWhileDoWhile;

import java.util.Scanner;

public class Exercicio6DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*6-Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprima a m�dia dos n�meros m�ltiplos de 3. 
    Para sair digitar 0(zero).(DO...WHILE)*/
		
		int num,somaNum=0,contMult3=0;
		float numMedia;
				Scanner leia = new Scanner(System.in);
				System.out.println("\nPROGRAMA QUE RETORNA A M�DIA DOS MULTIPLOS DE 3");
				
		do 
		{
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();
			
			if(num==0)
				
		{	System.out.println("\nVoc� digitou 0, programa finalizado!");
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
		System.out.printf("\nA m�dia dos n�meros multiplos de 3 �: %2.2f",numMedia);
	}
  }

