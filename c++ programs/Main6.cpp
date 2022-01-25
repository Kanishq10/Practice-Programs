/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include<bits/stdc++.h>

using namespace std;

int main()
{
    vector<int> vec {10,20,30,40,50,60};
    vector<int> vec2(vec.begin(),vec.end());
    for(auto i:vec2){
        cout<<i<<endl;
    }
    vector<int> v3(vec2);
    for(auto i:v3){
        cout<<i<<endl;
    }
    return 0;
}
