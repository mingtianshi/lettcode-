#include <iostream>
using namespace std;

#define MAXSIZE 50
typedef int KeyType;

typedef  struct                     
{ KeyType  key;                                             
} ElemType;  

typedef  struct
{ ElemType  *R; 
  int  length;
} SSTable;                      

void  Create(SSTable &T)
{ int i;
  T.R=new ElemType[MAXSIZE+1];
  cin>>T.length;
  for(i=1;i<=T.length;i++)
     cin>>T.R[i].key;   
}

int  Search_Bin(SSTable T, KeyType k);

int main () 
{  SSTable T;  KeyType k;
   Create(T);
   cin>>k;
   int pos=Search_Bin(T,k);
   if(pos==0) cout<<"NOT FOUND"<<endl;
   else cout<<pos<<endl;
   return 0;
}

//https://pintia.cn/problem-sets/14/problems/44932
/* 请在这里填写答案 */
int  Search_Bin(SSTable T, KeyType k)
{
    int i=1;//头
    int j=T.length;//尾
    int mid;//中间
    while(i<=j)
    {
        mid=(i+j)/2;//折半查找
        if(T.R[mid].key==k)
            return mid;
        else if(T.R[mid].key>k)
            j=mid-1;
        else if(T.R[mid].key<k)
            i=mid+1;
    }
    return 0;
}
