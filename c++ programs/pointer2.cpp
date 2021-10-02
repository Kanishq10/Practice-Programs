#include<iostream>
using namespace std;
int main(){
    int a=67;
    string b="mike";
    cout<<&a<<" "<<&b<<endl;
    int *pa=&a;
    cout<<pa<<" "<<&pa<<" "<<*pa<<" "<<*&pa<<endl;  //*pa derefrencing pointer means grabbing the value from pointer 
    int **x=&pa;
    cout<<x<<" "<<*x<<" "<<**x<<" "<<&x;
    return 0;
}