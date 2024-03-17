/*
|>Objetivos:  

1)- Leia um valor inteiro N;

2)- Apresente todos os n�meros entre 1 e 10000 que divididos por N d�o resto igual a 2.

.....................................................................................................................................
  
   Condi��es:
   
   1)- A entrada cont�m um valor inteiro N (N < 10000);
      
   2)- Imprima todos valores que quando divididos por N d�o resto = 2, um por linha;
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          | 		13          | 			2            |
          |						|		   15            |
          |						|          28            |
          |						|          41            |
          |						|          ...           |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1075_Resto_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A entrada cont�m um valor inteiro N (N < 10000);				   
		int N = entrada.nextInt(),
			i = 1;
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Imprima todos valores de 1 at� 10.000 que quando divididos por N d�o resto = 2, um por linha;
		
		while( i <= 10000 ) {
			
			if( i % N == 2) {
			System.out.println(i);
			}
			
			i++;			
		}
				   
//----------- ---------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

