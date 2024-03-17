/*
|>Objetivos:  

1)- Leia um valor inteiro N. Este valor ser� a quantidade de valores que ser�o lidos em seguida. 

2)-Para cada valor lido, mostre uma mensagem em ingl�s dizendo se este valor lido � par (EVEN), �mpar (ODD), positivo (POSITIVE) ou negativo 
(NEGATIVE).No caso do valor ser igual a zero (0), embora a descri��o correta seja (EVEN NULL), pois por defini��o zero � par, seu programa de-
ver� imprimir apenas NULL.

  ............................................................................................................................
  
   Condi��es:
   
   1)- A primeira linha da entrada cont�m um valor inteiro N(N < 10000) que indica o n�mero de casos de teste. Cada caso de teste a seguir �
   um valor inteiro X (-107 < X <107);
   
   2)- Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras dever�o ser mai�sculas e sempre
   dever� haver um espa�o entre duas palavras impressas na mesma linha;
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |         4           |                        |
          |        -5           |     ODD NEGATIVE       |
          |         0           |         NULL           |
          |         3           |     ODD POSITIVE       |
          |        -4           |    EVEN NEGATIVE       |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1074_Par_ou_�mpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A primeira linha da entrada cont�m um valor inteiro N(N < 10000) que indica o n�mero de casos de teste. Cada caso de teste a seguir �
//um valor inteiro X (-107 < X <107);				   
		int N    = entrada.nextInt(),
			CASO = 0,
			cont = 0;
		
		boolean pos = false,
				par = false;
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras dever�o ser mai�sculas e sempre
//dever� haver um espa�o entre duas palavras impressas na mesma linha;
		
		   while(cont < N) {						  //Isso define que apenas N casos ser�o lidos;
			   CASO = entrada.nextInt();  	
		
					if( (CASO % 2 == 0)) {            //Esse "if" verifica se o n�mero � par ou impar;		
						par = true;					  
					}else {
						par = false;
					}
					
					if(CASO > 0) {					  //Isso verifica se o n�mero � positivo ou negativo;
						pos = true;
					}else if(CASO < 0) {
						pos = false;
					}
//---------------------------------------------------------------------------------------------------------------------------------------------
					//EVEN para par e ODD para impar; NEGATIVE/POSITIVE;
					if(CASO == 0) {							//Se ele for NULO;
						System.out.println("NULL");								
					}else if (par == true && pos == true) {		//Se ele for PAR e POSITIVO;
							System.out.println("EVEN POSITIVE");
						}else if (par == true && pos == false) {	//Se ele for PAR e NEGATIVO;
							System.out.println("EVEN NEGATIVE");
							}else if (par == false && pos == true) {	//Se ele for IMPAR e POSITIVO;
								System.out.println("ODD POSITIVE");
								}else if (par == false && pos == false) {	//Se ele for IMPAR e NEGATIVO;
									System.out.println("ODD NEGATIVE");
									}
//---------------------------------------------------------------------------------------------------------------------------------------------
					
					cont++;
		   }
		   
//---------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

