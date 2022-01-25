/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

void f(int &a,int& b){
    int temp=a;
    a=b;
    b=temp;
}
int main()
{
    int a=10,b=20;
    cout<<a<<" "<<b<<endl;
    f(a,b);
    cout<<a<<" "<<b<<endl;
    return 0;
}
