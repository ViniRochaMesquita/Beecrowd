#include <bits/stdc++.h>
using namespace std;

typedef struct {
  int x1;
  int y1;
  int x2;
  int y2;

} Retangulo;

int main() {

  // Retangulo 1
  Retangulo retg1;
  // Retangulo 2
  Retangulo retg2;

  // Leitura do Retangulo 1
  cin >> retg1.x1 >> retg1.y1 >> retg1.x2 >> retg1.y2;
  // Leitura do rentangulo 2
  cin >> retg2.x1 >> retg2.y1 >> retg2.x2 >> retg2.y2;

  if(retg1.x1 > retg2.x2 || retg1.x2 < retg2.x1 || retg1.y1 > retg2.y2 || retg1.y2 < retg2.y1) {
    cout << "0" << endl;
  } else cout << "1" << endl;

  return 0;
}