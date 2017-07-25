import java.util.*;
class repeatfir
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int n=ob.nextInt();
int i=0,j=0,flag=0;
int[] a=new int[n];
for(i=0;i<n;i++)
a[i]=ob.nextInt();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
System.out.print(a[i]);
flag=1;
break;
}
}
if(flag==1)
break;
}
}
}
