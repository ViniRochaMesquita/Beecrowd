/*
|>Objetivos:
A seguinte sequ�ncia de n�meros 0 1 1 2 3 5 8 13 21... � conhecida como s�rie de Fibonacci. Nessa sequ�ncia, cada n�mero, depois dos 2 
primeiros, � igual � soma dos 2 anteriores. 

1)- Escreva um algoritmo que leia um inteiro N (N < 46) e;

2)- mostre os N primeiros n�meros dessa s�rie.
..............................................................................................................................
  
   Condi��es:
   
   1)- O arquivo de entrada cont�m um valor inteiro N (0 < N < 46);
   
   2)- Os valores devem ser mostrados na mesma linha, separados por um espa�o em branco. N�o deve haver espa�o ap�s o �ltimo valor;
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |          5          |        0 1 1 2 3       |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1150_Fibonacci_F�cil {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo----------------------------------------------------------------------------------------------------------------------------------
//A seguinte sequ�ncia de n�meros 0 1 1 2 3 5 8 13 21... � conhecida como s�rie de Fibonacci. Nessa sequ�ncia, cada n�mero, depois dos 2 
//primeiros, � igual � soma dos 2 anteriores. 	   
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Escreva um algoritmo que leia um inteiro N (N < 46) e;
		
		int N    = entrada.nextInt(),
			ant1 = 1,
			ant2 = 1,
			atual = 0;
		   
		System.out.printf("0");
		System.out.printf(" 1");
		System.out.printf(" 1");

//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------
//2)- mostre os N primeiros n�meros dessa s�rie.
		for(int i = 1; i<N-2 ; i++) {
			atual = ant1 + ant2;
		    ant2  = ant1;
			ant1  = atual;
			
			System.out.printf(" %d", atual);
			
		}
		System.out.println();
		   
//--------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

