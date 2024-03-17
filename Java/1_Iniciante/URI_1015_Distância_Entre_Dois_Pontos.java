/*
|> Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a 
dist�ncia entre eles, mostrando 4 casas decimais ap�s a v�rgula, segundo a f�rmula:
               ___________________
             \/(X2-X1)� + (Y2-Y1)�
 
   Condi��es:
   
   1) O arquivo de entrada cont�m duas linhas de dados. A primeira linha cont�m dois valores de ponto flutuante: x1 y1 e a segunda 
   linha cont�m dois valores de ponto flutuante x2 y2;
   
   2) Calcule e imprima o valor da dist�ncia segundo a f�rmula fornecida, com 4 casas ap�s o ponto decimal;
  
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |     1,0  7,0        |                        |
          |     5,0  9,0        |        4,4721          | 
          |---------------------|------------------------|
          |    -2,5  0,4        |                        |
          |    12,1  7,3        |        16,1484         |
          |---------------------|------------------------|
          |     2,5  -0,4       |                        |   
          |   -12,1  7,0        |        16,1484         |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1015_Dist�ncia_Entre_Dois_Pontos {
	

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		
		double X1 = entrada.nextDouble(), //Cordenada X do ponto 1;
			   Y1 = entrada.nextDouble(), //Cordenada Y do ponto 1;
     		   X2 = entrada.nextDouble(), //Cordenada X do ponto 2;
               Y2 = entrada.nextDouble(), //Cordenada Y do ponto 2;
               D  = Math.sqrt( Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2) );//Distancia entre esses 2 pontos;
		
		System.out.printf("%.4f", D);	
		
		System.out.println();   		
		
		entrada.close();
	}

}
