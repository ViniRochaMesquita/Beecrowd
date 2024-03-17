/*
|>Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o 
sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.

   Condi��es:
   
   1)-O arquivo de entrada cont�m 2 n�meros inteiros e 1 n�mero com duas casas decimais, representando o n�mero, quantidade de horas
   trabalhadas e o valor que o funcion�rio recebe por hora trabalhada, respectivamente.
   
   2)- Imprima o n�mero e o sal�rio do funcion�rio, conforme exemplo fornecido, com um espa�o em branco antes e depois da igualdade. 
   No caso do sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.   
   
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

          | Exemplos de Entrada | Exemplos de Sa�da |
          |        25           |                   |
          |        100          |NUMBER = 25        |
          |        5,50         |SALARY = U$ 550    |
          |---------------------|-------------------|                
          |        1            |                   |
          |        200          |NUMBER = 1         |
          |        20,50        |SALARY = U$ 4100,00|
          |---------------------|-------------------|
          |        6            |                   |
          |        145          |NUMBER = 6         |
          |        15,55        |SALARY = U$ 2254,75|
          |_____________________|___________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1008_Sal�rio {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int   NUM   = entrada.nextInt(),   //N�mero do funcion�rio;
		      HORAS = entrada.nextInt();   //N�mero de horas trabalhadas;
		float PAGPH = entrada.nextFloat(); //Pagamento por Horas;
		
		float SAL = HORAS * PAGPH;  //Salario
		
		System.out.println("NUMBER = "+NUM); //imprime o n�mero do funcion�rio
		System.out.printf("SALARY = U$ %.2f", SAL);  //imprime o sal�rio com duas casas decimais
				
		entrada.close();
		
	}

}
