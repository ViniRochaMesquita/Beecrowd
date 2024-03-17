/*
|>Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de C e D segundo a
f�rmula: DIFERENCA = (A * B - C * D).

   Condi��es:
   
   1)-O arquivo de entrada cont�m 4 valores inteiros;
   
   2)- Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme exemplo abaixo, com um espa�o em branco antes e depois da
   igualdade;
   
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

          | Exemplos de Entrada | Exemplos de Sa�da |
          |         5           |                   |
          |         6           |                   |
          |         7           |                   |
          |         8           | DIFEREN�A = -26   |
          |---------------------|-------------------|                
          |         0           |                   |
          |         0           |                   |
          |         7           |                   |
          |         8           | DIFEREN�A = -56   |
          |---------------------|-------------------|
          |         5           |                   |
          |         6           |                   |
          |        -7           |                   |
          |         8           | DIFEREN�A = 86    |
          |_____________________|___________________|

______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1007_Diferen�a {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A          = entrada.nextInt(),
		    B          = entrada.nextInt(),
		    C          = entrada.nextInt(),
		    D          = entrada.nextInt(),
	 	    DIFEREN�A  =((A * B) - (C * D));
		
		System.out.printf("DIFERECA = %d", DIFEREN�A);
		
		System.out.println();
		
		entrada.close();		
	}

}
