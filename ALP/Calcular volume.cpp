#include <iostream>
using namespace std;

int main()
{
    float raio=0, altura=0;
    
        cout<<"Calcular volume de lata\n";
        cout<<"Insira o raio da lata: ";
        cin>>raio;
        cout<<"Insira a altura da lata: ";
        cin>>altura;
        cout<<"O volume da lata é: "<< 3.14159*raio*raio*altura;
}
