class Cpu
{
int price;
static class processor
{
int cores;
String producer;
processor(int noc,String manu)
{
cores=noc;
producer=manu;
}
void display()
{
System.out.println("\n processor information");
System.out.println("no of cores="+cores);
System.out.println("manufacture="+producer);
}
}
class Ram
{
int mem;
String manuf;
Ram(int memory,String producer)
{
mem=memory;
manuf=producer;
}
void display()
{
System.out.println("ram info");
System.out.println("memory="+mem);
System.out.println("manufacuture="+manuf);
}
}
public static void main(String[] args)
{
cpu.processor obj1=new cpu.processor(8,"intel");
cpu obj2=new cpu();
cpu.Ram obj3=obj2.new Ram(8,"samsung");
obj1.display();
obj3.display();
}
}
