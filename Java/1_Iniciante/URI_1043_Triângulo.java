/*
|>Objetivos
1)- Leia 3 valores reais (A, B e C);
2)- Verifique se eles formam ou n�o um tri�ngulo. 

    a)- Em caso positivo, calcule o per�metro do tri�ngulo e apresente a mensagem:
    
    Perimetro = XX.X
    
    b)- Em caso negativo, calcule a �rea do trap�zio que tem A e B como base e C como altura, mostrando a mensagem

    Area = XX.X
 .......................................................................................................................................
  
   Condi��es:
   
   1)- A entrada cont�m tr�s valores reais;
   
   2)- O resultado deve ser apresentado com uma casa decimal;
   
   3)-N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          | 6.0 4.0 2.0         | Area = 10.0            |
          |---------------------|------------------------|
          | 6.0 4.0 2.0         | Perimetro = 12.1       |
          |---------------------|------------------------|
 
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1043_Tri�ngulo {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
           DecimalFormat saidaFormatada = new DecimalFormat("0.0");

           //Objetivo 1---------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 3 valores reais (A, B e C);
		   double A = entrada.nextDouble(),
				  B = entrada.nextDouble(),
				  C = entrada.nextDouble();

//Objetivo 2---------------------------------------------------------------------------------------------------------------------------------
//2)- Verifique se eles formam ou n�o um tri�ngulo. 
/*Condi��o de existencia de um triangilo, a soma de 2 lados tem sempre que ser maior que o tercwiro lado;

		a + b > c
		a + c > b
		b + c > a
		   		   
*/
		   if (A + B > C && A + C > B && B + C > A) {
			  
//a)- Em caso positivo, calcule o per�metro do tri�ngulo e apresente a mensagem: Perimetro = XX.X 

			   double perimetro = A + B + C;
			   System.out.println("Perimetro = " + saidaFormatada.format(perimetro));
		   
		    
//b)- Em caso negativo, calcule a �rea do trap�zio que tem A e B como base e C como altura, mostrando a mensagem: Area = XX.X	   
	 }else {
		 
		 	double area = ((A+B) * C) / 2; 
		 	System.out.println("Area = " + saidaFormatada.format(area));
	 }
		  	   
//-------------------------------------------------------------------------------------------------------------------------------------------
         
		   entrada.close();
		
	}

}

