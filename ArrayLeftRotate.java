//left rotate an array by 1

import java.util.Scanner;
class ArrayLeftRotate
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
  int t=a[0];
  for(int i=0;i<n-1;i++)
  {
   a[i]=a[i+1];
  }
  a[n-1]=t;
  for(int i=0;i<n;i++)
  {
   System.out.print(a[i]+"\t");
  }
 }
}
 