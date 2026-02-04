#include <iostream>
using namespace std;

int main()
{
    float x=0, y=0, z=0;
    cout<<"Informar tipo de triangulo\n";
    cout<<"Insira primeiro valor: ";
    cin>>x;
    cout<<"Insira segundo valor: ";
    cin>>y;
    cout<<"Insira terceiro valor: ";
    cin>>z;
    if ((x==y) || (x==z) || (y==z))
    {
        if ((x==y) && (x==z))
        {
            cout<<"Equilátero";
        }
        else
        {
            cout<<"Isósceles";
        }
    }
    else if((x!=y) && (x!=z) && (y!=z))
    {
        cout<<"Escaleno";
    }
    else
    {
        cout<<"Valores incorretos";
    }
}
