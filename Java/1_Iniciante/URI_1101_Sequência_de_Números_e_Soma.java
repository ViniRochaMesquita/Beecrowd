/*
|>Objetivos: Leia um conjunto n�o determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). Para cada par li-
do, mostre a sequ�ncia do menor at� o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

....................................................................................................................................................   
  
   Condi��es:
   
   1)- O arquivo de entrada cont�m um n�mero n�o determinado de valores M e N. A �ltima linha de entrada vai conter um n�mero nulo ou negativo.
   
   2)- Para cada dupla de valores, imprima a sequ�ncia do menor at� o maior e a soma deles, conforme exemplo abaixo.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          | 5 2                 |    2 3 4 5 Sum=14		 |
          | 6 3                 |    3 4 5 6 Sum=18		 |	
          | 5 0                 |						 |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1101_Sequ�ncia_de_N�meros_e_Soma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
     
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia dois inteiros pares M e N, caso esses receba 0 ou negativo o programa encerra;
		int M = entrada.nextInt(),
			N = entrada.nextInt();
		
		while( M > 0 && N > 0) {
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Para cada dupla de valores, imprima a sequ�ncia do menor at� o maior e a soma deles;
			int soma = 0;
			if(M<N) {				
				for(int i=M; i<=N; i++) {
					System.out.print(i+" ");
					soma += i;
				}
			}else {
				for(int i=N; i<=M; i++) {
					System.out.print(i+" ");
					soma += i;
				}
			}

			System.out.println("Sum="+soma);
			
			M = entrada.nextInt();
			N = entrada.nextInt();
			
		}
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

