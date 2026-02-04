#include <iostream>
using namespace std;

int main()
{
	int num=0, cont=1, fat=1;
	cout<<"Fatorial de um numero \n";
	cout<<"Digite numero: ";
	cin>>num;
	while(num<=0 || num>=14 )
	{
		cout<<"Digite outro: ";
		cin>>num;
	}
	while(cont<=num)
	{
		fat*=cont;
		cont++;
	}
	cout<<"O fatorial do numero é: "<<fat;
}
