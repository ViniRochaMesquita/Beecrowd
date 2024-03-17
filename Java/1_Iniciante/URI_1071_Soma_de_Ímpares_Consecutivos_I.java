/*
|>Objetivos:  

1)- Leia 2 valores inteiros X e Y. 

2)- A seguir, calcule e mostre a soma dos n�meros impares entre eles.
  ............................................................................................................................
  
   Condi��es:
   
   1)- O arquivo de entrada cont�m dois valores inteiros;
  
   2)- O programa deve imprimir um valor inteiro. Este valor � a soma dos valores �mpares que est�o entre os valores fornecidos na entrada
   que dever� caber em um inteiro.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |         6           |           5            |
          |	       -5           |                        |
          |---------------------|------------------------|
          |        15           |          13            |
          |	       12           |                        |
          |---------------------|------------------------|
          |        12           |           0            |
          |	       12           |                        |
          |---------------------|------------------------|
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1071_Soma_de_�mpares_Consecutivos_I {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 2 valores inteiros X e Y;

		int X 	= entrada.nextInt(),
			Y 	= entrada.nextInt(),
			NUM = 0,
			AUX = 0,
			SOMA = 0;
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- O programa deve imprimir um valor inteiro. Este valor � a soma dos valores �mpares que est�o entre os valores fornecidos na entrada;
		if (X < Y) {   				//Isso aqui � pra garantir que a soma sempre come�e do menor para o maior
			NUM = X+1;

			AUX = Y;   				//Isso define que o fim do intervalo sempre ser� o maior numero na reta real;
		}else if(Y < X) {
			NUM = Y+1;
			AUX = X;   				//Isso define que o dim do intervalo sempre ser� o maior numero na reta real; 
			
		}
//---------------------------------------------------------------------------------------------------------------------------------------------
		while(NUM < AUX) { 			//Isso � pra garantir que o numero n�o saia do intervalo;

			if(NUM % 2 != 0) {    //Isso verifica se o numero atual � impar;
				
				SOMA = SOMA + NUM;  //Se for, ele � somado aos demais;
			
			}
			NUM++;
		}
		   
		System.out.println(SOMA);
//---------------------------------------------------------------------------------------------------------------------------------

		entrada.close();
		   
	}
}

