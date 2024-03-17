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

public class URI_1060_N�meros_Positivos {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//
		   int cont = 1,
			   positivo = 0;
		              
//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------           
//         
		   while(cont <=6 ) {
			   double n = entrada.nextDouble();
			   if(n > 0) {
				   positivo++;
				 
			   }  
			   cont++;
		   }
   	           
//Objetivo 3 ------------------------------------------------------------------------------------------------------------------------           
//         
		   System.out.printf("%d valores positivos\n", positivo);
//-----------------------------------------------------------------------------------------------------------------------------------
           entrada.close();
		
	}

}

