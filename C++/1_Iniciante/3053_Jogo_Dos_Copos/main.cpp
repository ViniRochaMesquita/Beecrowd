#include <iostream>
using namespace std;

int main() {
  int N, tipoMov;
  char posicao;
  cin >> N;
  cin >> posicao;

  for (int i = 0; i < N; i++) {
    cin >> tipoMov;
    if(tipoMov == 1){
      if(posicao == 'A')posicao = 'B';
      else if(posicao == 'B')posicao = 'A';
    }
    if(tipoMov == 2){
      if(posicao == 'B') posicao = 'C';
      else if(posicao == 'C') posicao = 'B';
    }
    if(tipoMov == 3){
      if(posicao == 'A') posicao = 'C';
      else if(posicao == 'C') posicao = 'A';
    }
  }
  cout << posicao << endl;
  return 0;
}