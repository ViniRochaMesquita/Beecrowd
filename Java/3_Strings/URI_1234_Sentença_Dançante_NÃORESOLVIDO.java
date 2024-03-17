/*
|>Objetivos:  

	Uma senten�a � chamada de dan�ante se sua primeira letra for mai�scula e cada letra subsequente for o oposto da letra anterior. Espa�os devem 
ser ignorados ao determinar o case (min�sculo/mai�sculo) de uma letra. Por exemplo, "A b Cd" � uma senten�a dan�ante porque a primeira letra ('A')
� mai�scula, a pr�xima letra ('b') � min�scula, a pr�xima letra ('C') � mai�scula, e a pr�xima letra ('d') � min�scula.

....................................................................................................................................................
  
   Condi��es:
   
   1)-A entrada cont�m v�rios casos de teste. Cada caso de teste � composto por uma linha que cont�m uma senten�a, que � uma string que cont�m entre
   1 e 50 caracteres ('A'-'Z','a'-'z' ou espa�o ' '), inclusive, ou no m�nimo uma letra ('A'-'Z','a'-'z').
   
   2)-Transforme a senten�a de entrada em uma senten�a dan�ante (conforme o exemplo abaixo) trocando as letras para min�scula ou mai�scula onde for
   necess�rio. Todos os espa�os da senten�a original dever�o ser preservados, ou seja, " sentence " dever� ser convertido para " SeNtEnCe ".
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
   
   .................................................................................................................................................   
           __________________________________________________________________________
          |           Exemplo de Entrada  	        |    Exemplos de Sa�da   		 |
          |	This is a dancing sentence  			|	ThIs Is A dAnCiNg SeNtEnCe	 |
  		  |	This   is         a  dancing   			|	ThIs   Is         A  dAnCiNg |
  		  |	sentence								| 	SeNtEnCe 					 |
		  |	aaaaaaaaaaa								| 	AaAaAaAaAaA	 				 |
		  |	z										|	Z							 |
          |-----------------------------------------|--------------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.io.BufferedReader;
import java.io.IOException;		                                  //NEW
import java.io.InputStreamReader;

public class URI_1234_Senten�a_Dan�ante_N�ORESOLVIDO {

	public static void main(String[] args) throws IOException{
		
		
		//Classes nativas do Java para entrada de dados      
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader    entrada  = new BufferedReader(in);		  
        
		String sentenca = entrada.readLine();                        
		String sentDanc = "";
		String AUX      = "";
	    //Quando "sentenca == null", significa o fim de entrada;	
		
		while(sentenca != null) {
			
//Objetivo 1 ---------------------------------------------------------------------------------------------------------------------------------------
//1)- Leia uma string;			
			sentenca = entrada.readLine();         

//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------------
//2)- Transforme a senten�a de entrada em uma senten�a dan�ant trocando as letras para min�scula ou mai�scula onde for necess�rio. Todos os espa�os 
//da senten�a original dever�o ser preservados, ou seja, " sentence " dever� ser convertido para " SeNtEnCe ".			
			
			//2.1)- Percorra a String senten�a:
			for(int i=1; i<sentenca.length(); i++) {
				
				//2.2)- Declare um booleano use ele da seguinte forma: verdadeiro para maiusculo e falso para minusculo;
				boolean verificador = true;
				
				if(sentenca.charAt(i-1) >= 65 && sentenca.charAt(i-1) <=90 && verificador == false){    //Valores da tabela ASCII
					verificador = true;
						   AUX = sentenca.substring(i,i+1);
						   AUX = AUX.toLowerCase();
					sentDanc = sentDanc + AUX;
				
				}else if(sentenca.charAt(i) >= 97 && sentenca.charAt(i) <=122 && verificador == true) {
					verificador = false;
						   AUX = sentenca.substring(i,i+1);
						   AUX = AUX.toUpperCase();
					sentDanc = sentDanc + AUX;
				}else {
						sentDanc = sentDanc + sentenca.substring(i,i+1);
				}				
			}			
			
			System.out.println(sentDanc);			

		}
	
		in.close();
	}
}


