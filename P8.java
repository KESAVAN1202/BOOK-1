import java.util.Scanner;
class employee
{
private int eid;
private String ename;
private float esal;
public void setid(int a)
{
System.out.println("ENTER THE EID");
eid=a;
}
public void setename(String b)
{
System.out.println("ENTER THE ENAME");
ename=b;
}
public void setsal(float c)
{
System.out.println("ENTER THE ESAL");
esal=c;
}
public int getid()
{
eid=a;
}
public String getename()
{
ename=b;
}
public float getsal()
{
esal=c;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE EID");
int a=sc.nextInt();
System.out.println("ENTER THE ESAL");
float c=sc.nextFloat();
System.out.println("ENTER THE ENAME");
String s=sc.next();
setid(a);
setename(b);
setsal(c);
System.out.println(getid());
System.out.println(getename());
System.out.println(getsal());
}
}