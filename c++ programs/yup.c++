#include <iostream>
#include <string>
using namespace std;
class X{
    public:
    int a,b;
    string c;
    void print(){
        cout<<a<<" "<<b<<" "<<c;
    }
};

int main(){
    X f;
    f.print();
    return 0;
}