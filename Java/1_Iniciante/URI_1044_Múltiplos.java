/*
|>- Objetivos:

1)- Leia 2 valores inteiros (A e B);
2)- Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si.

..........................................................................................................................................
   Condi��es:
   
   1)- A entrada cont�m valores inteiros;
   
   2)- A sa�da deve conter uma das mensagens conforme descrito acima.
   
   3)-N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |     6    24         |    S�o Multiplos       |
          |---------------------|------------------------|
          |     6    25         |    N�o s�o Multiplos   |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1044_M�ltiplos {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);

//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//1)- Leia 2 valores inteiros (A e B);
           int A = entrada.nextInt(),
        	   B = entrada.nextInt();
           
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//2)- Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si.
           
           if( (B%A) == 0 || (A%B) == 0 ) { //se o resto da divisa� de pelo menos uma das possibilidades for 0 significa que UM deles � o 
        	                                //divisor do OUTRO, logo esse OUTRO � multiplo desse UM;
        	   System.out.println("Sao Multiplos");        	   
           }else {
        	   System.out.println("Nao sao Multiplos");
           }
             		   
//-----------------------------------------------------------------------------------------------------------------------------------           
           entrada.close();
		
	}

}

