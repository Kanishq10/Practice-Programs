#include <iostream>
using namespace std;
class Circle{
    float radius;
    public:
    Circle(){
        cin>>radius;
    }
    void display(){
        cout<<radius<<endl;
    }
    void cir(){
        cout<<radius*3.14*2<<endl;
    }
    void area(){
        cout<<3.14*radius*radius<<endl;
    }
};
int main(){
    Circle c1;
    c1.display();
    c1.cir();
    c1.area();
    return 0;
}