/*|>Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre elas e atribua � vari�vel SOMA.
A seguir escrever o valor desta vari�vel.
   
  Condi��es:
  1)- O arquivo de entrada cont�m 2 valores inteiro;
  
  2)- Imprima a mensagem "SOMA" com todas as letras mai�sculas, com um espa�o em branco antes e depois da igualdade seguido 
  pelo valor correspondente � soma de A e B. 

  3)- Como todos os problemas, n�o esque�a de imprimir o fim de linha ap�s o resultado, 
  caso contr�rio, voc� receber� "Presentation Error".

          | Exemplos de Entrada | Exemplos de Sa�da |
          |        30                               |
          |        10           |    SOMA = 40      |
          |-----------------------------------------|                
          |       -30                               |
          |        10           |    SOMA =-20      | 
          |-----------------------------------------|
          |         0                               |
          |         0           |    SOMA = 0       |
          |-----------------------------------------|


___________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante; //Declara��o de Pacote

import java.util.Scanner; //Invoca��o da clase Scanner

public class URI_1003_Soma_SImples { //Declara��o da Classe "SomaSimples"

	public static void main(String[] args) { //Inicio do M�todo Principal
		
		int A; //Declara��o da vari�vel "A" do tipo Inteiro(Int);
		int B; //Declara��o da vari�vel "B" do tipo Inteiro(Int);
		
	  //Scanner nomePersonalizado� = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);

      //Variavel = nomePersonalizado�.next-Tipo_de_dado_da_entrada-();
		A = entrada.nextInt();
		B= entrada.nextInt();
		
		int SOMA; 
		
		SOMA = A + B ;
		
		System.out.println("SOMA = "+ SOMA);
		
		entrada.close();

	}

}
