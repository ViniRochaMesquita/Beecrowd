/*
|>Objetivos: Escreva um algoritmo que leia 2 n�meros e imprima o resultado da divis�o do primeiro pelo segundo. Caso n�o for poss�vel mostre a mensa-
gem �divisao impossivel� para os valores em quest�o.

....................................................................................................................................................   
  
   Condi��es:
   
   1)- A entrada cont�m um n�mero inteiro N. Este N ser� a quantidade de pares de valores inteiros (X e Y) que ser�o lidos em seguida.
   
   2)- Para cada caso mostre o resultado da divis�o com um d�gito ap�s o ponto decimal, ou �divisao impossivel� caso n�o seja poss�vel efetuar o c�l-
   culo.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          | 3					|	-1.5                 |							
		  |	3 -2				|	divisao impossivel   |
		  | -8 0				|	0.0                  |							
		  | 0 8					|						 |			
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1116_Dividindo_X_por_Y {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
    	DecimalFormat saidaFormatada = new DecimalFormat("0.0");
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um n�mero inteiro N. Este N ser� a quantidade de pares de valores inteiros (X e Y) que ser�o lidos em seguida.
    	float N = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Leia 2 interios X e Y, divida X por Y, e imprima a divis�o se possivel ou "divisao impossivel" em caso contr�rio.
    	for(int i=0; i<N; i++) {
    		float X = entrada.nextInt(),
    		      Y = entrada.nextInt();
    	
    		if(Y !=0) {
    			if(X == 0) {
    				System.out.println("0.0");
    				
    			}else {
    				System.out.println(saidaFormatada.format( X/Y ));
    			}
    			
    		}else {
    			System.out.println("divisao impossivel");
    		}
    		
    		
    		
    	}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------
		entrada.close();
		   		
	}
}

