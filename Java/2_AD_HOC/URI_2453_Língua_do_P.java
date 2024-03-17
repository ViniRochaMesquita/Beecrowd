/*
|>Objetivos: 
	Uma brincadeira que crian�as adoram � se comunicar na l�ngua do P, acrescentando p� antes de cada s�laba, como uma forma de c�digo para dificul-
tar que outras pessoas entendam a conversa (p�-va p�-mos p�-no p�-ci p�-ne p�-ma?).

	Jacy e K�tia adaptaram a l�ngua do P para mensagens eletr�nicas, acrescentando a letra P min�scula �p� antes de cada letra das palavras de uma 
mensagem. Um exemplo de mensagem codificada e a respectiva mensagem decodificada � mostrada na figura abaixo.

			|		Mensagem Codificada		|	Mensagem decodificada	|		 
			|  pVpapmpops papo pcpipnpepmpa |	   Vamos ao cinema 	    |
....................................................................................................................................................   
  
   Condi��es:
   
   1)- A entrada consiste de uma �nica linha, contendo uma mensagem escrita na l�ngua do P eletr�nica de Jacy e K�tia, a mensagem cont�m apenas le-
   tras mai�sculas e min�sculas e espa�os em branco, a mensagem tem entre 1 e 1000 caracteres, n�o h� dois espa�os em branco consecutivos na mensa-
   gem.
   
   2)- Seu programa deve produzir uma �nica linha, contendo a mensagem decodificada.
   
   3)- N�o esque�a de imprimir o fim de linha ap�s a saida, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.
....................................................................................................................................................   
           ______________________________________________________
          | 	Exemplo de Entrada  	|    Exemplos de Sa�da   |
          |  pUpm pfpiplpmpe plpepgpapl |     Um filme legal	 |
          |  pA pppapppa pdpo pPpapppa  |     A papa do Papa	 |
          |-----------------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;
	
public class URI_2453_L�ngua_do_P {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Declare e leia uma String, essa ser� a mensagem a se codificada;
		String msg = entrada.nextLine();
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Decodifique a mensagem removendo um "p" antes de cada charater;
		
		//2.1)- Declare uma String pra armazenar a nova String Decodificada;
		String msgDecode = "";

		//2.2)- Divida a String codificada em substrings, usando split e espa�o vazio como parametro;
		
		//2.3)- Declare um contador e fa�a com que ele contabilize a quantidade de splits que ser�o gerados;
		int contSplit = 0;
		for(int i=0; i<msg.length(); i++) {
			
			if(msg.charAt(i) == ' ') {
				contSplit++;
			}
		}
		contSplit ++;
		
		//2.5)- Declare um vetor pra armazenar cada split;
		String msgSplit[] =	msg.split(" ");
		boolean primeiro = false; //Se for true o primeiro ja foi impresso
		
		//2.4)- Em cada SubString da mensagem codificada, os "p" adicionais sempre ficaram em uma posi��o par;		 
		for(int j=0; j<contSplit; j++) {
				
			msgDecode = "";
			for(int k=0; k<msgSplit[j].length(); k++) {
				
				if(k%2 == 1) {
					
					msgDecode = msgDecode + msgSplit[j].charAt(k);
									
				}
			}
			
			if(primeiro == false) {
				System.out.print(msgDecode);
				primeiro = true;
			}else {
				System.out.print(" " + msgDecode);
			}

		}	
		System.out.println();
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

