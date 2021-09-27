class TernaryOperatorExampleDemo
{
public static void main(String[] args)
{
int a=50;
int b=100;
int c=150;
int result=(a>b)?(a>c?a:c):(b>c?b:c);
System.out.println("Largest of" + a + b + c +" is :"+result);
int result1=(a<b)?(a<c?a:a):(b<c?b:a);
System.out.println("Smallest of" + a + b + c +" is :"+result1);
}
}
