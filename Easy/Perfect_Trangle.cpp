#include <iostream>
using namespace std;

int main() {
    int teseCase;
    cin>>teseCase;
    while(teseCase>0)
    {
        int a,b,c;
        cin>>a>>b>>c;

        if(a+b+c==180)
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;

        teseCase--;
    }
	return 0;
}

