package AtividadesForWhileDoWhile;

import java.util.Scanner;

public class Exercicio4While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade,genero,fpsico,contPesCalmas=0,contMulNervosas=0,contHomAgressivos=0,contOutCalmas=0,contPesNervosas40=0,contPesCalma18=0,pessoas=1;       
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nSISTEMA DE LEITURA DE DADOS");
		while(pessoas<=5)
		{	
			System.out.println("\nInforme a sua idade: ");
			idade = leia.nextInt();
			while(idade<1 || idade>130)
		{		
				System.out.println("\nO valor informado não é válido!");
				System.out.println("\nEntre novamente com a sua idade: ");
				idade = leia.nextInt();
		}				
			System.out.println("\nEntre com o seu genero: 1-Masculino 2-Feminino 3-Outros");
			genero = leia.nextInt();
			while(genero<1 || genero>3)
		{		
				System.out.println("\nO valor informado não é válido!");
				System.out.println("\nEntre novamente com o seu genero: 1-Masculino 2-Feminino 3-Outros");
				genero = leia.nextInt();
		}
			System.out.println("\nEntre com o seu fator psicológico: 1-Calma 2-Nervosa 3-Agressiva");
			fpsico = leia.nextInt();
			while(fpsico<1 || fpsico>3)
		{		
				System.out.println("\nO valor informado não é válido!");
				System.out.println("\nEntre novamente com o seu fator psicológico: 1-Calma 2-Nervosa 3-Agressiva");
				fpsico = leia.nextInt();
		}	
			if (fpsico ==1) 	{contPesCalmas++;}
			
			if (genero==2 && fpsico==2)		{contMulNervosas++;}
			
			if (genero==1 && fpsico==3) 	{contHomAgressivos++;}
			
			if (genero==3 && fpsico==1)		{contOutCalmas++;}
			
			if (fpsico==2 && idade>40)		{contPesNervosas40++;}
			
			if (fpsico==1 && idade<18)		{contPesCalma18++;}
			
			pessoas++;
			
		}
			System.out.println("\nA quantidade de pessoas calmas é: "+contPesCalmas);
			System.out.println("\nA quantidade de mulheres nervosas é: "+contMulNervosas);
			System.out.println("\nA quantidade de homens agressivos é: "+contHomAgressivos);
			System.out.println("\nA quantidade de pessoas não binárias calmas é: "+contOutCalmas);
			System.out.println("\nA quantidade de pessoas nervosas com mais de 40 anos é: "+contPesNervosas40);
			System.out.println("\nA quantidade de pessoas calmas com menos de 18 anos é: "+contPesCalma18);		
	}
}
