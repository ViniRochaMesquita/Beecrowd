/*
|>Objetivos:  

1)- Fa�a um programa que leia um vetor real A[100]. 

2)- No final, mostre todas as posi��es do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posi��es.
....................................................................................................................................................   
  
   Condi��es:
   
   1)-A entrada cont�m 100 valores, podendo ser inteiros, reais, positivos ou negativos.
   
   2)-Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i � a posi��o do vetor e x � o valor armazenado na posi��o, com 
   uma casa ap�s o ponto decimal.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |         0           |    A[0] = 0.0          |
          |---------------------|------------------------|
          |        -5           |    A[1] = -5.0         |
          |---------------------|------------------------|
          |        63           |    A[3] = -8.5         |
          |---------------------|------------------------|
          |        -8.5         |          ...           |
          |---------------------|------------------------|
          |        ...          |          ...           |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1174_Sele�ao_em_Vetor_I {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat saidaFormatada = new DecimalFormat("0.0");
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Fa�a um programa que leia um vetor real A[100]. 
		double A[] = new double[100];
		
		for( int i=0; i<A.length; i++) {
			
			A[i] = entrada.nextDouble();
			
		}
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- No final, mostre todas as posi��es do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posi��es.
		for( int j=0; j<A.length; j++) {
				
			if( A[j] <= 10 ) {
								
				System.out.println( "A["+j+"] = " + saidaFormatada.format(A[j]) );
				
			}
		}
		   
//---------------------------------------------------------------------------------------------------------------------------------------------
		entrada.close();
		   
	}
}

