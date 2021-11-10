#include<iostream>
using namespace std;

template <class T>
class Array
{
	public:
		T *Arr;
		int Size;
	
		Array(int);
		~Array();
		void Accept();
		void Display();
		T maximum();
};
template <class T>
Array <T> :: Array(int no)
{
	Size = no;
	Arr = new T[Size];
}

template <class T>
Array <T> :: ~Array()
{
	delete []Arr;
}

template <class T>
void Array <T>:: Accept()
{
	int i = 0;
	for (i = 0;i<Size;i++)
	{
		cout<<"Enter a element:"<<(i+1)<<"\n";
		cin>>Arr[i];
	}
}

template <class T>
void Array <T> :: Display()
{
	int i = 0;
	for (i = 0;i<Size;i++)
	{
		cout<<Arr[i]<<"\n";
	}
}

template <class T>
T Array <T> :: maximum()
{
	int i = 0;
	T max = Arr[0];
	for (int i = 1;i<Size;i++)
	{
		if (max < Arr[i])
		{
			max = Arr[i];
		}
	}
	return max;
}


int main()
{
	char Ret = 0;
	Array <char>obj(4);
	obj.Accept();
	obj.Display();
	Ret = obj.maximum();
    
	cout<<"Maximum is:"<<Ret<<"\n";
    return 0;
}
