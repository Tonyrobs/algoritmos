#include <iostream>
using namespace std;

int main()
{
  int id=0;
  
    cout<<"Calcular idade pelos dias \n";
    cout<<"Insira sua idade pelos dias: ";
    cin>>id;
    cout<<"Você tem: "<<id/365<<" anos, "<< (id%365)/30<<" meses e "<<(id%365)%30<< " dias";
    
}