#include <iostream>
using namespace std;

int main() {
  // P:Altura do pulo do Sapo;
  // N:Número de canos;
  int P=0, N=0,altura=0,cano_N=0,ganhou=1;
  
  cin >> P >> N;
  //Leitura do primeiro cano
  cin >> cano_N;
  altura = cano_N;
  
  for(int i=0; i<N-1; i++){
      if(ganhou)cin >> cano_N;
      //Não existe distância negativa
      if(abs(cano_N-altura)> P)ganhou = 0;
      else altura = cano_N;
  }
  if(ganhou) cout << "YOU WIN" << endl;
  else cout << "GAME OVER" << endl;
  
  return 0;
}