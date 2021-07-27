

#include <iostream>

using namespace std;

int main()
{
    int a=10;
    int *p1=&a;
    ++*p1;
    int b=++*p1;
    int *p2=&b;
    *p1=*p1+*p2;
    cout<<p1<<" "<<p2<<endl;
    p1=p2; //important 
    cout<<p1<<" "<<p2<<endl;
    *p2=*p1+*p2;
    cout<<a<<" "<<b;
}
