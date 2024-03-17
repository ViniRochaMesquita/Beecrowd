/*
|>Objetivos: A empresa ABC resolveu conceder um aumento de sal�rios a seus funcion�rios de acordo com a tabela abaixo:
  _____________________________________________________________
 |           Sal�rio               |	Percentual de Reajuste |
 |            0 - 400.00           |            15%            |
 |       400.01 - 800.00           |            12%            |
 |       800.01 - 1200.00          |            10%            |
 |      1200.01 - 2000.00          |             7%            |
 |       Acima de 2000.00          |             4%   	       |
 |_________________________________|___________________________|

1)- Leia o sal�rio do funcion�rio; 
2)- Calcule e mostre o novo sal�rio, bem como o valor de reajuste ganho e o �ndice reajustado, em percentual. 

......................................................................................................................................
   Condi��es:   
   
   1)- A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais;
   
   2)- Imprima 3 linhas na sa�da: o novo sal�rio, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
   
   3)-N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |      400.00         |  Novo salario: 460.00  |
          |                     |  Reajuste ganho: 60.00 |
          |                     |  Em percentual: 15 %   |
          |---------------------|------------------------|
          |      800.01         |  Novo salario: 880.01  |
          |                     |  Reajuste ganho: 80.00 |
          |                     |  Em percentual: 10 %   |
          |---------------------|------------------------|
          |     2000.00         |  Novo salario: 2140.00 |
          |                     |  Reajuste ganho: 140.00|
          |                     |  Em percentual: 7 %    |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1048_Aumento_de_Sal�rio {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   DecimalFormat saidaFormatada = new DecimalFormat("0.00");
		   
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//1)- Leia o sal�rio do funcion�rio, a entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais;
    
		   double salario = entrada.nextDouble(),
				  novoSalario,
		          reajuste = 0;
		   int porcemtagem = 0;
           
//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------           
//2)- Calcule e mostre o novo sal�rio, bem como o valor de reajuste ganho e o �ndice reajustado, em percentual; 
//    Imprima 3 linhas na sa�da: o novo sal�rio, o valor ganho de reajuste e o percentual de reajuste ganho.

		   
		   if( salario >= 0 && salario <= 400.00) {
			   //15%
			   
			   reajuste = salario * 0.15;
			   porcemtagem = 15;
			   
		   }
		   if( salario > 400.00 && salario <= 800.00) {
			   //12%
			   reajuste = salario * 0.12;
			   porcemtagem = 12;

		   }
           if( salario > 800.00 && salario <= 1200.00) {
        	   //10%
			   reajuste = salario * 0.1;
			   porcemtagem = 10;
			   
           }
           if( salario > 1200.00 && salario <= 2000.00) {
        	   //7%
			   reajuste = salario * 0.07;
			   porcemtagem = 7;
           }
           if(salario > 2000.00) {
        	   //4%
			   reajuste = salario * 0.04;
			   porcemtagem = 4;

           }
   	           
           novoSalario = salario + reajuste;
          
//-----------------------------------------------------------------------------------------------------------------------------           
System.out.println("Novo salario: " + saidaFormatada.format(novoSalario));
System.out.println("Reajuste ganho: " + saidaFormatada.format(reajuste));
System.out.printf("Em percentual: %d %%\n", porcemtagem);
//-----------------------------------------------------------------------------------------------------------------------------           
           entrada.close();
		
	}

}

