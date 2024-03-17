/*
|> Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento em uma f�brica, e informe-o expresso no forma-
to horas:minutos:segundos.
  
   Condi��es:
   
   1) O arquivo de entrada cont�m um valor inteiro N;
  
   2) Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
   
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |        556          |         0:9:16         |
          |---------------------|------------------------|
          |         1           |         0:0:1          |
          |---------------------|------------------------|
          |       140153        |        38:55:53        |
          |---------------------|------------------------| 
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1019_Convers�o_de_Tempo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int N   = entrada.nextInt();  //segundos fornecidos na entrada
		int HRS = N/3600;             //isso te diz quantas horas completas s�o possiveis formar com os segundos fornecidos;	
		    N   = N % 3600;           //Isso te diz quantos segundos que restaram que n�o completam uma hora inteira;
		int MIN = N/60;               //Isso te diz quantos minutos completos s�o possiveis formar com os ssegundos que restarm;
	        N   = N % 60;             //Isso te diz quantos segundos que restaram que n�o completam um minuto inteiro;
	    int SEC = N;                  //Segundos	
		   
		System.out.printf("%d:%d:%d",HRS,MIN,SEC);
				
		System.out.println();
		
		entrada.close();
		
	}

}
