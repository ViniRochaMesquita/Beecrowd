/*
|>Objetivos: Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto es-
crever o quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situa��o sem escrever 
mensagem alguma).
....................................................................................................................................................   
  
   Condi��es:
   
   1)- A entrada cont�m v�rios casos de teste. Cada caso de teste cont�m 2 valores inteiros.
   
   2)- Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          | 2 2					|	primeiro			 |	
          | 3 -2				|	quarto				 |
          |-8 -1				|	terceiro			 |		
          |-7 1					|	segundo				 |		
          | 0 2					|						 |		
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1115_Quadrante {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);   
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia dois inteiros X, Y que s�o as cordenadas de um ponto no plano cartesiano, se pelo menos um deles for nulo o programa encerra;
		int X = entrada.nextInt(),
			Y = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Imprima em qual quadrante o ponto (X,Y) est�;
		while(X != 0 && Y != 0) {
			
			if( X>0 && Y>0 ) { 
				System.out.println("primeiro");
			}
			
			if( X<0 && Y>0 ) {
				System.out.println("segundo");
			}
			
			if( X<0 && Y<0) {
				System.out.println("terceiro");
			}
			if( X>0 && Y<0) {
				System.out.println("quarto");
			}			
			
			X = entrada.nextInt();
			Y = entrada.nextInt();
		}
		
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}





