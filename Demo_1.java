class Factorial
{
int n,fact=1;
void input(int c)
{
n=c;
while(n!=0)
{
fact=fact*n;
n--;
}
System.out.println(fact);
}
}
class Demo_1
{
public static void main(String args[])
{
Factorial obj = new Factorial();
obj.input(10);
}
}