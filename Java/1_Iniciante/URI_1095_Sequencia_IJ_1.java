/*
|>Objetivos: Voc� deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

....................................................................................................................................................   
  
   Condi��es:
   
   1)- N�o h� nenhuma entrada neste problema.
   
   2)- Imprima a sequencia conforme exemplo abaixo
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   | 
		  | 					|		I=1 J=60		 |
		  |						|		I=4 J=55         |
		  |						|		I=7 J=50         |
		  |						|		...				 |
		  |						|		I=? J=0			 |      
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;


public class URI_1095_Sequencia_IJ_1 {

	public static void main(String[] args) {
		   
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1) Escreva a sequ�ncia, I incrementa em 3 com�ando de 1, e J decrementa em 5 come�ando de 60.
    	int I = 1;
    	int J = 60;
    	
    	for(J=60; J>=0; J -= 5) {
    		System.out.println( "I="+I + " J="+J);
    		I += 3;    		
    	}
	
		   		
	}
}

