#include <iostream>
using namespace std;

int main() {
    int testCase;
    cin>>testCase;
    while(testCase>0)
    {
        long int num;
        cin>>num;
        int a=num%10;
        while(num>9)num/=10;
        cout<<a+num<<endl;
        testCase--;
    }

}
