
#include <iostream>
#include <iomanip>

using namespace std;
int main() {
    int a;
    double b,c;
    cin>>a>>b;
    if((b>=(a + 0.50)) && ( a % 5 == 0)){
        c=b-(a + 0.50);
        cout << fixed << setprecision(2) << c;}
    else
        cout << fixed << setprecision(2) << b;
 
 return 0;
}