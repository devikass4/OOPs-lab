import java.util.*;
class employee
{
int empid;
String name;
double salary;
String address;
employee()
{
Scanner sc2=new Scanner(System.in);
System.out.println("enter employee id:");
empid=sc2.nextInt();
System.out.println("enter employee name:");
name=sc2.next();
System.out.println("enter employee salary:");
salary=sc2.nextDouble();
System.out.println("enter employee address:");
address=sc2.next();
}
}
class teacher extends employee
{
String department;
String subject;
teacher()
{
Scanner sc3=new Scanner(System.in);
System.out.println("enter department:");
department=sc3.next();
System.out.println("enter subject:");
subject=sc3.next();
}
void display()
{
System.out.println("..............");
System.out.println("NAME:"+name);
System.out.println("salary:"+salary);
System.out.println("ADDRESS:"+address);
System.out.println("DEPARTMENT:"+department);
System.out.println("SUBJECT:"+subject);
System.out.println("................");
}
}
class multilevelinheritance
{
public static void main(String args[])
{
int n;
Scanner sc1=new Scanner(System.in);
System.out.println("enter number of employees");
n= sc1.nextInt();
teacher t[]=new teacher[n];
for(int i=0;i<n;i++)
{
t[i]=new teacher();
}
System.out.println("..............");
System.out.println("..................");
System.out.println ("THE DETAILS ARE.....");
System.out.println("...........");
for(int i=0;i<n;i++)
{
t[i].display();
}
}
}
