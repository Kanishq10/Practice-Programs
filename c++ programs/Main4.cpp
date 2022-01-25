/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <iomanip>

using namespace std;
class mytime{
    int hour,minutes,second;
    public:
    mytime(int h,int m,int s);
    int gethour();
    int getminute();
    int getsecond();
    void settime(int h,int m,int s);
    void print();
    void increment();
};

mytime::mytime(int h,int m,int s){
    hour=h;
    minutes=m;
    second=s;
}

int mytime::gethour(){
    return hour;
}

int mytime::getminute(){
    return minutes;
}
int mytime::getsecond(){
    return second;
}
void mytime::print(){
    cout<<"Time "<<hour<<":"<<minutes<<":"<<second<<endl;
}

void mytime::settime(int h,int m,int s){
        hour=h;
        minutes=m;
        second=s;
    }

void mytime::increment(){
    second++;
    if(second>=60){
        second=0;
        minutes++;
    }
    if(minutes>=60){
        minutes=0;
        hour++;
    }
    if(hour>=25){
        hour=0;
    }
    }
    
int main()
{
    mytime me(3,6,7);
    me.print();
    me.settime(5,54,59);
    me.print();
    me.increment();
    me.print();
    return 0;
}
