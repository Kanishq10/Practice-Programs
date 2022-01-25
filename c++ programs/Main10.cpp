/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
class student{
    int rollno;
    float cgpa;
    public:
    student();
    void get();
    void display();
};

 student::student(){
    cin>>rollno>>cgpa;
}

void student::display(){
    if(cgpa>=8){
    cout<<rollno<<" "<<cgpa<<endl;
    }
    else{cout<<"Not Eleigible"<<endl;}
}

int main()
{
    student s1,s2,s3;
    
    s1.display();
    
    s2.display();
    
    s3.display();
    return 0;
}
