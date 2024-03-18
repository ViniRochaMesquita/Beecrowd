#include <iostream>
using namespace std;

int main() {
  //V: Valor da Compra;
  //P: Número de parcelas;
  int V=0, P=0, resto=0, parcela=0,limite=0;
  cin >> V >> P;

  resto = V%P;
  parcela = V/P;

  if(resto > 0){
    limite = resto;
    parcela ++;
  }else{
      limite = P;
  }
  
  for(int i=0; i<limite;i++){
      cout << parcela << endl;
  }
  
  if(resto > 0){
      for(int i=0; i<(P-resto);i++){
          cout << parcela-1 << endl;
      }
  }

  return 0;
}