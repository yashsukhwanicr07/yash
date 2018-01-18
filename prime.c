#include<stdio.h>
void main()
{
	int n,i,c=0;
	scanf("%d",&n); //input number
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		++c;
	}
	if (c==2)
	printf("yes");
	else
	printf("no");
}
