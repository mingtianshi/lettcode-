#include<stdio.h>

int main()
{
	int arr[10] = {0};
	int is = 0;
	for (is = 0; is < 10; is++)//i<11是不可以的，不可以越界访问
	{
		arr[is] = is;
	}
	return 0; 
}
