#include <iostream>
using namespace std;

int main() {
  int L=0,D=0,K=0,P=0,quantos_pedagios=0,total=0;
  
  //L = Tamanho da estrada;
  //D = Distancia entres os pedagios;
  //K = Preço da gasolina por KM;
  //P = Preço de cada pedágio;
  
  cin >> L >> D >> K >> P;

  //Primeiro descubra quantos pedagios tem em uma estrada de tamanho L com espaço D entre cada um;
  quantos_pedagios = L/D;
  
  //(L*K) é quanto será gasto na estrada inteira;
  //(quantos_pedagios * P) quanto será gasto com todos os pedagios;
  total = (L*K) + (quantos_pedagios * P);
  
  cout << total << endl;
  return 0;
}