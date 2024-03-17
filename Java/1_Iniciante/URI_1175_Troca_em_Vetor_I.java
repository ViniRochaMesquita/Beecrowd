/*
|>Objetivos:  

1)- Fa�a um programa que leia um vetor N[20]. 

2)- Troque a seguir, o primeiro elemento com o �ltimo, o segundo elemento com o pen�ltimo, etc., 
at� trocar o 10� com o 11�. Mostre o vetor modificado.

....................................................................................................................................................   
  
   Condi��es:
   
   1)-A entrada cont�m 20 valores inteiros, positivos ou negativos.
   
   2)-Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do vetor e Y � o valor armazenado naquela posi��o.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
		  |			0		 	|	  N[0] = 230         |
		  | 	   -5			|	  N[1] = 63          |
		  |		   ...			|		...				 |
		  |			63			|	  N[18] = -5		 |
		  |		   230			|	  N[19] = 0			 |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1175_Troca_em_Vetor_I {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Fa�a um programa que leia um vetor real N[20]. 			   
		
		int N[] = new int[20];
		
		for(int i=0; i<20; i++) {
			
			N[i] = entrada.nextInt();
			
		}
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Troque a seguir, o primeiro elemento com o �ltimo, o segundo elemento com o pen�ltimo, etc., at� trocar o 10� com o 11�. 
//Mostre o vetor modificado.	
		for(int j=0; j<10; j++) {  //Como ele so troca at� a metade do vetor de tamanho 20, e a primeira posi��o � 0, vamos fazer as trocas so at� 
								   //at� o 9;		
			int temp = N[j];	
			N[j] = N[19-j];       //Primeiro para o ultimo, segundo para o penultimo...etc;
			N[19-j] = temp;  	  //Ultimo vai receber o que tava no primeiro, o que tava no primeiro foi armazenado na variavel temp;
		
		}
			
		for(int k=0; k<20; k++) {
		 
			System.out.printf("N[%d] = %d\n", k, N[k]);
			
		}

//---------------------------------------------------------------------------------------------------------------------------------------------
		entrada.close();
		   
	}
}

