#include<stdio.h>
void main()
{
	int r1,r2,i,j,c=0;
	scanf("%d %d",&r1,&r2);
	for(i=r1+1;i<r2;i++)
	{
		c=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			++c;
		}
		if(c==2)
		printf("%d ",i);
	}
}
