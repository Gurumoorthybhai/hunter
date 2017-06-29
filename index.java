import java.util.*;
public class index
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int[] a;
int n=ob.nextInt();
int i;
for(i=0;i<n;i++)
{
a[i]=ob.nextInt();
}
Arrays.sort(a);
for(i=0;i<n;i++)
{
if(i==a[i])
{
System.out.print(i);
}
}
}
}
