// maximum element in array

import java.util.Scanner;
class ArrayMax
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("enter how many no.:");
  int n=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
   System.out.print("enter element "+(i+1)+" :");
   a[i]=sc.nextInt();
  }
  int max=a[0];
  for(int i=1;i<n;i++)
  {
   if(a[i]>max)
    max=a[i];
  }
  System.out.print("Max is "+max);
 }
}
 