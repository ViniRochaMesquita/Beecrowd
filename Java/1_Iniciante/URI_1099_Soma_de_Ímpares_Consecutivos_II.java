/*
|>Objetivos: Leia um valor inteiro N que � a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Voc�
deve apresentar a soma de todos os �mpares existentes entre X e Y.

....................................................................................................................................................   
  
   Condi��es:
   
   1)- A primeira linha de entrada � um inteiro N que � a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em uma linha co-
   ntendo dois inteiros X e Y.
   
   2)- Imprima a soma de todos valores �mpares entre X e Y.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          | 7					|	 0					 |	
		  |	4 5		            |	 11					 |	
		  |	13 10       	    |	 5  				 |		
		  |	6 4				    |	 0					 |	
		  |	3 3					|	 0					 |		
		  |	3 5					|	 0					 |
		  |	3 4					|	 12					 |		
		  |	3 8    				|						 |	
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1099_Soma_de_�mpares_Consecutivos_II {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);  
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um inteiro N que � a quantidade de casos de teste que vem a seguir.
    	int N = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)-  Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.Imprima a soma de todos valores �mpares entre X e Y.
		int soma = 0;

    	for(int i=0; i<N; i++) {
			int X = entrada.nextInt(),
			    Y = entrada.nextInt();
			
				//2.0 E se Y for maior que X;
				//2.1)- Verifique se um n�mero � impar ou n�o, ent�o some ele em caso "sim".
			if(X<Y) {
				for(int j=(X+1); j<Y; j++) {
					 
					if( (j%2)==1 ) {
						soma += j;
					}
				}
				
			}else {
				for(int j=(Y+1); j<X; j++) {
					 
					if( (j%2)==1 ) {
						soma += j;
					}
				}
				
			}
			 System.out.println(soma);
			 soma = 0;
			
		}
    	    	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

