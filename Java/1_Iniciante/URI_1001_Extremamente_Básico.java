/*
|>Leia 2 valores inteiros e armazene-os nas vari�veis A e B. Efetue a soma de A e B atribuindo o seu resultado na vari�vel X. 
Imprima X conforme exemplo apresentado abaixo. N�o apresente mensagem alguma al�m daquilo que est� sendo especificado e n�o 
de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error";

Condi��es:

  1)-A entrada cont�m 2 valores inteiros;
  
  2)-Imprima a mensagem "X = " (letra X mai�scula) seguido pelo valor da vari�vel X e pelo final de linha. Cuide para que tenha 
  um espa�o antes e depois do sinal de igualdade, conforme o exemplo abaixo.
  
                                                       X = 19

---------------------------------------------------------------------------------------------------------------------------------
*/
package URI_1_Iniciante;  //Declara��o de Pacote

import java.util.Scanner;  //Invoca��o da Classe Sccaner

public class URI_1001_Extremamente_B�sico {   //Declara��o de Classe

		public static void main(String[] args) {   //Inicio do M�todo Principal

		  //Scanner NomePersonalizado� = new Scanner(System.in);
			Scanner entrada = new Scanner(System.in);
			
			int A; //Declara��o de variavel do tipo inteiro(int)
			int B; //Declara��o de variavel do tipo inteiro(int)
		
	      //Variavel = nomePersonalizado�.nextTipodaEntrada();
			A = entrada.nextInt();//Isso atribui o prox. valor de entrada para a variavel A
            B = entrada.nextInt();//Isso atribui o prox. valor de entrada para a variavel A

            int X; 
            
            X = A + B;
            
            System.out.println("X = "+X);
            
            entrada.close();//finaliza o uso do Scanner
	}  //Fim do M�todo Principal

}   //Fim da Classe SomaInt
