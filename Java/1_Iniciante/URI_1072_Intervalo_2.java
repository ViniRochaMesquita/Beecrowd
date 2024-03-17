/*
|>Objetivos:  

1)- Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.

2)- Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas informa��es.

 ....................................................................................................................................
  
   Condi��es:
   
   1)- A primeira linha da entrada cont�m um valor inteiro N (N < 10000), que indica o n�mero de casos de teste.
   Cada caso de teste a seguir � um valor inteiro X (-107 < X <107);
   
   2)- Para cada caso, imprima quantos n�meros est�o dentro (in) e quantos valores est�o fora (out) do intervalo;
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
......................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |                     |                        |
          |			4           |         2 in           |
		  |		   14           |         2 out          |
		  |		  123           |                        |
          |        10           |                        |
		  | 	  -25           |                        |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1072_Intervalo_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A primeira linha da entrada cont�m um valor inteiro N (N < 10000), que indica o n�mero de casos de teste;
//Cada caso de teste a seguir � um valor inteiro X (-107 < X <107);			   
		int N    = entrada.nextInt(),        
			CASO = 0,						 
			cont = 0,
			in   = 0,
			out  = 0;
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas informa��es;
//OBS: "[" e "]" significam intervalo fechado, logo seus extremos est�o incluidos, nesse caso, 10 e 20;
		
		while(cont < N) {  				    //Isso � para garantir que apenas N numeros sejam lidos;
			CASO = entrada.nextInt();
			if(CASO >= 10 && CASO <= 20) {	//Isso verifica se o CASO est� dentro do intervalo;
				in++;  						//Isso contabiliza quantos CASOS est�o dentro do intervalo;
			}else {
				out++;						//Isso contabiliza quantos CASOS N�O est�o dentro do intervalo;
			}
			cont++;
		}
		   
		System.out.println(in  + " in");
		System.out.println(out + " out");
		
//---------------------------------------------------------------------------------------------------------------------------------
			   
		entrada.close();
		   
	}
}


