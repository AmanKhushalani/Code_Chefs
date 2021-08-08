#include <iostream>
using namespace std;

int main() {
    int testCase;
    cin>>testCase;
    while(testCase>0)
    {
        long int num;
        cin>>num;
        int answer=1;
        while(num>0)
        {
            answer*=num;
            num--;
        }
        cout<<answer<<endl;
        testCase--;
    }

}

