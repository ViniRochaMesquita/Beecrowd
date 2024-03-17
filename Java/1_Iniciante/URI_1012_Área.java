/*
|>Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
  
  a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura;
  b) a �rea do c�rculo de raio C. (pi = 3.14159);
  c) a �rea do trap�zio que tem A e B por bases e C por altura;
  d) a �rea do quadrado que tem lado B;
  e) a �rea do ret�ngulo que tem lados A e B.
  
   Condi��es:
   
   1)-O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.
   
   2)- O arquivo de sa�da dever� conter 5 linhas de dados. Cada linha corresponde a uma das �reas descritas acima, sempre com mensagem
   correspondente e um espa�o entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 d�gitos ap�s o ponto decimal.
      
   3)-N�o esque�a de imprimir o fim de linha ap�s o produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |   3.0  4.0  5.2     |     TRIANGULO: 7.800   |
          |                     |     CIRCULO: 84.949    |
          |                     |     TRAPEZIO: 18.200   |
          |                     |     QUADRADO: 16.000   |              
          |                     |     RETANGULO: 12.000  | 
          |---------------------|------------------------|
          |  12.7  10.4 15.2    |     TRIANGULO: 96.520  |
          |                     |     CIRCULO: 725.833   |
          |                     |     TRAPEZIO: 175.560  |
		  |						|     QUADRADO: 108.160  | 
		  |					    |	  RETANGULO: 132.080 |
          |---------------------|------------------------|
        

______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1012_�rea {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double A = entrada.nextDouble(),
			   B = entrada.nextDouble(),
			   C = entrada.nextDouble();
		
//-------------------------------------------------------------------------------------------------------------------		
		//a) A �rea do tri�ngulo ret�ngulo que tem A por base e C por altura;
        //OBS.: Area = (Base * ALtura) / 2 ;
		
		double TRIANGULO = ( (A * C) /2 );
		
	    //b) A �rea do c�rculo de raio C. (pi = 3.14159);
		//OBS.: �rea = pi * raio� ;
		double CIRCULO = 3.14159 * Math.pow(C, 2);
		
		//c) A �rea do trap�zio que tem A e B por bases e C por altura;
		//OBS.:�rea = ( (BaseMaior + Base Menor) * altura ) /2;
		double TRAPEZIO = ( (A+B) * C ) /2;
		
		//d) A �rea do quadrado que tem lado B;
		//OBS.: �rea = lado * lado4;
		double QUADRADO = B * B;
		
		//e) A �rea do ret�ngulo que tem lados A e B.
		//OBS.: �rea = LadoMaior *LadoMenor; 
		double RETANGULO = A * B;
//-------------------------------------------------------------------------------------------------------------------
		System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f\n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f\n", QUADRADO);
		System.out.printf("RETANGULO: %.3f\n", RETANGULO);
				
		System.out.println();   		
		
		entrada.close();
		
	}

}
