// pattern print with recursion

class Pattern_10
{
 static void row(int i,int n)
 {
  if(i<1)
   return;
  col(1,i);
  System.out.println();
  row(i-1,n);
 }
 static void col(int j,int i)
 { 
  if(j>i)
   return;
  System.out.print(j);
  col(j+1,i);
 }
 public static void main(String args[])
 { 
  row(10,10);
 }
}