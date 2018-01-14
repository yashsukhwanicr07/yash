#include<stdio.h>
void main()
{
	int n,copy,rev=0,r;
	scanf("%d",&n);   // enter any number
	copy=n;  // storing a copy of number
	while(n!=0)\
	{
		r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	if (copy==rev)
	printf("yes");
	else
	printf("no");
}
