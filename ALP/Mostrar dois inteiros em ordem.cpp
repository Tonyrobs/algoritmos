#include <iostream>
using namespace std;
int main()
{
    int n1=0, n2=0;
    cout<<"Mostrar dois inteiros em ordem";
    cout<<"\nInsira o primeiro numero: ";
    cin>>n1;
    cout<<"Insira o segundo numero: ";
    cin>>n2;
    if (n1>n2)
    {
        cout<<"Crescente: "<<n2<<", "<<n1;
        cout<<"\nDecrescente: "<<n1<<", "<<n2;
    }
    else if (n2>n1)
    {
        cout<<"Crescente: "<<n1<<", "<<n2;
        cout<<"\nDecrescente: "<<n2<<", "<<n1;
    }
    else
    {
        cout<<"Numeros iguais";
    }
}
