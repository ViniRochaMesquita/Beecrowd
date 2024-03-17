/*
|>Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro). 
Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o total a receber no final do m�s, com duas 
casas decimais.

   Condi��es:
   
   1)-O arquivo de entrada cont�m um texto (primeiro nome do vendedor) e 2 valores de dupla precis�o (double) com duas casas decimais,
   representando o sal�rio fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
   
   2)- Imprima o total que o funcion�rio dever� receber, conforme exemplo fornecido.
      
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   DICA: O "TOTAL" � a soma do salario fixo com a comiss�o sobre as vendas;

          | Exemplos de Entrada | Exemplos de Sa�da |
          |        JOAO         |                   |
          |        500.00       |TOTAL = R$ 684.54  | 
          |        1230.30      |                   | 
          |---------------------|-------------------|                
          |        PEDRO        |                   |
          |        700.00       |TOTAL = R$ 700.00  |
          |        0.00         |                   |
          |---------------------|-------------------|
          |        MANGOJATA    |                   |
          |        1700.00      |TOTAL = R$ 1884.58 |
          |        1230.50      |                   |
          |_____________________|___________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1009_Sal�rio_com_Bonus {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		String NOME = entrada.next();   //Nome do funcion�rio; Note que n�o � necessario declarar o tipo depois de "next" no caso de Strings
	    
		double SAL    = entrada.nextDouble(),
			   VEN    = entrada.nextDouble(),
			   COM    = VEN * 0.15,
		       TOT    = SAL + COM;
	           
		System.out.println(NOME);
		System.out.printf("TOTAL = R$ %.2f", TOT);   		
		
		entrada.close();
		
	}

}
