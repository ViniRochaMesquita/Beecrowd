/*
|>Objetivos:  

1)- Fa�a um programa que mostre os n�meros pares entre 1 e 100, inclusive.

  ............................................................................................................................
  
   Condi��es:
   
   1)- Neste problema extremamente simples de repeti��o n�o h� entrada;
   
   2)- Imprima todos os n�meros pares entre 1 e 100, inclusive se for o caso, um em cada linha;
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |                     |            2           |
          |                     |            4           |
          |                     |            6           |
          |                     |            .           |
          |                     |            .           |
          |                     |            .           |
          |                     |           100          |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;


public class URI_1059_N�meros_Pares {

	public static void main(String[] args) {
		
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Fa�a um programa que mostre os n�meros pares entre 1 e 100, inclusive.
		
		for(int i = 1; i<=100; i++) {
			
			if((i % 2) == 0) {
				System.out.println(i);
			}
		}
		   
		   
	}
}

