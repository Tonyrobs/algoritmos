#include <iostream>
using namespace std;

int main()
{
    int a=0, b=0, temp=0;
    
        cout<<"Substituição de valores\n";
        cout<<"Insira o número A: ";
        cin>>a;
        cout<<"Insira o número B: ";
        cin>>b;
        temp=a;
        a=b;
        b=temp;
        cout<<"Após a substituição, o valor A é: "<< b<< " e o valor B é: "<<a;
}
