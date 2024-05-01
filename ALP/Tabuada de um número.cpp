#include <iostream>
using namespace std;

int main()
{
	int n=0, mult=0;
	cout<<"Tabuada de um numero\n";
	cout<<"Insira numero: ";
	cin>>n;
	
	for(int cont=1; cont<=10; cont++)
	{
		mult=cont*n;
		cout<<"\n"<<n<<" x "<<cont<<" = "<<mult;
	}
}
