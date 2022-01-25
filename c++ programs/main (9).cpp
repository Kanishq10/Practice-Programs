/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int x=10;
    int& ref=x; //refrence variable
    ref=20;
    cout<<"x= "<<x<<endl;
    x=70;
    cout<<"ref= "<<ref;
    return 0;
}
