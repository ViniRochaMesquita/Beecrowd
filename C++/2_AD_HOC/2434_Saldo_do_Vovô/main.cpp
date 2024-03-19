#include <bits/stdc++.h>
using namespace std;


int main() {
    // N: Múmero de dias do periodo de interesse
    // S: Saldo da conta no inicio do periodo
    int N=0, S=0, mov=0,menor=0;
    cin >> N >> S;
    cin >> mov;
    S += mov;
    menor = S;
    
    //Cada uma das N linhas seguintes contém um número inteiro indicando a movimentação de um dia
    for(int i=0; i<N-1; i++){
        cin >> mov;
        S += mov;
        if(S<menor) menor = S;
    }

    cout << menor << endl;
  return 0;
}