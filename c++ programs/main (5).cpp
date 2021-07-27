

#include <iostream>

using namespace std;

int main()
{   int x=12,y=45;
    const int *ptr=&x;
    int* const ptr2=&y;
    // *ptr=67;//not valid 
    ptr=&y; //valid
    *ptr2=200; //valid
    // ptr2=&x;//not valid
    cout<<ptr<<" "<<ptr2<<endl;
    cout<<*ptr<<" "<<*ptr2;
    return 0;
}
