/*
|> Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) e o total de combust�vel gasto 
(em litros).
  
   Condi��es:
   
   1) -O arquivo de entrada cont�m dois valores: um valor inteiro X representando a dist�ncia total percorrida (em Km), e um valor 
   real Y representando o total de combust�vel gasto, com um d�gito ap�s o ponto decimal.
   
   2) -Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas ap�s a v�rgula, seguido da mensagem "km/l".
   
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |        500          |      14,286 km/l       |
          |        35,0         |                        |      
          |---------------------|------------------------|
          |        2254         |      18,119 km/l       |
          |        124,4        |                        |
          |---------------------|------------------------|
          |        4554         |       9,802 km/l       |
          |        464,6        |                        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1014_Consumo {

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);

		int X    = entrada.nextInt();   //Distancia Total Percorrida em km
		double Y = entrada.nextDouble(),//Total de Combustivel Gasto em l
		      CM = X / Y ; //M�dia de consumo km/l
		
		System.out.printf("%.3f km/l", CM);		
		
		System.out.println();   		
		
		entrada.close();
	}

}
