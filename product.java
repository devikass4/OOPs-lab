import java.util.*;
class Product
{
int pcode;
string pname;
double price;
Product(int code,string name,double rate)
{
pcode=code;
pname=name;
price=rate;
}
void display()
{
System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
}
static void lowest(double p1,double p2,double p3)
{
if(p1<p2&&p1<p3)
{
System.out.println("product 1 has the lowest price");
}
else if(p2<p1&&p2<p3)
{
System.out.println("product 2 has the lowest price");
}
else if((p3<p1&&p3<p2)
{
System.out.println("product 3 has the lowest price");
}
}
}|
public static void main(string[] arg)
{
int pcode1,pcode2,pcode3;
String pname1,pname2,pnam3;
float price1,price2,price3;
Scanner sc=new Scanner(system.ln);

System.out.println("enter the product 1 details");
pcode1=sc.nextint():
pname1=sc.next():
Product obj=new Product(pcode1,pname1,price1)

System.out.println("enter the product 2 details");
pcode2=sc.nextint():
pname2=sc.next():
Product obj=new Product(pcode2,pname2,price2);

System.out.println("enter the product 3 details");
pcode3=sc.nextint():
pname3=sc.next():
Product obj1=new Product(pcode3,pname3,price3);





                                                                                                                                                           


