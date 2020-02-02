class M
{
 public static void main (String args [])
 {
  int n=9,i,j;
  for(i=1;i<=n;i++)
  {
   for(j=1;j<=n;j++) 
   {
    if(j==1 || j==n || (i==j && i<=(n+1)/2) || (j>=(n+1)/2 && (i+j)==(n+1)))
     System.out.print("*");
    else
     System.out.print(" ");
   }
  System.out.println();
  }
 }
}