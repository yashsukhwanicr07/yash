#include<stdio.h>
void main()
{
	int r1,r2,i;
	scanf("%d %d",&r1,&r2);
	for(i=r1+1;i<r2;i++)
	{
		if(i%2==1)
		printf("%d ",i);
	}
}
