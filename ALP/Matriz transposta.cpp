#include <iostream>
using namespace std;

int main()
{
	int A [3][3], B[3][3], n=0, l=0, c=0;
	
	cout<<"Digite a matriz: ";
	for(l=0; l<=2; l++)
	{
		for(c=0; c<=2; c++)
		{
			A[l][c]=0;
		}
	}
	
	for(l=0; l<=2; l++)
	{
		for(c=0; c<=2; c++)
		{
			cin>>n;
			A[l][c]=n;
			B[c][l]=A[l][c];
		}
	}
		cout<<"\nMatriz A: \n";
	for(l=0; l<=2; l++) //visualizar a matriz A
	{
		for(c=0; c<=2; c++)
		{
			cout<<A[l][c]<<" ";
		}
		cout<<"\n";
	}
	cout<<"\nMatriz B: \n";
	for(l=0; l<=2; l++) //visualizar a matriz B
	{x
		for(c=0; c<=2; c++)
		{
			cout<<B[l][c]<<" ";
		}
		cout<<"\n";
	}
}
