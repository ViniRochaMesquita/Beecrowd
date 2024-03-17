/*
|>Objetivos:  

1)- Leia 100 valores inteiros;

2)- Apresente ent�o o maior valor lido e a posi��o dentre os 100 valores lidos.

......................................................................................................................................
  
   Condi��es:
   
   1)- O arquivo de entrada cont�m 100 n�meros inteiros, positivos e distintos.
   
   2)- Apresente o maior valor lido e a posi��o de entrada, conforme exemplo abaixo.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |   	   2            |         34565          |
          |		   113          |         4              |
		  |		   45           |                        |
		  |	       34565        |                        |
		  |	       6            |                        |
		  |		   ...          |                        |
		  |		   8            |                        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1080_Maior_e_Posi��o {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 100 valores inteiros;
				int maior   = 0;					 //Armazena o maior numero encontrado at� ent�o;
				int posicao = 0;					 //Armazena a posi��o do maior numero encontrado at� ent�o;
				
			 	for(int i=1; i<=100; i++) {          
			 		
			 		int num = entrada.nextInt();    //L� um n�mero do console;
			 		
			 		if(num > maior) {               //Verifica se o n�mero lido � maior que o anterior;
			 			maior   = num;
			 			posicao = i;
			 		}
			 	}
		
			
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Apresente ent�o o maior valor lido e a posi��o dentre os 100 valores lidos.

		    	System.out.println(maior);
			 	System.out.println(posicao);
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}

