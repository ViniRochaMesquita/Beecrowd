/*
|> Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, ao utilizar um autom�vel que faz 
12KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa. Para efetuar o c�lculo, deve-se fornecer o tempo 
gasto na viagem (em horas) e a velocidade m�dia durante a mesma (em km/h). Assim, pode-se obter dist�ncia percorrida e, em seguida,cal
cular quantos litros seriam necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.

   Condi��es:
   
   1) O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem (em horas) e o segundo � a velocidade m�dia dura-
   nte a mesma (em km/h);
  
   2) Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos ap�s o ponto decimal;
   
   3) N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |         10          |         70,833         |
          |         85          |                        |
          |---------------------|------------------------|
          |          2          |         15,333         |
          |         92          |                        |
          |---------------------|------------------------|
          |         22          |        122,833         |
          |         67          |                        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1017_Gasto_de_Combust�vel {
	

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		
		/*Quantidade de litros de combustivel gastos em uma viagem = X
		Carro gasta 1L a cada 12 KM (12K/L);
		Tempo da viagem = THoras;
		Velocidade media = VEL KM/H;

		1) Monte uma formula que de a distancia percorrida, o tempo e a velocidade s�o fornecidas pelo usu�rio;

		Velocidade =    KM     =>  DIST KM= VEL * H
		              -------
		                 H
		Basta multiplicar a velocidade pelo tempo;

		2)Quantos litros nessa distancia ser�o necessarios.
		se o carro gasta 1L a cada 12KM quanto ele vai gastar em  DIST KM?

		                 KM        L
		                 12   \/   1  =>    12x=DIST =< X=DIST/12
		                 DIST /\   X
		                 
		                 
		*/

		int T  = entrada.nextInt(),
		   VEL = entrada.nextInt();
		
		double DIST  = T * VEL,
			   GASTO = DIST/12;
		
		System.out.printf("%.3f", GASTO);
				
		System.out.println();   		
		
		entrada.close();
	}

}
