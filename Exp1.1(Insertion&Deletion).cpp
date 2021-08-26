#include <iostream>
using namespace std;
int main()
{
    int array[100], choice, i, N;
    cout<<"Aditya Narayan Sharma\n";
    cout<<"UID:20BCS1460 CLASS-4A\n";
    cout<<"Enter number of elements in array\n";
    cin>>N;
    cout<<"Enter elements\n";
    for (i = 0; i < N; i++)
        cin>>array[i];
    cout<<"Enter choice 1 for insertion or 2 for deletion\n";
    cin>>choice;
	switch(choice)
	{
	
   	case 1:
   	int c,value,K1;	
    cout<<"Enter the location where you wish to insert an element\n";
       cin>>K1;
 
    cout<<"Enter the value to insert\n";
       cin>>value;
 
    for (c = N-1 ; c >= K1 - 1; c--)
      array[c+1] = array[c];
 
    array[K1-1] = value;
 
    cout<<"Resultant array is\n";
 
    for (c = 0; c <= N; c++)
      cout<<" "<<array[c];
    break;
    case 2:
    int m,K2;
    cout<<"Enter the location where you wish to delete element\n";
      cin>>K2;

    if (K2 >= N+1)
      cout<<"Deletion not possible\n";
    else
    {
      for (m= K2 - 1; m < N - 1; m++)
         array[m] = array[m+1];

      cout<<"Resultant array:\n";

      for (m = 0; m < N - 1; m++)
         cout<<" "<<array[m];
    }
	 break;
	default: cout<<"Wrong choice"; 
   }
    return 0;
}
