#include <iostream>
using namespace std;

int main()
{
	int num[5], n=0;
	cout<<"Insira numero: ";
	
	for(n=0; n<=4; n++)
	{
		num[n]=0;
	}
	for(n=0; n<=4; n++)
	{
		cin>>num[n];
	}
	for(n=0; n<=4; n++)
	{
		cout<<num[n]<<" ";
	}
  
}
