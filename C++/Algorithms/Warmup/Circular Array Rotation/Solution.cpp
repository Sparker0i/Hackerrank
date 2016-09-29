#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int N , K , Q;
    cin >> N >> K >> Q;
    int rot = K % N;
    int arr[N];

    for(int i=0; i<N; i++)
        cin >> arr[i];

   for(int i=0;i<Q;i++)
   {
           int idx;
           cin >> idx;
           if(idx - rot >= 0)
                cout << arr[idx-rot] << "\n";
           else
                cout << arr[idx - rot + N] << "\n";
    }
    return 0;
}
