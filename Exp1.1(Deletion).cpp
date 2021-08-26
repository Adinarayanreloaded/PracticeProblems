#include <iostream>
using namespace std;
int main()
{
   int array[100], K, i, N;

   cout<<"Enter number of elements in array\n";
   cin>>N;

   cout<<"Enter elements \n";

   for (i = 0; i < N; i++)
      cin>>array[i];

   cout<<"Enter the location where you wish to delete element\n";
      cin>>K;

   if (K >= N+1)
      cout<<"Deletion not possible\n";
   else
   {
      for (i = K - 1; i < N - 1; i++)
         array[i] = array[i+1];

      cout<<"Resultant array:\n";

      for (i = 0; i < N - 1; i++)
         cout<<" "<<array[i];
   }

   return 0;
}

