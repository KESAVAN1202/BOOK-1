class A
{
public void display()
{
System.out.println("DISPLAY METHOD OF CLASS II WAS SUCCESSFULLY CALLED");
}
}
class B
{
public static void main(String args[])
{
A ob1=new A();
ob1.display();
System.out.println("RETURNED TO MAIN CLASS");
}
}