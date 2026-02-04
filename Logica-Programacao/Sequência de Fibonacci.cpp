#include <iostream>
using namespace std;

int main()
{
    int n1=1, n2=1, antig=0, qnt=0, i=3 ;
    cout<<"Sequencia de Fibonacci\n";
    cout<<"Digite numero: ";
    cin>>qnt;
    if(qnt>=3)
    {
         while(qnt>=i)
        {
            antig=n2;
            //Preservamos o valor de n2 antes da mudança
            n2+=n1;
            //n2 somará com n1 para conseguirmos o termo
            n1=antig;
            //n1 receberá o valor preservado para a próxima repetição
            i++;
        }
    }
    else
    {
       cout<<"Quantidade necessita ser maior que 3";
    }
    
    cout<<"Valor do termo: "<<n2;
}
