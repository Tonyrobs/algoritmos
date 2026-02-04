#include <iostream>
using namespace std;

int pares(int n, int x)
{
	if (n<=x)
	{
		return n+pares(n+2, x);
	}
	else
	{
		return 0;
	}
}

int main()
{
	int x;
	cout<<"Digite um numero ";
	cin>>x;
	cout<<"Soma dos pares = "<<pares(0,x);
}
