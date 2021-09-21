class Refrigerator{
String brand;
String color;
int capacity,rate,NoOfDoors;
void freez(){
System.out.println(brand+" "+color+" "+" refrigerator have a freezer......!");
}

public static void main(String args[])
{
Refrigerator r=new Refrigerator();
r.brand="whirlpool";
r.color="Black";
r.capacity=300;
r.rate=25000;
r.NoOfDoors=2;
r.freez();
}
}