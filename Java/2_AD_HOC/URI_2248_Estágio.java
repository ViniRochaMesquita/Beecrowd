/*
|>Objetivos:  
	Voc� conseguiu um est�gio para trabalhar como programador na secretaria da sua escola. Como primeira tarefa, Dona Vilma, a coordenadora, solici-
tou que voc� aprimore um programa que foi desenvolvido pelo estagi�rio anterior. Esse programa tem como entrada uma lista de nomes e de m�dias fina-
is dos alunos de uma turma, e determina o aluno com a maior m�dia na turma. Dona Vilma pretende utilizar o programa para premiar o melhor aluno de 
cada turma da escola. O programa desenvolvido pelo estagi�rio anterior encontra-se nas p�ginas a seguir (programa Pascal na p�gina 5, programa C na
p�gina 6, programa C++ na p�gina 7).

 	Como voc� pode verificar, o programa na forma atual tem uma imperfei��o: no caso de haver alunos empatados com a melhor m�dia na turma, ele impri
me apenas o primeiro aluno que aparece na lista.

	Dona Vilma deseja que voc� altere o programa para que ele produza uma lista com todos os alunos da turma que obtiveram a maior m�dia, e n�o ape-
nas um deles. Voc� consegue ajud�-la nesta tarefa?
....................................................................................................................................................   
  
   Condi��es:
   
   1)-A entrada � constitu�da de v�rios conjuntos de teste, representando v�rias turmas. A primeira linha de um conjunto de testes cont�m um n�mero
   inteiro N (1 <= N <= 1000) que indica o total de alunos na turma. As N linhas seguintes cont�m, cada uma, um par de n�meros inteiros 
   C (1 <= C<= 20000) e M (0 <= M <= 100), indicando respectivamente o c�digo e a m�dia de um aluno. 
   -O final da entrada � indicado por uma turma com N = 0.
  
   2)-Para cada turma da entrada seu programa deve produzir tr�s linhas na sa�da. 
   -A primeira linha deve conter um identificador do conjunto de teste, no formato �Turma n�, onde n � numerado a partir de 1. 
   -A segunda linha deve conter os c�digos dos alunos que obtiveram a maior m�dia da turma. Os c�digos dos alunos devem aparecer na mesma ordem da 
   entrada, e cada um deve ser seguido de um espa�o em branco. 
   -A terceira linha deve ser deixada em branco. O formato mostrado no exemplo de sa�da abaixo deve ser seguido rigorosamente.


   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |3                    |    Turma 1             |
          |1 85					|	 2                   |
	   	  |2 91					|                        |
          |3 73					|	 Turma 2             |
		  |5					|	 12601 10111 212     |
		  |12300 81				|						 |
		  |12601 99				|						 |
		  |15023 76				|						 |
		  |10111 99             |						 |
		  |212 99               |						 |	
		  |0                    |						 |	
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;

public class URI_2248_Est�gio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
//A entrada � constitu�da de v�rios conjuntos de teste;
//Esse programa tem como entrada uma lista de nomes e de m�dias finais dos alunos de uma turma, e determina o aluno com a maior m�dia na turma.			   

//Objetivo 0 ---------------------------------------------------------------------------------------------------------------------------------------
//Contabilize a entada de dados para poder imprimir Turma i;
		int contTurma = 0;	 						//Isso contabiliza a quantidade de turmas entradas para fims de impress�o;
		int N = 1;
		
		while(N != 0) {
			contTurma++;
//Objetivo 1 ---------------------------------------------------------------------------------------------------------------------------------------
//1)- A primeira linha de um conjunto de testes cont�m um n�mero inteiro N (1 <= N <= 1000) que indica o total de alunos na turma.
			 N = entrada.nextInt();					//Total de alunos na turma;

			
//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------------
//2)- As N linhas seguintes cont�m, cada uma, um par de n�meros inteiros C (1 <= C<= 20000) e M (0 <= M <= 100), indicando respectivamente o c�digo
//e a m�dia de um aluno.
//- O final da entrada � indicado por uma turma com N = 0, zero alunos.
		
	  //2.1)- Leia os codigos e as medias e armazene esses valores em um vetor;
		int C[] = new int[N];							//Isso vai armazenar os c�digos dos N alunos;
		int M[] = new int[N];							//Isso vai armazenar a m�dia dos N alunos;
			
		for(int i=0; i<N; i++) {
			C[i] = entrada.nextInt();					//Leitura dos c�digo do aluno i;
			M[i] = entrada.nextInt();					//Leitura da media do aluno i;			
			
		}
	  //--------------------------------------------------------------------------------------------------------------------------------------------
	  //2.2)- Obtenha a maior media;
		int maiorMedia = 0;
		for(int j=0; j<M.length; j++) {
			if( M[j] > maiorMedia ) {
				maiorMedia = M[j];	 
			}
		}
	  
	  //--------------------------------------------------------------------------------------------------------------------------------------------
	  //2.3)- Verifique quais codigos correspondem a maiorMedia
		
		int maioresMedias[]  = new int[N];				//Armazena apenas os c�digos que alcan�aram a maior m�dia 
			
		for(int k=0; k<maioresMedias.length; k++) {
				
			if(M[k] == maiorMedia) {					//Isso verifica se o numero atual do "loop k" � igual a maior m�dia;
	
				maioresMedias[k] = M[k];				//Isso armazena todas as medias que s�o iguais a maior media na mesma posi��o do c�digo cor-
														//respondente;
				
			}
			
		}
		//------------------------------------------------------------------------------------------------------------------------------------------
		//2.4)- Imprima o n�meor da turma atual
			System.out.println("Turma " + contTurma);
		//------------------------------------------------------------------------------------------------------------------------------------------
		//2.5)-  Imprima todos os c�digos que atingiram a maior m�dia
			for(int l=0; l<N; l++) {
				if(maioresMedias[l] != 0) {
					System.out.print(C[l]+" ");
				}
				
			}
			
			System.out.println("\n");
			
													
//--------------------------------------------------------------------------------------------------------------------------------------------------
		}		   
//--------------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}


