/*
|>Objetivos: Pedrinho est� organizando um evento em sua Universidade. O evento dever� ser no m�s de Abril, iniciando e terminando 
dentro do m�s. O problema � que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando 
termina o evento.

Sabendo que o evento pode durar de poucos segundos a v�rios dias, voc� dever� ajudar Pedrinho a calcular a dura��o deste evento.

......................................................................................................................................
  
   Condi��es:
   
   1)-Como entrada, na primeira linha vai haver a descri��o �Dia�, seguido de um espa�o e o dia do m�s no qual o evento vai come�ar.
   Na linha seguinte, ser� informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de
   entrada haver� outra informa��o no mesmo formato das duas primeiras linhas, indicando o t�rmino do evento.
   
   2)-Na sa�da, deve ser apresentada a dura��o do evento, no seguinte formato:
		
		W dia(s)
		X hora(s)
		Y minuto(s)
		Z segundo(s)
		
		Obs: Considere que o evento do caso de teste para o problema tem dura��o m�nima de 1 minuto.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           _____________________________________________
          | Exemplo de Entrada  |   Exemplos de Sa�da   |
          |		  Dia 5         |	    3 dia(s)        |
	      |    08 : 12 : 23     |       22 hora(s)      |
	      |	      Dia 9         |       1 minuto(s)     |  
		  |	   06 : 13 : 23     |       0 segundo(s)    |
          |_____________________|_______________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1061_Tempo_de_um_Evento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Como entrada, na primeira linha vai haver a descri��o �Dia�, seguido de um espa�o e o dia do m�s no qual o evento vai come�ar.
		String inicio = entrada.nextLine();	
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Na linha seguinte, ser� informado o momento no qual o evento vai iniciar, no formato hh : mm : ss.
		String HMS    = entrada.nextLine(); 
	  
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------
//3)-Na terceira e quarta linha de entrada haver� outra informa��o no mesmo formato das duas primeiras linhas, indicando o t�rmino do
//evento.
//08 : 12 : 23, exemplo de entrada
		String FIM	= entrada.nextLine();
		String HMSFIM = entrada.nextLine();
	  
//Objetivo 4
//4)- Calcule a dura��o do evento e imprima;

//DIA INICIAL----------------------------------------------------------------------------------------------------------------------------------
		  String dInicio = inicio.substring(4);//Isso pega o valor do dia na String "Inicio";
		  String hInicio = HMS.substring(0,2);				   //Isso pega a parte da hora na String "HSM";
		  String mInicio = HMS.substring(5,7);				   //Isso pega a parte dos minutos na String "HSM";
		  String sInicio = HMS.substring(10,12);		       //Isso pega a parte dos segundos na String "HSM";
//		  	  
//		  System.out.println("----------------------------");  //DEBUG
//		  System.out.println("Dia inicial = " + dInicio); 	   //DEBUG
//		  System.out.println("Hora inicial = " + hInicio);     //DEBUG
//		  System.out.println("Minuto inicial = " + mInicio);   //DEBUG
//		  System.out.println("Segundo inicial = " + sInicio);  //DEBUG
//		  System.out.println("----------------------------");  //DEBUG
	
		  int d1 = Integer.parseInt(dInicio);				   //Isso converte o que est� na String "dInicio" para Inteiro;
		  int h1 = Integer.parseInt(hInicio);				   //Isso converte o que est� na string "hInicio" para inteiro;
		  int m1 = Integer.parseInt(mInicio); 	  	 	 	   //Isso converte o que est� na string "mInicio" para inteiro;
		  int s1 = Integer.parseInt(sInicio);	               //Isso converte o que est� na string "sInicio" para inteiro;
	  
//DIA FINAL------------------------------------------------------------------------------------------------------------------------------------
		  String dFinal   = FIM.substring(4);     //Isso pega o valor do dia na String "FIM";
		  String hFinal = HMSFIM.substring(0,2);  	 	       //Isso pega a parte da hora na String "HSMFIM";
		  String mFinal = HMSFIM.substring(5,7);               //Isso pega a parte dos minutos na String "HSMFIM";
		  String sFinal = HMSFIM.substring(10,12);             //Isso pega a parte dos segundos na String "HSMFIM";
//	
//		  System.out.println("Dia Final = " + dFinal);         //DEBUG
//		  System.out.println("Hora Final = " + hFinal);        //DEBUG
//		  System.out.println("Minuto Final = " + mFinal);      //DEBUG
//		  System.out.println("Segundo Final = " + sFinal);     //DEBUG
//		  System.out.println("----------------------------");  //DEBUG
		  
		  int d2 = Integer.parseInt(dFinal);                   //Isso converte o que est� na String "dFinal" para inteiro;
		  int h2 = Integer.parseInt(hFinal);				   //Isso converte o que est� na string "hFinal" para inteiro;
		  int m2 = Integer.parseInt(mFinal);				   //Isso converte o que est� na string "mFinal" para inteiro;
		  int s2 = Integer.parseInt(sFinal);				   //Isso converte o que est� na string "sFinal" para inteiro;
	  
//---------------------------------------------------------------------------------------------------------------------------------------------	  
//Calculando o tempo em segundos
		  //minutos para segundos = minutos * 60;
		  //horas para segundos   = horas   * 60 * 60;
		  //dia para segundos     = dias    * 60 * 60 * 24;
		  int tempoInicial = s1 + (m1*60) + (h1*60*60) + (d1*24*60*60);
		  int tempoFinal   = s2 + (m2*60) + (h2*60*60) + (d2*24*60*60);
	 	  int tempo        = tempoFinal - tempoInicial;
	 	  
			int dias = tempo/(24*60*60);  
			int resto1 = tempo%(24*60*60);
			
			int horas = resto1/(60*60);
			int resto2 = resto1%(60*60);
			
			int minutos = resto2 / (60); 
			int segundos = resto2 % (60);
			
			System.out.printf("%d dia(s)\n", dias);
			System.out.printf("%d hora(s)\n", horas);
			System.out.printf("%d minuto(s)\n", minutos);
			System.out.printf("%d segundo(s)\n", segundos);
		
		  entrada.close();
	}
}

