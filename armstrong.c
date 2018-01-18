#include<stdio.h>
#include<math.h>
void main()
{
	int n,num,num1=0,num2,c=0;
	scanf("%d",&n);
	num=n;
	num2=n;
	while(num2!=0)
	{
		num2=num2/10;
		++c;
	}
	while(num!=0)
	{
		int r=num%10;
		num1=num1+pow(r,c);
		num=num/10;
	}
	if(num1==n)
	printf("yes");
	else
	printf("no");
}
