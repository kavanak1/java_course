class Cycle{
String brand;
String color;
int rate;
void run(){
System.out.println(brand+" "+color+" "+" is running......!");
}
void wheeling(){
System.out.println(brand+" "+color+" "+" is wheeling......!");
}
public static void main(String args[])
{
Cycle c=new Cycle();
c.brand="TVS";
c.color="Black";
c.rate=5000;
c.run();
c.wheeling();
}
}