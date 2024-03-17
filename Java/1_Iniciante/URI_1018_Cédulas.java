/*
|> Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) no qual o valor pode ser decomposto. As notas 
consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a rela��o de notas necess�rias.

   Condi��es:
   
   1) O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000);
 
   2) Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo necess�rias, conforme o exemplo fornecido;
   
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |        576          |           576          |
          |                     |  5 nota(s) de R$ 100,00|
		  |		     		    |  1 nota(s) de R$ 50,00 |
		  |  					|  1 nota(s) de R$ 20,00 |
		  |						|  0 nota(s) de R$ 10,00 |
	      |  					|  1 nota(s) de R$ 5,00  |
		  |						|  0 nota(s) de R$ 2,00  |
	      |                  	|  1 nota(s) de R$ 1,00  |
          |---------------------|------------------------|
          |       11257         |           11257        |
          |                     |112 nota(s) de R$ 100,00|
		  |						|  1 nota(s) de R$ 50,00 |
		  |						|  0 nota(s) de R$ 20,00 | 
		  |						|  0 nota(s) de R$ 10,00 | 
		  |						|  1 nota(s) de R$ 5,00  |
		  |						|  1 nota(s) de R$ 2,00  |
		  |						|  0 nota(s) de R$ 1,00  |
		  |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1018_C�dulas {
	

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		
		int bonoros = entrada.nextInt(),
				QNT;                    //Quantidade de notas
		
		int cedulas[];
		cedulas = new int[7];
		cedulas[0] = 100 ;
		cedulas[1] =  50 ;
		cedulas[2] =  20 ;
		cedulas[3] =  10 ;
		cedulas[4] =   5 ;
		cedulas[5] =   2 ;
		cedulas[6] =   1 ;
	
		int i = 0;
		
		System.out.printf("%d\n",bonoros);
		
		while(i<7) 
		{
		 QNT = bonoros/cedulas[i];                                    //oferece a quantidade de notas no valor de "cedulas[i]"
		 System.out.printf("%d nota(s) de R$ %d,00\n",QNT,cedulas[i]);//Imprime a quantidadede notas no valor de "cedulas[i]"
		bonoros = bonoros % cedulas[i];	                              //Calcula o resto de dinheiro que n cabia no valor da nota anterior
		i++;
		}
		
		System.out.println();   		
		
		entrada.close();
	}

}
