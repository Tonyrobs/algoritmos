#include <iostream>
#include<iomanip>
using namespace std;

int main()
{
    float mg=0, mp=0, n1=0, n2=0, n3=0, cont=0;
    
    cout<<fixed<<setprecision(2);
    cout<<"Notas de alunos \n" ;
    while (cont<=50)
    {
        cout<<"\nDigite nota 1: ";
        cin>>n1;
        cout<<"Digite nota 2: ";
        cin>>n2;
        cout<<"Digite nota 3: ";
        cin>>n3;
        mp=(n1*2 + n2*4 + n3*3)/9;
        
        if (mp>=7)
        {
            cout<<"\nVocê está aprovado com nota "<<mp<<"\n";
        }
        else
        {
            cout<<"\nVocê está reprovado com nota "<<mp<<"\n";
        }
        mg=mg+mp;
        cont++;
    }
    cout<<"\nMédia da sala foi: "<<mg/50;
}
