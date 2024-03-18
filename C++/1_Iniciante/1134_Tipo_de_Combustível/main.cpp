#include <bits/stdc++.h>
using namespace std;


int main() {

    int A=0,G=0,D=0,tipo=0;
    
    while( cin >> tipo && tipo!= 4){
        if(tipo==1)A++;
        if(tipo==2)G++;
        if(tipo==3)D++;
    }
    
    cout << "MUITO OBRIGADO\n"
            "Alcool: "   << A << endl <<
            "Gasolina: " << G << endl <<
            "Diesel: "   << D << endl;

  return 0;
}