#include <iostream>
using namespace std;

int search(int array[], int n, int x)
{
   int pos;
  for (int i = 0; i < n; i++)
   {
    if (array[i] == x)
     {
	   pos=i;
	   break;
     }
    pos=-1;
   }
   return pos;
}

int main() 
{
  int n,x,c;
  cout<<"Enter size of array\n";
  cin>>n;
  int array[n];
  cout<<"Enter elements \n";
  for (c = 0; c < n; c++)
  {
  cin>>array[c];
  }
  cout<<"Enter element to be searched \n";
  cin>>x;
  int result = search(array, n, x);
  if(result == -1) 
  { 
  cout << "Element not found" ;
  }
  else
  {
  cout << "Element found at index: " << result;
  }
  return 0;
}
