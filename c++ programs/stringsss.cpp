#include<iostream>
#include<iomanip>
using namespace std;
int main(){
    string x="Hello";
    cout<<x<<endl<<x.length()<<endl<<x[2]<<endl;
    x[2]='6'; //important strings are mutable in cpp
    cout<<x<<endl<<sizeof(x)<<endl;
    x=x+" Academy Academy";
    cout<<x.find("Academ")<<endl<<x.find("Academ",7)<<endl;
    cout<<x.substr(1,5)<<endl;
    string sub=x.substr(4,9);
    cout<<sub<<endl<<sub.capacity()<<" "<<sub.length()<<endl;
    string s;
    getline(cin,s);
    cout<<s;
    return 0;
    }