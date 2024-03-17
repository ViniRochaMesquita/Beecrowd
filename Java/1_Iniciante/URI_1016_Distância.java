/*
|> Dois carros (X e Y) partem em uma mesma dire��o. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade 
constante de 90 Km/h;

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quil�metros do carro X, ou seja, consegue se afastar um quil�metro a ca-
da 2 minutos;

Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa dist�ncia do outro carro.
  
   Condi��es:
   
   1) O arquivo de entrada cont�m um n�mero inteiro;
  
   2) Imprima o tempo necess�rio seguido da mensagem "minutos".
   
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |          30         |         60 minutos     |
          |---------------------|------------------------|
          |         110         |        220 minutos     |
          |---------------------|------------------------|
          |           7         |          14 minutos    |
          |---------------------|------------------------|
          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1016_Dist�ncia {
	

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		
		int DIST = entrada.nextInt(),
			MIN;
		//Se em 60min o carro Y est� a 30Km do carro X, em quantos minutos ele leva pra estar a DIST Km do carro X?
		//  min        KM                           
		//  60    \/   30
		//  x     /\   DIST
		// 
		// 30x = 60 * DIST => x= 60DIST/30
		
		MIN = (60 * DIST) / 30;
		
		System.out.printf("%d minutos", MIN);		
		
		System.out.println();   		
		
		entrada.close();
	}

}
 