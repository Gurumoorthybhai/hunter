import java.util.*;
public class norepeat
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int n=ob.nextInt();
int a[]=new int[n];
int i,j,k,count=0;
for(i=0;i<n;i++)
{
a[i]=ob.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
count=1;
for(k=j;k<n;k++)
{
a[k]=a[k+1];
}
n--;
}
}
if(count==1)
System.out.print(a[i]);
}
}
}
