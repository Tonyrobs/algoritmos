#include <iostream>
using namespace std;

int soma(int n, int x, int i);

int main()
{
	int n=0, x=0, i=1;
	cout<<"Sim\n";
	cout<<"Digite numero: ";
	cin>>n;
	cout<<"Digite num de incrementos: ";
	cin>>x;
	cout<<"Soma: "<<soma(n, x, 0);
}

int soma(int n, int x, int i=1)
{
	if(x>i)
	{
		return n+soma(n, x, i+1);
	}
	else
	{
		return 0;
	}
}
