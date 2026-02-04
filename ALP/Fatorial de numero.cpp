#include <iostream>
using namespace std;

int main()
{
    int n=1, cont=1, fat=1;
    
    cout<<"Fatorial de inteiro";
    cout<<"\nDigite um numero: ";
    cin>>n;
    while(n>=cont)
    {
        fat *= cont;
        cont++;
    }
    cout<<"\nO fatorial é "<<fat;
}
