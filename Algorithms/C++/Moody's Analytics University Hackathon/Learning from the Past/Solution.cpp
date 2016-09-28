#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int N , i = 0;
    cin >> N;
    int max = 0;
    while (++i <= N) {
        int x , y , z;
        cin >> x >> y >> z;
        int a[3] = {x + y , x + z , y + z};
        int temp = a[0];       // start with max = first element
        for(int j = 0; j < 3; j++)
        {
             if(a[j] > temp)
                   temp = a[j];
        }
        if (temp >= max)
            max = temp;
    }
    cout << max << "\n";
    return 0;
}
