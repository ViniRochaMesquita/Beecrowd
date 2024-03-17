/*
|> -Objetivo-  

  a) -Sub-Obejetivo1;-
  b) -Sub-Obejetivo2;-
  c) -Sub-Obejetivo3;-
  d) -Sub-Obejetivo4;-
  e) -Sub-Obejetivo5;-
  ....................
  
   Condi��es:
   
   1) -Condi��o1-
   
   2) -Condi��o2-
   
   3)-N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |                     |                        |
          |---------------------|------------------------|
          |                     |                        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1064_Positivos_e_M�dia {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//
		   int cont = 1,
			   positivo = 0;
		   double soma = 0,
				  media;
		   
//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------           
//         
		   for(cont=1; cont<=6 ; cont++) {
			   double n = entrada.nextDouble();
			   if(n > 0) {
				   positivo++;
				   soma = soma + n;
			   }  
		   }
   	           
		   media = soma / positivo;
//Objetivo 3 ------------------------------------------------------------------------------------------------------------------------           
//         
		   System.out.printf("%d valores positivos\n", positivo);
		   System.out.printf("%.2f\n", media);
//-----------------------------------------------------------------------------------------------------------------------------------
           entrada.close();
		
	}

}

