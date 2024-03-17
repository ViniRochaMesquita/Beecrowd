/*
|> Leia 2 valores de ponto flutuante de dupla precis�o A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a m�dia do 
aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto � 11). Assuma que cada nota pode ir de 
0 at� 10.0, sempre com uma casa decimal.


   Condi��es:
   
   1)-O arquivo de entrada cont�m 2 valores com uma casa decimal cada um;
   
   2)- IImprima a mensagem "MEDIA" e a m�dia do aluno conforme exemplo abaixo, com 5 d�gitos ap�s o ponto decimal e com um espa�o em 
   branco antes e depois da igualdade. Utilize vari�veis de dupla precis�o (double);
   
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

          | Exemplos de Entrada | Exemplos de Sa�da |
          |         5,0                             |
          |         7,1         | MEDIA = 6.43182   |
          |-----------------------------------------|                
          |         0,0                             |
          |         7,1         | MEDIA = 4.84091   |
          |-----------------------------------------|
          |         10.0                            |
          |         10.0        | MEDIA = 10.00000  |
          |_________________________________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;  //Invoca��o da Classe Sccaner

public class URI_1005_M�dia_1 {

	public static void main(String[] args) {
		
		double A,   //Declara��o de variavel do tipo ponto flutuante de dupla prescis�o(double)
               B;   //Declara��o de variavel do tipo ponto flutuante de dupla prescis�o(double)
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		
		double MEDIA = ((A * 3.5) + (B * 7.5)) / 11.00;
		
		System.out.printf("MEDIA = %.5f ", MEDIA);

		entrada.close();

	}

}
