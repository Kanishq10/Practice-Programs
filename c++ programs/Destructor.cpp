#include <iostream>
using namespace std;
class A{
    public:
    int *a=new int[5];
    void accept(){
        for (int i=0;i<5;i++){
            cin>>a[i];
        }        
    }
    void display(){
        for(int i=0;i<5;i++){
            cout<<a[i]<<" ";
        }
        cout<<endl;
    }
    ~A(){
        delete[] a; //deleting a
        cout<<"This will execute at last and destruct a";
    }
};
int main(){
    A *obj=new A();
    obj->accept();
    obj->display();
    delete obj; //deleting obj
}