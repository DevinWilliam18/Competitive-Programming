#include <stdio.h>
#include <iostream>
#include <cmath>
#include <vector>
#include<cstdio>
using namespace std;

int main() {
    int n, q,i,j;
    int angka;
    vector<vector<int> > utama;
    scanf("%d %d", &n,&q);
    if((n <= 100000 && n >= 1 )&& (q <= 100000 && q>= 1)){
    	
		for(int x = 0; x < n; x++){	
			cin >> i;
			vector<int> kedua;
			for(int y = 0; y < i; y++){
				cin >> angka;
				kedua.push_back(angka);
			}
			utama.push_back(kedua);
				
		}
	}
	
	for(int z = 0; z < q; z++){
		cin >> i >> j;
		cout << utama[i][j] << endl;	
	}    
	cin.get();
    return 0;
}
