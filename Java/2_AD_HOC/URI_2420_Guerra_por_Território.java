/*
|>Objetivos:  
	Tomb�lia do Oeste e Tomb�lia do Leste travaram uma guerra durante 50 anos. O motivo da guerra era o tamanho do territ�rio de cada pa�s. Pelo bem
da popula��o dos dois pa�ses, os governos resolveram fazer um tratado para finalizar a guerra. O tratado consiste em fazer um divis�o justa, e certa-
mente cont�nua, do territ�rio. Eles resolveram pedir sua ajuda para calcular o ponto de divis�o do territ�rio. Depois de tantos anos de guerra, os pa
�ses n�o podem lhe pagar uma viagem para ver previamente o territ�rio que ser� dividido. Ao inv�s disso, eles prepararam uma lista a1,a2,�,aN de inte
iros que indicam o tamanho de cada se��o do territ�rio. A se��o a1 � vizinha da se��o a2 que por sua vez � vizinha da se��o a3; e assim por diante.
Os governos querem uma divis�o em uma se��o k de tal forma que a1 + a2 + � + ak = ak+1 + ak+2 + � + aN.

	Sua tarefa � dada uma lista de inteiros positivos a1, a2,..., aN , determinar a se��o k tal que soma dos comprimentos das se��es a1 at� ak � igual a 
soma dos comprimentos das se��es ak+1 at� aN

....................................................................................................................................................   
  
   Condi��es:
   
   1)-A primeira linha da entrada cont�m um inteiro N (1 <= N <= 105) indicando o n�mero de se��es do territ�rio. A segunda linha da entrada cont�m N 
   inteiros a1, a2,..., aN (1 <= ai <= 100, para i = 1, 2, . . . , N.)separados por um �nico espa�o que indicam os comprimentos das se��es.
   
   2)-Seu programa deve imprimir uma �nica linha contendo um inteiro que indica a se��o do territ�rio onde acontecer� a divis�o.(� garantido que sem-
   pre existe uma divis�o que satisfaz as condi��es dos pa�ses).
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
       	  |		    4			|			3			 |
          | 	5 3 2 10		|                        |
          |---------------------|------------------------|
          |		    9			|			4			 |
          |   2 8 2 8 4 4 4 4 4	|                        |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;

public class URI_2420_Guerra_por_Territ�rio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um inteiro N;
		int N = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Leia N inteiros;
		int M[] = new int[N];
		for(int i=0; i<N; i++) {
			M[i] = entrada.nextInt();
		}
	
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------------		
//3)- Some esses N inteiros;
		int soma1 = 0;
		for(int j=0; j<N; j++) {
		
			soma1 = soma1 + M[j];
			
		}

//Objetivo 4 ----------------------------------------------------------------------------------------------------------------------------------------		
//3)- Ao percorrer o vetor dos N inteiros, some e pare onde a soma for igual a metade da variavel "soma1";
//Pegue o indice de onde vc parou e imprima;
		int soma2 = 0;
		int indice = 0;
		for(int k=0; k<N; k++) {
			soma2 = soma2 + M[k];
			if(soma2 == (soma1 / 2)) {
				indice = k +1 ;				//+1 pelo fato do vetor iniciar da posi��o 0;
			}		
		}
		
		System.out.println(indice);
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

