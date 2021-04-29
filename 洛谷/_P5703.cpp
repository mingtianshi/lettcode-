//P5703 【深基2.例5】苹果采购 
//https://www.luogu.com.cn/problem/P5703

#include <iostream>//头文件：使用一些函数必备的，如 cin , cout

#include <cstdio>//头文件：使用 scanf , printf 必备的

using namespace std;
//关于using namespace std;可以看一下这个https://blog.csdn.net/quyafeng2011/article/details/68921750

int a,b;
//定义两个整形的变量，因为题目中说保证输入和答案都在int范围内的非负整数。所以用int就够了。如果超出了int的范围的话要使用long long。

int main() {//主函数
	cin>>a>>b;//输入，可以使用scanf("%d%d",&a,&b);
	cout<<a*b<<'\n';//输出，可以使用printf("%d",a*b);
	return 0;
}
