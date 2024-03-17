/*
|>Objetivos: 
	P�ricles � um rapaz que tem um interesse �nico por hist�ria. Utilizando seu atualizad�ssimo navegador de internet rapoza croma
da, conheceu at� os sitios mais remotos e obscuros atr�s de informa��es sobre a mitologia grega.

	Por ironia do destino, o navegador de P�ricles acabou sendo infectado por um malware com uma caracter�sica peculiar: cada vez 
que P�ricles fechava uma aba no seu navegador, outras duas abas apareciam! No entanto, quando P�ricles clicou sem querer em uma das
propagandas de uma aba, percebeu que, por um erro do navegador, a aba foi encerrada (sem abrir outras abas). Por causa do malware, 
todas as abas possuem irritantes propagandas.

	Sua tarefa � descobrir com quantas abas que o navegador de P�ricles ficou, sabendo o n�mero inicial de abas e a sequ�ncia de 
a��es de P�ricles. As a��es podem ser fechou (quando P�ricles fechou uma aba) ou clicou (quando P�ricles clicou em uma propaganda).

....................................................................................................................................................   
  
   Condi��es:
   
   1)- A entrada � iniciada por uma linha contendo dois n�meros inteiros positivos, N e M (0 < N, M < 500), representando o n�mero 
   inicial de abas e o n�mero de a��es de P�ricles. Cada linha subsequente cont�m uma a��o (fechou ou clicou). Naturalmente, o n�mero 
   de abas � sempre maior ou igual a zero.
   
   2)- A sa�da deve ser uma linha contendo o n�mero final de abas.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          | 3 5					|	 2					 |
		  |	fechou				|						 |
		  |	fechou				|						 |
		  |	clicou				|						 |
		  |	clicou				|						 |	
		  |	clicou				|						 |	
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;


public class URI_2061_As_Abas_de_P�ricles {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
     
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia dois n�meros inteiros positivos, N e M (0 < N, M < 500);
    	int N = entrada.nextInt();	//N�mero de abas abertas iniciais;
    	int M = entrada.nextInt(); 	//N�mero de a��es tomadas;
    	String acao;

//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Calcule quantas abas que o navegador de P�ricles ficou, sabendo o n�mero inicial de abas(N) e a sequ�ncia de a��es de P�ricles(M). 
//As a��es podem ser fechou (quando P�ricles fechou uma aba) ou clicou (quando P�ricles clicou em uma propaganda).
    	
    	//2.1)- Execute somente M a��es
    	int cont = 0;
    	while(cont<M) {
     		cont++;
    		//2.2)- Leia uma string que ser� a a��o;
     			   acao = entrada.nextLine();
    		
    		//2.3)- Se a a��o for "fechou", o n�mero de abas aumenta em 2;
    		if(acao.equals("fechou")) {
    			N = N+1;
    		
    		//2.4)- Caso contr�rio a o n�mero de a��es diminui em 1;
    		}else  {
    			N = N-1;
    		
    		}   		
    		
    	}
    	
    	System.out.println(N);
    	
		
//--------------------------------------------------------------------------------------------------------------------------------------------------	

    	entrada.close();
		   		
	}
}

