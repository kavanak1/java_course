class BitwiseOperatorExampleDemo
{
public static void main(String[] args)
{
int p = 150;
int q = 300;
System.out.println(p>q && ++p<q);
System.out.println("p :"+p);
System.out.println(p>q & ++p<q);
System.out.println("p :"+p);
System.out.println(p!=q || q++!=q);
System.out.println("p :"+p);
System.out.println(p!=q | q++!=q);
System.out.println("p :"+p);
}
}