/*
|>Objetivos:  

1)- Leia um valor inteiro X (1 <= X <= 1000). 

2)- Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o X, se for o caso.

............................................................................................................................
  
   Condi��es:
   
   1)- O arquivo de entrada cont�m 1 valor inteiro qualquer;
   
   2)- Imprima todos os valores �mpares de 1 at� X, inclusive X, se for o caso;
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |          8          |            1           |
          |---------------------|------------------------|
          |                     |            3           |
          |---------------------|------------------------|
          |                     |            5           |
          |---------------------|------------------------|
          |                     |            7           |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1067_�mpares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- O arquivo de entrada cont�m 1 valor inteiro qualquer;				   
		int num = entrada.nextInt();
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Imprima todos os valores �mpares de 1 at� X, inclusive X, se for o caso;	
		
		for(int i = 1; i <= num; i++) {        //A verifica��o come�a desde 1 at� o numero dado na entrada;
			
			if( (i % 2) == 1) {                //Isso verifica se o numero atual � impar
				System.out.println(i);
			}
			
		}
		   
//---------------------------------------------------------------------------------------------------------------------------------------------			   
		   
		   entrada.close();
		   
	}
}

