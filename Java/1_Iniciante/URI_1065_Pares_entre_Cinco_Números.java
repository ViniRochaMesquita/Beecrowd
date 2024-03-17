/*
|>Objetivos:  

1)- Fa�a um programa que leia 5 valores inteiros;
2)- Conte quantos destes valores digitados s�o pares;
3)- e mostre esta informa��o.
  ............................................................................................................................
  
   Condi��es:
   
c   
   2)- Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |          7          |     3 valores pares    |
          |         -5          |                        |
          |          6          |                        |
          |         -4          |                        |
          |         12          |                        |
          |_____________________|________________________|
          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1065_Pares_entre_Cinco_N�meros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 5 valores inteiros;				   
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Conte quantos destes valores digitados s�o pares;
//OBS.: Condi��o para um numero ser par: resto desse numero dividido por 2 tem que ser nulo;
		
		int cont = 0;                                      //variavel que registra a quantidade e numeros pares;
		
		for (int i = 1; i<6; i++ ) {                       //ser� lido 5 vezes, pois a entrada pede 5 numeros;
			
			int num = entrada.nextInt();                   //Objetivo 1;
			
			if((num % 2) == 0) { 						   //Verfica se o n�mero � par;
				cont++;
			}
		}
		   
//Objetivo 3 ---------------------------------------------------------------------------------------------------------------------------------
//3)- e mostre esta informa��o.
		System.out.println(cont + " valores pares");

//--------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

