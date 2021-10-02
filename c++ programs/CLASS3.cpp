#include<iostream>
using namespace std;
class chef{
    public:
    void makechicken(){
        cout<<"making chicken"<<endl;
    }
    void makebread(){
        cout<<"making bread"<<endl;
    }
    void specialdish(){
        cout<<"making cake"<<endl;
    }
};
class indianchef:public chef{
    public:
    void makechole(){
        cout<<"making chole"<<endl;
    }
    void specialdish(){
        cout<<"making rajma"<<endl;
    }
};
int main()
{
    chef c;
    indianchef ic;
    c.makebread();
    c.makechicken();
    ic.makechicken();
    ic.makebread();
    ic.makechole();
    c.specialdish();
    ic.specialdish();
    return 0;
}
