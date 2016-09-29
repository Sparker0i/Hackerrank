#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    long int n , T;
    cin >> T;
    int count = 1;
    for (int i = 0; i < T; ++i) {
        cin >> n;
        long int div_3 = (n - 1) / 3 ,
            div_5 = (n - 1) / 5 ,
            div_15 = (n - 1) / 15;

        cout << 3 * (div_3 * (div_3 + 1)) / 2 + 5 * (div_5 * (div_5 + 1)/ 2) - 15 * (div_15 * (div_15 + 1))/ 2 << "\n";
    }
    return 0;
}
