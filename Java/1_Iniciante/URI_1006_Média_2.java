/*
|>Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de um aluno. A seguir, calcule a m�dia do aluno, sabendo que a 
nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 at� 10.0, sempre com uma casa de-
cimal.

   Condi��es:
   
   1)-O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla precis�o (double);
   
   2)- Imprima a mensagem "MEDIA" e a m�dia do aluno conforme exemplo abaixo, com 1 d�gito ap�s o ponto decimal e com um espa�o em bran-
   co antes e depois da igualdade.
   
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

          | Exemplos de Entrada | Exemplos de Sa�da |
          |         5,0                             |
          |         6,0                             |
          |         7,0         | MEDIA = 6,3       |
          |-----------------------------------------|                
          |         5,0                             |
          |        10,0                             |
          |        10,0         | MEDIA = 9,0       |
          |-----------------------------------------|
          |        10.0                             |
          |        10,0                             |
          |         5.0         | MEDIA = 7,5       |
          |_________________________________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1006_M�dia_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //declara��o de um Scanner, para obter entrada do console
		
		double A = entrada.nextDouble(),
			   B = entrada.nextDouble(),
			   C = entrada.nextDouble(),
		   MEDIA = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10.0;
		
		System.out.printf("MEDIA = %.1f", MEDIA);
				
        entrada.close();
	}

}
