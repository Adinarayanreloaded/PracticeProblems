#include <iostream>
using namespace std;
int main()
{
   int array[100], K, i, N, value;
   cout<<"Enter number of elements in array\n";
   cin>>N;
 
   cout<<"Enter elements\n";
 
   for (i = 0; i < N; i++)
        cin>>array[i];
 
   cout<<"Enter the location where you wish to insert an element\n";
       cin>>K;
 
   cout<<"Enter the value to insert\n";
       cin>>value;
 
   for (i = N - 1; i >= K - 1; i--)
      array[i+1] = array[i];
 
   array[K] = value;
 
   cout<<"Resultant array is\n";
 
   for (i = 0; i <= N; i++)
      cout<<" "<<array[i];
 
   return 0;
}

