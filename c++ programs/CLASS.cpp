#include<iostream>
using namespace std;
class book{
    private:
    int vipno;
    public:
    string title;
    string author;
    int pages;
    book(){
        pages=5;
    }
    book(int page){
        pages=page;
    }
    void setNo(int x){
        int vipno=x;
    }

    int get(){
        return vipno;
    }
};
int main(){
    book b1;  //this is initialised static
    b1.title="harry potter";
    b1.author="Jk Rowling";
    b1.pages=10;
    cout<<b1.title<<" "<<b1.author<<" "<<b1.pages<<endl;
    return 0;
    book b2(23);  //this is initialised static
    b2.title="goblin";
    b2.author="gooby";
    // b1.pages=10;
    cout<<b2.title<<" "<<b2.author<<" "<<b2.pages;
    return 0;
}