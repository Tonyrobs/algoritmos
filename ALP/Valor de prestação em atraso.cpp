#include <iostream>
using namespace std;

int main()
{
    float val=0, tempo=0, taxa=0;
    
        cout<<"Calculadora de prestação em atraso\n ";
        cout<<"Insira o valor original da prestação: ";
        cin>>val;
        cout<<"Insira os meses de atraso: ";
        cin>>tempo;
        cout<<"Insira a taxa das prestações: ";
        cin>>taxa;
        cout<<"O valor com atraso será de: "<<val+(val * (taxa/100)*tempo);
}