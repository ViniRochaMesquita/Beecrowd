#include <bits/stdc++.h>
using namespace std;

int main() {

    int X=0,Z=0,qntd=0,soma=0;
    
    cin >> X >> Z;
    
    while(Z<=X) cin >> Z;
    
    //Some X com X+i até que X>Z
    qntd  = 2;
    soma = X;
    
    for(int i=0; i<Z; i++){
        soma += X+i;
        if(soma > Z) break;
        else qntd +=1;
    }

    cout << qntd << endl;
    
   
  return 0;
}