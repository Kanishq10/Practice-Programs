#include <iostream>
class A{
    int x;
    public:
    // A(int x);x(x){}   //initialiser list
    A(int x){
        this->x=x;
    }
    int getX(){return x;}
};
int main(){
    A x(10);
   std::cout<<x.getX();
}