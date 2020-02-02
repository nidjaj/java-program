class Z
{
 public static void main (String args [])
 {
  int n=5,i,j;
  i=1;
  while(i<=n)
  {
   j=1;
   while(j<=n) 
   {
    if(i==1 || i==n || (i+j==n+1))
     System.out.print("*");
    else
     System.out.print(" ");
    j++;
   }
  System.out.println();
  i++;
  }
 }
}