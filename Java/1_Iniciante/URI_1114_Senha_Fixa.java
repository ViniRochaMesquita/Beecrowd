/*
|>Objetivos: Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha incorreta informada, escrever 
a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Consi-
dere que a senha correta � o valor 2002.
....................................................................................................................................................   
  
   Condi��es:
   
   1)- A entrada � composta por v�rios casos de testes contendo valores inteiros.
  
   2)- Para cada valor lido mostre a mensagem correspondente � descri��o do problema.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
		  |	2200 				|	Senha Invalida       |
		  | 1020 				|	Senha Invalida		 |
		  |	2022 				|	Senha Invalida		 |
		  |	2002 				|	Acesso Permitido     |     
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1114_Senha_Fixa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
     
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1) Leia um inteiro Senha e analise se ele � a senha 2002, caso sim, imprim "Acesso Permitido", caso n�o imprima "Senha Invalida"
		int senha = entrada.nextInt(),
			verificador = 0;
		
		while(verificador == 0) {
			if(senha == 2002) {
				System.out.println("Acesso Permitido");
				verificador = 1;
			}else {
				System.out.println("Senha Invalida");
			}
			senha = entrada.nextInt();
		}
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

