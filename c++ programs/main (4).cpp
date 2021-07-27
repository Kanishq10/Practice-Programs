

#include <iostream>

using namespace std;
void reduce(int *,int);//prototype it necessary because function is written after main
int main()
{
    int a=10,b=20;
    reduce(&a,b);
    cout<<a<<" "<<b;
    return 0;
}
void reduce(int *p1,int p2){ //call by reference
    *p1-=2;
    p2-=5;
}