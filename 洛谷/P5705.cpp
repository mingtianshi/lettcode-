//P5704
//https://www.luogu.com.cn/problem/P5704#submit
//P5705 【深基2.例7】数字反转

#include<bits/stdc++.h>
using namespace std;
string a;
int main()
{
	cin>>a;
	for(int i=a.size()-1;i>=0;i--)cout<<a[i];
	return 0;
}