import java.util.Scanner;
class multiple
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t1,t2;
System.out.println("ENTER NUMBER OF MULTIPLES TO BE PRINTED FOR 5 AND 10");
int ch1=sc.nextInt();
int ch2=sc.nextInt(); 
for(int i=1;i<=ch1;i++)
{
t1=5*i;
System.out.println(t1);
}
int j=1;
while(j<=ch2)
{
t2=10*j;
System.out.println(t2);
j++;
}
}
}