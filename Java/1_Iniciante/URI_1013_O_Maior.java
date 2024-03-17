/*
|> Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores lidos seguido da mensagem �eh o maior�. Utilize a 
f�rmula:
        
        MaiorAB = (a + b + abs(a - b))
                  --------------------
                            2
Obs.:                           
Obs.: A f�rmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto � necess�rio para chegar no re-
sultado esperado.

  
   Condi��es:
   
   1) O arquivo de entrada cont�m tr�s valores inteiros.
  
   2) Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh o maior".

   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |       7 14 106      |      106 eh o maior    |
          |---------------------|------------------------|
          |      217 14 6       |      217 eh o maior    |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1013_O_Maior {
	

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt(), //Primeirio N�mero
		    B = entrada.nextInt(), //Segundo N�mero
		    C = entrada.nextInt(), //Terceiro N�mero
		   AB = (A + B + Math.abs(A-B)) / 2, //Compara��o entre A e B
		    D = (AB + C + Math.abs(AB-C)) /2; //Compara��o entre AB e C 
	
		System.out.println(D + " eh o maior");
		
		System.out.println();   		
		
		entrada.close();
	}

}
