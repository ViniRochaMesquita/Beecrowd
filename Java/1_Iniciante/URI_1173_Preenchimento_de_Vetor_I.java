/*
|>Objetivos:  

1)- Leia um valor e fa�a um programa que coloque o valor lido na primeira posi��o de um vetor N[10]. 

2)- Em cada posi��o subsequente, coloque o dobro do valor da posi��o anterior. 
Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.

....................................................................................................................................................   
  
   Condi��es:
   
   1)-A entrada cont�m um valor inteiro (V<=50).
   
   2)-Para cada posi��o do vetor, escreva "N[i] = X", onde i � a posi��o do vetor e X � o valor armazenado na posi��o i. O primeiro n�mero do
   vetor N (N[0]) ir� receber o valor de V.

   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |         1           |    N[0] = 1            |
		  |						|    N[1] = 2			 |
		  |						|	 N[2] = 4			 |
		  |					    |   	...              |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1173_Preenchimento_de_Vetor_I {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um valor inteiro e fa�a um programa que coloque o valor lido na primeira posi��o de um vetor N[10]. 
		int V   = entrada.nextInt();
		int N[] = new int[10];
		
		N[0]    = V;
		System.out.printf("N[0] = %d\n", N[0]);
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Em cada posi��o subsequente, coloque o dobro do valor da posi��o anterior. Mostre o vetor em seguida
		for(int i=1; i<N.length; i++) {
			
			N[i] = N[i-1] * 2;
			System.out.printf("N[%d] = %d\n", i, N[i]);
		}
		   
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}



