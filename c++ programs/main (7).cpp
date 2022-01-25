/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        arr[i]=i;
    }
    printf("Size of array is %d \n",int(sizeof(arr)/sizeof(int)));
    printf("ele %d",arr[2]);
    return 0;
}
