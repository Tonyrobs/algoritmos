#include <iostream>
using namespace std;

int main()
{
    float saldo=0, dol=0;
    
        cout<<"Conversão de moeda americana para brasileira\n ";
        cout<<"Insira seu saldo em dólares: ";
        cin>>saldo;
        cout<<"Insira o valor da cotação atual de dólares para real: ";
        cin>>dol;
        cout<<"Seu saldo em reais é: "<<saldo*dol;
    
}