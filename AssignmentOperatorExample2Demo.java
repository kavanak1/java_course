class AssignmentOperatorExample2Demo
{
public static void main(String[] args)
{
int x = 20;
int y = 30;
int z = 50;
x+=y;
y-=x+z;
z*=x*y;
System.out.println("x : "+x);
System.out.println("y : "+y);
System.out.println("z : "+z);
}
}