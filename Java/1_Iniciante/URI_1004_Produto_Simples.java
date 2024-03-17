/*
|> Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta opera��o � vari�vel PROD. 
A seguir mostre a vari�vel PROD com mensagem correspondente.
   
   Condi��es:
   
   1)- O arquivo de entrada cont�m 2 valores inteiros;
   
   2)- Imprima a mensagem "PROD" e a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade;
   
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

          | Exemplos de Entrada | Exemplos de Sa�da |
          |         3                               |
          |         9           |    PROD = 27      |
          |-----------------------------------------|                
          |       -30                               |
          |        10           |    PROD =-300     | 
          |-----------------------------------------|
          |         0                               |
          |         9           |    PROD = 0       |
          |-----------------------------------------|


______________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1004_Produto_Simples {

	public static void main(String[] args) {
		
		int A;
		int B;
		
		Scanner entrada = new Scanner (System.in); //Para Obter Entrada do Console
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		int PROD = A * B;
		
		System.out.println("PROD = " + PROD);
		System.out.println();
				
		entrada.close();
		
	}

}
