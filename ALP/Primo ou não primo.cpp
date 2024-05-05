#include <iostream>
using namespace std;

int main()
{
	int num=0, cont=1, result=0, prim=0;
	cout<<"Mostra primo ou não primo\n ";
	cout<<"Digite numero: ";
	cin>>num;
	while(num>=cont)
	{
		result=num%cont;
		if(result==0)
		{
			prim++;
		}
		cont++;
	}
	if(prim>=3)
	{
		cout<<"Nao primo";
	}
	else
	{
		cout<<"Primo";
	}

}
