#include<stdio.h>
void main()
{
	char a;
	printf("enter any character\n");
	scanf("%c",&a);
	if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')
	printf("it is a vowel");
	else
	printf("it is a consonant");
}
