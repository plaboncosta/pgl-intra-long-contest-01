#include <iostream>
#include <unordered_map>
#include <bits/stdc++.h>

using namespace std;

int main() {
    string str = "geeks for geeks geeks quiz practice qa for";
    unordered_map<string, int> wordFreq;
    stringstream ss(str);
    string word;
    while (ss >> word) {
        wordFreq[word]++;
    }

    /*for (auto x: wordFreq) {
        cout << x.first << " " << x.second << endl;
    }*/

    unordered_map<string, int>::iterator itr;
    for (itr = wordFreq.begin(); itr != wordFreq.end(); itr++) {
        cout << itr->first << " " << itr->second << endl;
    }
    return 0;
}
