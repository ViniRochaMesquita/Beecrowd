/*
|>Objetivos:  

 Jo�ozinho tem que ajudar seu pai. Um relat�rio espec�fico com alguns n�meros est� saindo com caracteres indesej�veis no meio. 
A ideia � apenas somar os 3 valores que aparecem em cada linha sempre na mesma posi��o, ignorando as letras e apresentar esta soma. 
N�o existem espa�os em branco na linha.

.....................................................................................................................................
  
   Condi��es:
   
   1)-A primeira linha de entrada cont�m um inteiro N (N < 100000). Seguem N linhas com exatos 14 caracteres que devem ser lidas e delas 
   extra�dos e somados os tr�s n�meros existentes.
   
   2)-Para cada linha de entrada, seu programa deve apresentar um valor num�rico inteiro, que � a soma dos 3 n�meros existentes na linha.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           _________________________ _____________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |     3               |                        |
		  |		Ab23s249ttu21   |           293          |
		  |		At01v021kkk12   |           34           |  
		  |		xx14l134mjm01   |           149          |                        
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.util.Scanner;

public class URI_2694_Problema_com_a_Calculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)-A primeira linha de entrada cont�m um inteiro N (N < 100000). 				   
		int N = entrada.nextInt();
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//Seguem N linhas com exatos 14 caracteres que devem ser lidas e delas 
//extra�dos e somados os tr�s n�meros existentes.
		for(int i = 1; i<=N; i++ ) {
			
			String num = entrada.next();
			
//			System.out.println("Teste N�: " + i);//DEBUG

			String n1  = num.substring(2,4);
//			System.out.println("n1 = " + n1);//DEBUG
			String n2  = num.substring(5,8);
//			System.out.println("n2 = " + n2);//DEBUG
			String n3  = num.substring(11,13);
//			System.out.println("n3 = " + n3);//DEBUG
			
//			System.out.println("--------------------------");//DEBUG

			n1 = n1.replaceAll("[^0-9]+", "");//Isso subistitui qualquer caractere qua n�o seja um digito de 0 a 9 por NADA ou "";
			n2 = n2.replaceAll("[^0-9]+", "");
			n3 = n3.replaceAll("[^0-9]+", "");


			int valor1 = Integer.parseInt(n1);
			int valor2 = Integer.parseInt(n2);
			int valor3 = Integer.parseInt(n3);
			
			int soma = valor1 + valor2 + valor3;
			System.out.println(soma);
		}
		
		
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}

