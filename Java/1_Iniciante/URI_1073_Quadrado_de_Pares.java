/*
|>Objetivos:  

1)- Leia um valor inteiro N; 

2)- Apresente o quadrado de cada um dos valores pares, de 1 at� N, inclusive N, se for o caso;

...............................................................................................................................
  
   Condi��es:
   
   1)- A entrada cont�m um valor inteiro N (5 < N < 2000);
   
   2)- Imprima o quadrado de cada um dos valores pares, de 1 at� N, conforme o exemplo abaixo.

   OBS:Tome cuidado! Algumas linguagens tem por padr�o apresentarem como sa�da 1e+006 ao inv�s de 1000000 o que ocasionar� resposta 
   errada. Neste caso, configure a precis�o adequadamente para que isso n�o ocorra.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |         6           |        2^2 = 4         |
          |                     |        4^2 = 16        |
          |                     |        6^2 = 36        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1073_Quadrado_de_Pares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um valor inteiro N (5 < N < 2000); 
		int N = entrada.nextInt();
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Apresente o quadrado de cada um dos valores pares, de 1 at� N, inclusive N, se for o caso;
		
		for(int i=1; i<=N ; i++) {
			
			if( (i%2) == 0 ) { 					//Isso verifica se o numero atual do loop � par;
			int	par = i * i;					//Isso armazena o quadrado do numero atual caso ele seja par, voc� pode por deireto no comando
									            //de impress�o, pus aqui apenas pra Voc� entender;
			System.out.printf("%d^2 = %d\n", i, par);
			
								
			}
		}
		
		   
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}

