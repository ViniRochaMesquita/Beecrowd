/*
|>Objetivos:  

1)- Fa�a um programa que leia 5 valores inteiros;

2)- Conte quantos destes valores digitados s�o pares, quantos s�o �mpares, quantos s�o positivos e quantos valores s�o negativos;
3)- e mostre esta informa��o.
  ............................................................................................................................
  
   Condi��es:
   
c   
   2)- Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |         -5          | 3 valor(es) par(es)    |
          |          0          | 2 valor(es) impar(es)  |
          |         -3          | 1 valor(es) positivo(s)|
          |         -4          | 3 valor(es) negativo(s)|
          |         12          |                        |
          |_____________________|________________________|
          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1066_Pares_�mpares_Positivos_e_Negativos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 5 valores inteiros;				   
		
//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------
//2)- Conte quantos destes valores digitados s�o pares, quantos s�o �mpares, quantos s�o positivos e quantos valores s�o negativos;
		
		int contPar   = 0,              //Contador de n�meros pares;
		    contImpar = 0, 				//Contador de n�mero impares;
			contPos   = 0,				//Contador de n�meros Positivos;
			contNeg   = 0;				//Contador de n�meros Negativos;
		
		for (int i = 1; i<6; i++ ) {                       
			
			int num = entrada.nextInt();                   
			
			if((num % 2) == 0) {    //Verifica se o n�mero � par;				   
				contPar++;
			}else {
				contImpar++;
			}
			
			if(num > 0) {
				contPos++;
			}else if(num < 0) {
				contNeg++;
			}
		}
		   
//Objetivo 3 ---------------------------------------------------------------------------------------------------------------------------------
//3)- e mostre esta informa��o.
		System.out.println(contPar   + " valor(es) par(es)s");
		System.out.println(contImpar + " valor(es) impar(es)");
		System.out.println(contPos   + " valor(es) positivo(s)");
		System.out.println(contNeg   + " valor(es) negativo(s)");

//--------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

