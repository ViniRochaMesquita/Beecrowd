/*
|>Objetivos:  

1)- Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno. 
2)- Calcule e imprima a m�dia semestral. 
3)- Fa�a com que o algoritmo s� aceite notas v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]).
Cada nota deve ser validada separadamente.

............................................................................................................................
  
   Condi��es:
   
   1)- A entrada cont�m v�rios valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas v�lidas;
   
   2)- 
   a) Se uma nota inv�lida for lida, deve ser impressa a mensagem "nota invalida";
   b) Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do c�lculo;
   c) O valor deve ser apresentado com duas casas ap�s o ponto decimal;
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |       -3.5          |     nota invalida      |
          |---------------------|------------------------|
          |        3.5          |     nota invalida      |
          |---------------------|------------------------|
          |       11.0          |						 |
          |---------------------|     media = 6.75       |
          |       10.0          |        		         |
          |---------------------|------------------------|

_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1117_Valida��o_de_Nota {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat saidaFormatada = new DecimalFormat("0.00");
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A entrada cont�m v�rios valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas v�lidas;
				   
		double nota1 = 0,				//Primeira nota a ser lida
			   nota2 = 0,				//Segunda nota a ser lida
			   media;				    //Media das duas notas
		boolean verNotas = false,       //Essa variavel ser� responsavel por verificar se 2 notas validas j� foram lidas;
				ver1 = true,   	        //Essa variavel ser� responsavel por verificar se a 1� nota � invalida;
				ver2 = true;		    //Essa variavel ser� responsavem por verificar se a 2� nota � invalida;
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- 
//a) Se uma nota inv�lida for lida, deve ser impressa a mensagem "nota invalida";
//b) Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do c�lculo;
//c) O valor deve ser apresentado com duas casas ap�s o ponto decimal;
		while(verNotas == false) {							//Quando for verdade, duas notas lidas foram consideradas validas;

			while(ver1 == true) {							//Enquanto for verdade a nota � invalida;
				nota1 = entrada.nextDouble();
				if (nota1 < 0 || nota1 >10) {				//Isso verifica se a nota � invalida, caso seja, uma nova nota ser� lida;
					System.out.println("nota invalida");
				}else {
					ver1 = false;							//Caso ela esteja dentro do intervalo ela � considerada valida;
				}
			}
			
			while(ver2 == true) {							//Enquanto for verdade a nota � invalida;
				nota2 = entrada.nextDouble();
				if (nota2 < 0 || nota2 >10) {				//Isso verifica se a nota � invalida, caso seja, uma nova nota sera lida;
					System.out.println("nota invalida");	
				}else {
					ver2 = false;							//Caso ela esteja dentro do intervalo ser� considerada valida;
				}
			}
			
			verNotas = true;
		}
			media = (nota1 + nota2)/2;
			
			System.out.println("media = " + saidaFormatada.format(media));		
		   
//---------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

