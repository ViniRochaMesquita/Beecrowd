/*
|>Objetivos:
1)- Leia a hora inicial e a hora final de um jogo; 
2)- A seguir calcule a dura��o do jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora
e m�xima de 24 horas.  

 ............................................................................................................................................
  
   Condi��es:
   
   1)- A entrada cont�m dois valores inteiros representando a hora de in�cio e a hora de fim do jogo.

   2)- Apresente a dura��o do jogo conforme exemplo abaixo.

   3)-N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |      16  2          |O JOGO DUROU 10 HORA(S) |
          |---------------------|------------------------|
          |      0   0          |O JOGO DUROU 24 HORA(S) |
          |---------------------|------------------------|
          |      2  16          |O JOGO DUROU 14 HORA(S) |
          |_____________________|________________________|          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1046_Tempo_de_Jogo {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//1)- Leia a hora inicial e a hora final de um jogo;
           int INICIO = entrada.nextInt(),
        		  FIM = entrada.nextInt();

//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------           
//2)- A seguir calcule a dura��o do jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora
//e m�xima de 24 horas.          
           int DURACAO;

           if(INICIO == FIM){ // tendo uma dura��o m�nima de 1 hora nunca sera possivel come�ar e terminar na mesma hora do mesmo dia
        		    
        	   DURACAO = 24;
        	   
           }else {
        	   if(INICIO > 12 ) {

        		   INICIO = 24 - INICIO;
        		   	
        	   }else {
        		   	
        		   INICIO = INICIO + 12 ;
        		   INICIO = 24 - INICIO;
        	   }
         
           if(FIM > 12 ){
        	   
        	   FIM = FIM - 12;
           }
        	
           DURACAO = INICIO + FIM;
           
           }
//--------------------------------------------------------------------------------------------------------------------------------
           System.out.printf("O JOGO DUROU %d HORA(S)\n", DURACAO);
           
//---------------------------------------------------------------------------------------------------------------------------------           
           entrada.close();
		
	}

}

