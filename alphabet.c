#include<stdio.h>
int main()
{
	char a;
	scanf("%c",&a);
	int f=int(a);
	if(f>=97&&f<=122||f>=65&&f<=90)
	printf("character is an alphabet");
	else
	printf("character is not an alphabet");
	return 0;
}
