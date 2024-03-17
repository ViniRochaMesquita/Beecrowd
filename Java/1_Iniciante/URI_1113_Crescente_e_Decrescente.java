/*
|>Objetivos: Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se estes valores
foram digitados em ordem crescente ou decrescente.

....................................................................................................................................................   
  
   Condi��es:
   
   1)- A entrada cont�m v�rios casos de teste. Cada caso cont�m dois valores inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores 
   iguais para X e Y.
   
   2)- Para cada caso de teste imprima �Crescente�, caso os valores tenham sido digitados na ordem crescente, caso contr�rio imprima a mensagem 
   �Decrescente�.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          | 5 4					|    Decrescente         |							
     	  | 7 2					|	 Decrescente    	 |		
		  | 3 8					|	 Crescente			 |	
		  | 2 2					|						 |				
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1113_Crescente_e_Decrescente {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
    
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
// 1)- A entrada cont�m v�rios casos de teste. Cada caso cont�m dois valores inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores 
//iguais para X e Y.
		int X = entrada.nextInt(),
			Y = entrada.nextInt();	
		
		while( X != Y) {

//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Para cada caso de teste imprima �Crescente�, caso os valores tenham sido digitados na ordem crescente, caso contr�rio imprima a mensagem 
//�Decrescente�.		
			 
			if(X<Y) {
				System.out.println("Crescente");
			}else {
				System.out.println("Decrescente");
			}			 
		
			 X = entrada.nextInt();
			 Y = entrada.nextInt();	
		 }
		
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

