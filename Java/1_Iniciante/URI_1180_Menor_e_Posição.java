/*
|>Objetivos:  

1)- Fa�a um programa que leia um valor N. Este N ser� o tamanho de um vetor X[N]. 

2)- A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posi��o dentro do vetor, mostrando esta informa��o.

....................................................................................................................................................   
  
   Condi��es:
   
   1)-A primeira linha de entrada contem um �nico inteiro N (1 < N < 1000), indicando o n�mero de elementos que dever�o ser lidos em seguida para 
   o vetor X[N] de inteiros. A segunda linha cont�m cada um dos N valores, separados por um espa�o.
   
   2)-A primeira linha apresenta a mensagem �Menor valor:� seguida de um espa�o e do menor valor lido na entrada. A segunda linha apresenta a men-
   sagem �Posicao:� seguido de um espa�o e da posi��o do vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posi��o zero.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |	 		10          |Menor valor: -5         |
          |1 2 3 4 -5 6 7 8 9 10|Posicao: 4              | 
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1180_Menor_e_Posi��o {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ---------------------------------------------------------------------------------------------------------------------------------------
//1)- Fa�a um programa que leia um valor N inteiro. Este N ser� o tamanho de um vetor inteiro X[N]. 
		int N   = entrada.nextInt();
		int X[] = new int[N];
		
		int menor = entrada.nextInt(),
		    pos   = 0;
		
		
//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------------
//2)- A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posi��o dentro do vetor, mostrando esta informa��o.
		for(int i=1; i<N; i++){ 
			
			X[i]= entrada.nextInt();
			
			if(X[i] < menor ){
				menor = X[i];
				pos   = i;				
			}			
		}
		 
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + pos);
//---------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}



