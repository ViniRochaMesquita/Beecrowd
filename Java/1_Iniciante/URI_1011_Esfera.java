/*
|>Fa�a um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A f�rmula para calcular o vo-
lume �: (4/3) * pi * R�. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a f�rmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da
divis�o entre dois inteiros � outro inteiro.

   Condi��es:
   
   1)- O arquivo de entrada cont�m um valor de ponto flutuante (dupla precis�o), correspondente ao raio da esfera.
   
   2)- A sa�da dever� ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espa�o antes e um espa�o depois da igualda-
   de. O valor dever� ser apresentado com 3 casas ap�s o ponto.
      
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   

          | Exemplos de Entrada |    Exemplos de Sa�da    |
          |        3            |VOLUME = 113.097         | 
          |---------------------|-------------------------|                
          |        15           |VOLUME = 14137.155       |
          |---------------------|-------------------------|
          |        1523         |VOLUME = 14797486501.627 |
          |_____________________|_________________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1011_Esfera {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double RAIO = entrada.nextDouble(),
			   PI   = 3.14159,
			   VOL = (4.0/3.0) * PI * Math.pow(RAIO, 3); //VOLUME
		
		System.out.printf("VOLUME = %.3f", VOL);			
		
		System.out.println();   		
		
		entrada.close();
		
	}

}
