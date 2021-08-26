#include<iostream>
using namespace std;
int main()
{
    int N,i;
    cout<<"Aditya Narayan Sharma\n";
    cout<<"UID:20BCS1460 CLASS-4A\n";
    cout<<"Enter size of the array\n";
    cin>>N;
    int arr[N];
    cout<<"Enter elements of the array\n";
    for(i=0;i< N;i++)
    {
    	cin>>arr[i];
	}  
    cout<<"Array: ";
    for (i = 0; i < N; i++)
	{
        cout<<" "<<arr[i];
    }
    cout<<"\n";
    return 0;
}
