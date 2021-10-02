#include<iostream>
#include<iomanip>
#include<cmath>

using namespace std;
int main(){
    cout<<int(log10(12345)+1)<<endl<<int(log(12345))<<endl;
    cout<<pow(3,4)<<endl<<sqrt(25)<<endl<<round(2.3436575)<<endl<<fmax(34.5,12.4)<<endl<<fmin(12,54)<<endl;
    double f=1.545454454656465423334;
    cout<<setprecision(3)<<f<<"\n";
    cout<<setprecision(10)<<(double)0.1+0.2; //check its value  for bigger precision
    return 0;
}