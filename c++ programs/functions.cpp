#include<iostream>
using namespace std;
void fun2(int*,int*); //prototpe
void fun1(int a,int b){
    a=122;
    b=334;
}
int max(int a,int b){
    return (a>b)?a:b;
}
int main(){
    int a,b;
    cin>>a>>b;
    fun1(a,b);
    cout<<a<<" "<<b<<endl;
    cout<<max(a,b)<<endl;
    fun2(&a,&b);
    cout<<a<<" "<<b<<endl;
    cout<<max(a,b);
    return 0;
}
void fun2(int *a,int *b){
    *a=65;
    *b=-54;
}