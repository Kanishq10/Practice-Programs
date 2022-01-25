
#include <iostream>

using namespace std;

int main()
{
    int arr[5]={1,3,4,5};
    int *ptr=arr;
    cout<<ptr[2]<<" "<<arr[2]<<endl;
    cout<<*(ptr+2)<<" "<<*(arr+2);
    return 0;
}
