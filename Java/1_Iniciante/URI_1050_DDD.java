/*
|>- Objetivos:

1)- Leia um n�mero inteiro que representa um c�digo de DDD para discagem interurbana;

2)- Em seguida, informe � qual cidade o DDD pertence, considerando a tabela abaixo:

  		   ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |         61          |       Brasilia         |
          |---------------------|------------------------|
          |         71          |       Salvador         |
          |---------------------|------------------------|
          |         11          |       Sao Paulo        |
          |---------------------|------------------------|
          |         21          |       Rio de Janeiro   |
          |---------------------|------------------------|
          |         32          |       Juiz de Fora     |
          |---------------------|------------------------|
          |         19          |       Campinas         |
          |---------------------|------------------------|
          |         27          |       Vitoria          |
          |---------------------|------------------------|
          |         31          |       Belo Horizonte   |
          |_____________________|________________________|

3)- Se a entrada for qualquer outro DDD que n�o esteja presente na tabela acima, o programa dever� informar: DDD nao cadastrado
  
   Condi��es:
   
   1)- A entrada consiste de um �nico valor inteiro;  
   
   2)- Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso n�o existir DDD correspondente ao n�mero digitado.
   
   3)-N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
          |          11         |        Sao Paulo       |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1050_DDD {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um n�mero inteiro que representa um c�digo de DDD para discagem interurbana;
		
		int DDD = entrada.nextInt();	   

//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Em seguida, informe � qual cidade o DDD pertence, considerando a tabela listada na area de objetivos:
		if ( DDD == 61 ) {
			
			System.out.println("Brasilia");
			}else if ( DDD == 71 ) {
				
					System.out.println("Salvador");
				}else if ( DDD == 11 ) {
					
					System.out.println("Sao Paulo");
						}else if ( DDD == 21 ) {
							
							System.out.println("Rio de Janeiro");
							}else if ( DDD == 32 ) {
								
								System.out.println("Juiz de Fora");
								}else if ( DDD == 19 ) {
									
									System.out.println("Campinas");
									}else if ( DDD == 27 ) {
										
										System.out.println("Vitoria");
										}else if ( DDD == 31 ) {
											
											System.out.println("Belo Horizonte");
											}else {
												System.out.println("DDD nao cadastrado");
												
												}

//-----------------------------------------------------------------------------------------------------------------------------------------
	   
		   entrada.close();
		   
	}
}

