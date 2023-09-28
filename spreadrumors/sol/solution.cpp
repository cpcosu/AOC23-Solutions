//C++ solution
#include <iostream>
#include <string>
#include <set>
using namespace std;
int main()
{
    string pos_arr;
    getline(cin, pos_arr);
    string chars = strtok(pos_arr, " ");
    
    
    string n;
    int num_test;
    getline(cin, n);
    num_test = stoi(n);

    set<string> set;

    for(int i = 0; i < num_test; i++){
        string command;
        getline(cin,command);
        string file = command.substr(3);
        set.insert(file);
    }
    cout << set.size();
    return 0;
};
