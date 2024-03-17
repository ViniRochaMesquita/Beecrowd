/*
|>Objetivos:  

1)- Leia um valor inteiro X.

2)- Em seguida apresente os 6 valores �mpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
  ............................................................................................................................
  
   Condi��es:
   
   1)- A entrada ser� um valor inteiro positivo;
   
   2)- A sa�da ser� uma sequ�ncia de seis n�meros �mpares;
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |         8           |             9          |
          |                     |            11          |
          |                     |            13          |
          |                     |            15          |
          |                     |            17          |
          |                     |            19          |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1070_Seis_�mpares_Consecutivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A entrada ser� um valor inteiro positivo;
		int num = entrada.nextInt();			   
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Em seguida apresente os 6 valores �mpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
		int   cont = 0;
		while(cont < 6) {  				//Isso determina que apenas 6 numeros ser�o impressos;
			
			if((num%2) == 1) { 				//Isso verifica se o numero num � impar;
				System.out.println(num);    //Caso seja, ser� impresso;
				cont++;                     //Isso incrementa at� que 6 numeros sejam impressos;
			}
			
			num++;  						//Isso incrementa o numero para veridicar se o seu consecutivo � impar;
			
		}
		   
//---------------------------------------------------------------------------------------------------------------------------------

		entrada.close();
		   
	}
}

