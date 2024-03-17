/*
|>Objetivos:  
	Com a proximidade da Copa do Mundo, o fluxo de pessoas nas filas para compra de ingressos aumentou consideravelmente. Como as filas est�o cada 
vez maiores, pessoas menos pacientes tendem a desistir da compra de ingressos e acabam deixando as filas, liberando assim vaga para outras pessoas. 
Quando uma pessoa deixa a fila, todas as pessoas que estavam atr�s dela d�o um passo a frente, sendo assim nunca existe um espa�o vago entre duas 
pessoas. A fila inicialmente cont�m N pessoas, cada uma com um identificador diferente. Jo�ozinho sabe o estado inicial dela e os identificadores
em ordem das pessoas que deixaram a fila. Sabendo que ap�s o estado inicial nenhuma pessoa entrou mais na fila, Jo�ozinho deseja saber o estado fi-
nal da fila.
....................................................................................................................................................   
  
   Condi��es:
   
   1)- A primeira linha cont�m um inteiro N (1 <= N <= 50000) representando a quantidade de pessoas inicialmente na fila. A segunda linha cont�m N 
   inteiros representando os identificadores das pessoas na fila. O primeiro identificador corresponde ao identificador da primeira pessoa na fila.
   � garantido que duas pessoas diferentes n�o possuem o mesmo identificador. A terceira linha cont�m um inteiro M (1 <= M <= 50000 e M < N) repre-
   sentando a quantidade de pessoas que deixaram a fila. A quarta linha cont�m M inteiros representando os identificadores das pessoas que deixaram
   a fila (cada identificador est� entre 1 e 100000), na ordem em que elas sa�ram. � garantido que um mesmo identificador n�o aparece duas vezes nes-
   sa lista.
      
   2)- Seu programa deve imprimir uma linha contedo N - M inteiros com os identificadores das pessoas que permaneceram na fila, em ordem de chegada.

   3)- N�o esque�a de imprimir o fim de linha ap�s a saida especificada, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada     | Exemplos de Sa�da   |
          |	8					   |100 81 70 2 1000	 |		
		  |	5 100 9 81 70 33 2 1000|					 |	
		  |	3                      |					 |	
		  |	9 33 5                 |					 |	
          |------------------------|---------------------|
          | 4                      |10 9 6				 |
          | 10 9 6 3			   |					 |
          | 1					   |					 |
          | 3					   |					 |
		  |------------------------|---------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;


public class URI_2460_Fila_URI {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um inteiro N (1 <= N <= 50000) representando a quantidade de pessoas inicialmente na fila;
		int N = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- A segunda linha cont�m N inteiros representando os identificadores das pessoas na fila.
		int ID[] = new int[N];
		
		for(int i=0; i<N; i++) {
			ID[i] = entrada.nextInt();									//Leitura dos IDs das pessoas na fila;
		}
		
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------------		
//3)- A terceira linha cont�m um inteiro M (1 <= M <= 50000 e M < N) representando a quantidade de pessoas que deixaram a fila;
		
		int M = entrada.nextInt();										//Leitura da quantidade de pessoas que deixaram a fila; 
		
//Objetivo 4 ----------------------------------------------------------------------------------------------------------------------------------------		
//4)- A quarta linha cont�m M inteiros representando os identificadores das pessoas que deixaram a fila (cada identificador est� entre 1 e 100000)
		
		int IDsairam[] = new int[M];								
		
		for(int i=0; i<M; i++) {
			IDsairam[i] = entrada.nextInt();							//Leitura dos IDs das pessoas que deixaram a fila;;
		}
		
//Objetivo 5 ----------------------------------------------------------------------------------------------------------------------------------------		
//5)- Imprimia uma linha contedo N - M inteiros com os identificadores das pessoas que permaneceram na fila, em ordem de chegada.

		//5.1)- ;
		for(int i=0; i<IDsairam.length; i++) {
			
			
		}
	
		//5.2)- ;
			
		for(int i=0; i<ID.length; i++) {
			
			if(ID[i] != 0) {
				if(i == ID.length-1) {
					System.out.print(ID[i]);
				}else
					System.out.print(ID[i]+" ");
			}

		}
		System.out.println();
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close(); 
		   		
	}
}

N�O RESOLVIDO

