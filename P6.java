import java.util.*;
class pattern
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF LINES");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print("*");
}
System.out.println("\n");
}
}
}