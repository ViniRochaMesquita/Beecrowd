/*
|>Objetivos:  
	C�sar � um detetive que investiga uma s�rie de roubos que acontecem em sua cidade. Em todo lugar que um crime acontece, a pessoa que cometeu tal
crime deixa uma mensagem escrita, formada por letras mai�sculas e min�sculas. C�sar conseguiu achar um padr�o nestas mensagens e agora extrai um tex-
to oculto em cada mensagem e pede a sua ajuda para tentar descobrir quem est� cometendo tais crimes.

....................................................................................................................................................   
  
   Condi��es:
   
   1)- A entrada � composta por v�rios casos de teste. A primeira linha cont�m um n�mero inteiro C (2 <= C <= 99) relativo ao n�mero de casos de tes-
   te. Nas C linhas seguintes, haver� mensagens codificadas, todas com um mesmo padr�o em rela��o ao exemplo abaixo.
   
   2)- Para cada caso de teste de entrada do seu programa, voc� deve imprimir o texto extra�do da mensagem original.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Sa�da   |
		  |3					|	      sapo			 |
          |NoTApasCAL			|	      batata		 |
          |atEQUEatabELATERMINE	|	      arroz          |
          |zoEIrrRRRRa			|						 |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.util.Scanner;

public class URI_2866_Criptotexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um n�mero inteiro C (2 <= C <= 99) relativo ao n�mero de casos de teste; 			
		int C = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Nas C linhas seguintes, haver� mensagens codificadas, todas com um mesmo padr�: letras minusculas de tr�s para frente;
		for(int i=0; i<C; i++) {
			
			String msgCode = entrada.next();							//Isso l� um c�digo pra ser decodificado
			
			//2.1)- Colete apenas as letras maiusculas e guarde numa string
			String invertMin = "";										//Essa String armazena apenas as letras minusculas da string "msgCode"
			
			for(int j=0; j<msgCode.length(); j++) {
				
				if(msgCode.charAt(j) >= 97 && msgCode.charAt(j)<=122) { //Valores da tabela ASCII para letras minusculas;
					
					invertMin = invertMin + msgCode.charAt(j);			//Isso contatena todas as letras minusculas em uma string;
					
				} 		
	
			}
			//2.2)- Guarde a string onde est�o as letras minusculas em um vetor e imprima esse vetor de forma inversa;
			char minDecod[] = new char[invertMin.length()];				
			
			for(int k=invertMin.length()-1; k>=0; k--) {
				minDecod[k] = invertMin.charAt(k);
				System.out.print(minDecod[k]);
			}
			System.out.println();										 //Isso � para que cada codigo decodificado apare�a em uma linha;
		}
			
//----------------------------------------------------------------------------------------------------------------------------------------	
//System.out.println("" + saidaFormatada.format();
		entrada.close();
		   		
	}
}

