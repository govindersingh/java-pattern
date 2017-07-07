class abc
{
public static void main(String args[])
{
int i,j,k,l;
for(i=1;i<=5;i++)
{
for(j=10;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
for(i=1;i<=3;i++)
{
	for(j=6;j>=i;j--)
	{
		System.out.print(" ");
	}
	for(k=1;k<=i;k++)
	{
		System.out.print("*");
	}
	for(l=1;l<=9;l++)
	{
		System.out.print(" ");
	}
	for(k=1;k<=i;k++)
	{
		System.out.print("*");
	}

	System.out.println();
	
}

for(i=5;i<=6;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(k=i;k<=6;k++)
	{
		System.out.print("*");
	}
	for(l=1;l<=9;l++)
	{
		System.out.print(" ");
	}
	for(k=6;k>=i;k--)
	{
		System.out.print("*");
	}
	System.out.println();
}
for(i=6;i<=10;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(k=i;k<=10;k++)
	{
		System.out.print(" *");
	}
	System.out.println();
}


}}