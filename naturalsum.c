#include<stdio.h>
void main()
{
	int i,sum=0,n,arr[100],k;
	//printf("enter the no of elements of an array");
	scanf("%d",&n);
	for(i=1;i<+n;i++)
	arr[i-1]=i;
	//printf("enter the value of k");
	scanf("%d",&k);
	for(i=0;i<k;i++)
	{
		sum=sum+arr[i];
	}
	printf("%d",sum);
}
