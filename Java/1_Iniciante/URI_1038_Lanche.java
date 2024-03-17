/*
|> -Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade deste item. A seguir, calcule e mostre o valor 
da conta a pagar.
		 ____________________________________
		| C�digo | Especifica��o   | Pre�o   |
		|   1    | Cachorro-Quente | R$ 4.00 |
		|   2    | X-Salada        | R$ 4.50 |
		|   3    | X-Bacon         | R$ 5.00 |
		|   4    | Torrada Simples | R$ 2.00 |
		|   5    | Refrigernate    | R$ 1.50 |
		|--------|-----------------|---------|

   Condi��es:
   
   1) O arquivo de entrada cont�m dois valores inteiros correspondentes ao c�digo e � quantidade de um item conforme tabela acima.   
   
   2) O arquivo de sa�da deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas ap�s o ponto decimal.
      
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |      3   2          |     Total: R$ 10.00    |
          |---------------------|------------------------|
          |      4   3          |     Total: R$ 6.00     |
          |---------------------|------------------------|
          |      2   3          |     Total: R$ 13.50    |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1038_Lanche {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   
		   int COD = entrada.nextInt(), //Entrada do c�digo do lanche;
			   QNT = entrada.nextInt(); //Entrada da quantidade de lanches;
		   
		   Float TOT = null;
		   
		   if (COD == 1) {
			   TOT = (float) ((QNT) * 4.0); 
		   }
		   if (COD == 2) {
			   TOT = (float) ((QNT) * 4.5);
		   }
		   if (COD == 3) {
			   TOT = (float) ((QNT) * 5.0);
		   }
		   if (COD == 4) {
			   TOT = (float) ((QNT) * 2.0);
		   }
		   if (COD == 5) {
			   TOT = (float) ((QNT) * 1.5);
		   }
		
		   System.out.printf("Total: R$ %.2f\n", TOT);
           entrada.close();
		
	}

}

