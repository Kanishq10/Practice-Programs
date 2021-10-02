#include<iostream>
using namespace std;
int main(){
    int arr[5]={1,6,7,4,7};
    int n;
    cin>>n;
    int a[n]; //is it dynamic
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
    cout<<arr[2]<<endl<<sizeof(arr)/sizeof(arr[0]);
    return 0;
}