/*
|>Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, 
o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor a ser pago.

   Condi��es:
   
   1)-O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 3 valores, respectivamente dois inteiros e um valor com
   2 casas decimais.
   
   2)- A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espa�o ap�s os dois pontos e um es-
   pa�o ap�s o "R$". O valor dever� ser apresentado com 2 casas ap�s o ponto.
      
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
           ______________________________________________
          | Exemplos de Entrada |    Exemplos de Sa�da   |
          |     12 1 5,30       |                        |
          |     16 2 5,10       |VALOR A PAGAR: R$ 15,50 | 
          |---------------------|------------------------|                
          |    13 2 15,30       |                        |
          |   161 4  5,20       |VALOR A PAGAR: R$ 51,40 |
          |---------------------|------------------------|
          |     1 1 15,10       |                        |
          |     2 1 15,10       |VALOR A PAGAR: R$ 30,20 |
          |_____________________|________________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1010_C�lculo_Simples {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o codigo da Pe�a1");
		int    codPe�a1   = entrada.nextInt(); //C�digo da pe�a
		System.out.println("Informe a quantidade:");
		int      qntPeca1   = entrada.nextInt(); //Quantidade de pe�as
		System.out.println("Informe o pre�o de uma unidade da Pe�a1:");
		double valorPeca1 = entrada.nextDouble(); //Valor de uma pe�a

		System.out.println("Informe o codigo da Pe�a2");
		int    codPe�a2   = entrada.nextInt(); //C�digo da pe�a
		System.out.println("Informe a quantidade:");
		int    qntPeca2   = entrada.nextInt(); //Quantidade de pe�as
		System.out.println("Informe o pre�o de uma unidade da Pe�a2:");
		double valorPeca2 = entrada.nextDouble(); //Valor de uma pe�a
		
		double TOTAL = ( (qntPeca1 * valorPeca1) + (qntPeca2 * valorPeca2) );
		
		System.out.println(codPe�a1);
		System.out.println(codPe�a2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", TOTAL);		
		
		System.out.println();   		
		
		entrada.close();
		
	}

}
