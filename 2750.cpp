#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    vector<int> N(5);

    for (int i = 0; i < 5; i++){
        cin>>N[i];
    }

    for (int i = 0; i < N.size(); i++){
        int small = i;
        for (int j = i+1; j < N.size(); j++){
            if (N[j] < N[small]) small = j;
        }
        swap(N[i], N[small]);
    }
    int sum = 0;
    for (int i = 0; i<N.size(); i++){
        sum += N[i];
    }
    cout << sum/N.size()<<endl;

    cout << N[2];

        
}
    
