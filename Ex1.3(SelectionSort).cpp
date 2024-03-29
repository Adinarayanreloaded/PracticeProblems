#include <iostream>
using namespace std;

void selectionSort(int arr[],int n) {
  for (int i = 0; i < n; i++) {
    int min = i;

    for (int j = i + 1; j < n; j++) {
      if (arr[j] < arr[min]) {
        min = j;
      }
    }
    if (min != i) {
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }
}

int main() {

  int n;
  cout<<"Enter number of integers you want to sort\n";
  cin>>n;
  int myarr[n];
  cout << "Enter n integers in random order: " << endl;
  for (int i = 0; i < n; i++) {
    cin >> myarr[i];
  }

  cout << "UNSORTED ARRAY: " << endl;
  for (int i = 0; i < n; i++) {
    cout << myarr[i] << "  ";
  }
  cout << endl;

  selectionSort(myarr,n); // sorting actually happening

  cout << "SORTED ARRAY: " << endl;
  for (int i = 0; i < n; i++) {
    cout << myarr[i] << "  ";
  }
  return 0;
}
