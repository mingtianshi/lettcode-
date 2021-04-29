//https://www.luogu.com.cn/problem/P1425#submit
//P1425 小鱼的游泳时间

#include<stdio.h>

int main()
{
	//19 10
	//12 50	
	//6:20
	int a,b,c,d;
	scanf("%d %d %d %d",&a,&b,&c,&d);
	if(0 <= a <= 24 || 0 <= c <= 24 || 0 <= b <= 60 || 0 <= d <= 60){
		//确认时间
		if(d<b)//如果不够减
    	{
        	d+=60;//退位
	        c--;
 	   }
		a = c - a;
		b = d - b;
		printf("%d %d",a,b);
	}
	return 0;
}