import java.util.*;
class subset
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int m=ob.nextInt();
int n=ob.nextInt();
int[] a=new int[m];
int[] b=new int[n];
int i,j,count=0;
for(i=0;i<m;i++)
{
a[i]=ob.nextInt();
}
for(i=0;i<n;i++)
{
 b[i]=ob.nextInt();  
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(a[i]==b[j])
{
count++;
}
}
}
if(count==n)
System.out.print("b subset of a");
}
}
