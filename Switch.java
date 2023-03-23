import java.util.*;
class Switch
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("enter choice");
a=sc.nextInt();
switch(a)
{
case 1:System.out.println("you choose one");
break;
case 2:System.out.println("you choose two");
break;
case 3:System.out.println("you choose three");
break;
default:
System.out.println("enter correct choice");
}
}
}
