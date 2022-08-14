
#include <iostream>

using namespace std;

int main()
{
    int val=12;
    int *ptr=&val;
    int **pptr=&ptr;
    cout<<val<<"\t"<<*ptr<<"\t"<<**pptr<<"\n";
    cout<<ptr<<"\t"<<pptr<<endl;
    cout<<*pptr<<endl;
    cout<<&ptr<<"\t"<<&pptr;
    int x=5;
    int y=10;
    int *p=&x;
    cout<<*(p+1);
    cout<<p[2];
}
