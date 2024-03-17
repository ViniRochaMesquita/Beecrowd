/*
|> Leia um valor inteiro correspondente � idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo m�s com 30 dias. Nos casos de teste nunca haver� uma
situa��o que permite 12 meses e alguns dias, como 360, 363 ou 364. Este � apenas um exerc�cio com objetivo de testar racioc�nio ma-
tem�tico simples.
 
   Condi��es:
   
   1) O arquivo de entrada cont�m um valor inteiro;

   2) Imprima a sa�da conforme exemplo fornecido.
  
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |       400           |        1 ano (s)       |
          |                     |        1 mes (es)      |
          |                     |        5 dia (s)       |
          |---------------------|------------------------|
          |       800           |        2 ano (s)       |
          |                     |        2 mes (es)      |
          |                     |        10 dia (s)      |
          |---------------------|------------------------|
          |       30            |        0 ano (s)       |
          |                     |        1 mes (es)      |
          |                     |        0 dia (s)       |
          |---------------------|------------------------|          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1020_Idade_Em_Dias {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int NUM = entrada.nextInt();//dias fornecidos da entrada
		
		int ANOS  = NUM / 365; //Isso dar� a quantidade de anos completos que � possivel formar com os dias fornecidos;
		    NUM   = NUM % 365; //Isso dar� a quantidade de dias restantes que n�o completam um ano completo de 365 dias;
		int MESES = NUM / 30;  //Isso dar� a quantidade de meses completos que � possivel formar com os dias restantes;
	        NUM   = NUM % 30;  //Isso dar� a quantidade de dias restantes que n�o completam um mes comlpeto de 30 dias.
	    int DIAS  = NUM;
	    
	    System.out.printf("%d ano(s)\n",ANOS);
	    System.out.printf("%d mes(es)\n",MESES);
	    System.out.printf("%d dia(s)\n",DIAS);
	        
		System.out.println(); 
		
		entrada.close();
		
	}

}
