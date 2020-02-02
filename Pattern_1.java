class Pattern_1
{
 public static void main (String args [])
 {
  int n=5,i,j;
  i=n;
  while(i>=1)
  {
   j=1;
   while(j<=i) 
   {
    System.out.print((i*j+i)+" ");
    j++;
   }
  System.out.println();
  i--;
  }
 }
}