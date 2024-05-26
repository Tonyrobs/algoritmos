#include <iostream>
using namespace std;

int soma(int n, int x)
{
	if(n<=x)
	{
		return n+soma(n+1, x);
	}
	else
	{
		return 0;
	}
}

int main()
{
	int num=0;
	
	cout<<"Digite numero: ";
	cin>>num;
	cout<<"Soma: "<<soma(0,num);
}
