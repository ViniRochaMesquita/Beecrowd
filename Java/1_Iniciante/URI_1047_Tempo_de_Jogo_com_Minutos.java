/*
|>Objetivos:
1)- Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo;
2)- A seguir calcule a dura��o do jogo, O jogo tem dura��o m�nima de um (1) minuto e dura��o m�xima de 24 horas.
 ............................................................................................................................................
  
   Condi��es:
   
   1)- A entrada cont�m quatro n�meros inteiros representando a hora de in�cio e fim do jogo;

   2)-Mostre a seguinte mensagem: �O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)�;
   
   3)-N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ___________________________________________________________
          | Exemplo de Entrada  |           Exemplos de Sa�da         |
          |     7 8 9 10        |O JOGO DUROU 2 HORA(S) E 2 MINUTO(S) |
          |---------------------|-------------------------------------|
          |     7 7 7 7         |O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)|
          |---------------------|-------------------------------------|
          |     7 10 8 9        |O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)|
          |_____________________|_____________________________________|    
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1047_Tempo_de_Jogo_com_Minutos {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//1)- Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo, 4 inteiros;

           int horaInicial   = entrada.nextInt(),
        	   minutoInicial = entrada.nextInt(),
        	   horaFinal      = entrada.nextInt(),
        	   minutoFinal    = entrada.nextInt();
           
          //DEBUG
          //System.out.printf("Hora Inicial: %d HORA(S) E %d MINUTOS\n", horaInicial, minutoInicial); 
          //System.out.printf("Hora Final: %d HORA(S) E %d MINUTOS\n", horaFinal, minutoFinal); 
           

//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------           
//2)- A seguir calcule a dura��o do jogo, O jogo tem dura��o m�nima de um (1) minuto e dura��o m�xima de 24 horas.
           
           //Horas       
           int duracaoHoras = horaFinal - horaInicial;
          //System.out.printf("1- Dura��o de Horas: %d\n", duracaoHoras);//DEBUG
           
           //Minutos
           int duracaoMinutos = minutoFinal - minutoInicial;
          //System.out.printf("1- Dura��o de Minutos: %d\n", duracaoMinutos);//DEBUG
        
           if(horaInicial == horaFinal && minutoInicial == minutoFinal) {//Como o jogo tem dur�a� minima de 1 min, se essa condi��o for verdadeira significa que o jogo durou 24h
        	   duracaoHoras = 24;
        	   
           }else if( duracaoMinutos < 0 ) { //Caso em o jogo durou menos de uma hora
        	   duracaoMinutos = duracaoMinutos + 60;
          //System.out.printf("2- Dura��o de Minutos: %d\n", duracaoMinutos);//DEBUG

        	   duracaoHoras = duracaoHoras - 1;
          //System.out.printf("2- Dura��o de Horas: %d\n", duracaoHoras);//DEBUG

                   	    if( duracaoHoras < 0 ){ //Caso em que o jogo durou mais de 1 dia
                   	    	duracaoHoras = duracaoHoras + 24;
          //System.out.printf("3- Dura��o de Horas: %d\n", duracaoHoras);//DEBUG

                   	    }
           }
     	   
        	   
//--------------------------------------------------------------------------------------------------------------------------------
           System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);
           
//---------------------------------------------------------------------------------------------------------------------------------           
           entrada.close();
		
	}

}

