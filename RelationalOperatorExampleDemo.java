class RelationalOperatorExampleDemo
{
public static void main(String[] args)
{
int i = 100;
int j = 200;
int k = 300;
boolean result = i<j;
System.out.println(" i<j :"+result);
boolean result1 = j<i;
System.out.println(" j<i :"+result1);
boolean result2 = i>j;
System.out.println(" i>j :"+result2);
boolean result3 = j>i;
System.out.println(" j>i :"+result3);
boolean result4 = i<=k;
System.out.println(" i<=k :"+result4);
boolean result5 = i>=j;
System.out.println(" i>=j :"+result5);
boolean result6 = i==j;
System.out.println(" i==j :"+result6);
boolean result7 = i!=k;
System.out.println(" i!=k :"+result7);
boolean result8 = j!=k;
System.out.println(" j!=k :"+result8);
}
}