#include <stdio.h>

#define MAXN 10
typedef float ElementType;

ElementType Median( ElementType A[], int N );

int main ()
{
    ElementType A[MAXN];
    int N, i;

    scanf("%d", &N);
    for ( i=0; i<N; i++ )
        scanf("%f", &A[i]);
    printf("%.2f\n", Median(A, N));

    return 0;
}
//本题要求实现一个函数，求N个集合元素A[]的中位数，
//	即序列中第L(N+1)/2⌋大的元素。
//	其中集合元素的类型为自定义的ElementType。

/* 你的代码将被嵌在这里 */
ElementType Median( ElementType A[], int N ){
   ElementType s;
 	int j;
    //将数组排序
    for (int p = N / 2; p > 0; p /= 2){
        for (int i = p; i < N; i++){
            //求N的总数是否为A【i】的中位数
            s = A[ i ];
            //判断数组中符合条件的
            for (j = i;j >= p;j -= p ){
                if ( s < A[ j - p ])
                    A[j] = A[ j - p ];
                else
                    break;
            }
            A[j] = s;
        }
    }
 
    return A[ N / 2 ];
}