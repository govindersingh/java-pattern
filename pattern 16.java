class abc
{
public static void main(String args[])
{
int i,j,k;

for(i=1;i<=4;i++)
{
for(j=4;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}

for(i=1;i<=5;i++)
{
for(j=2;j<=i;j++)
{
System.out.print(" ");
}
for(k=i;k<=5;k++)
{
System.out.print(" *");
}
System.out.println();
}

}
}