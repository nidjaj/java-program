class Sum1_array
{
 public static void main(String args [])
 {
  int a[]=new int[5];
  int evensum=0,oddsum=0;
  for(int i=0;i<a.length;i++)
  {
   if(a[i]%2==0)
    evensum+=a[i];
   else
    oddsum+=a[i];
  }
 System.out.println("sum of even no. is "+evensum);
 System.out.println("sum of odd no. is "+oddsum);
 }
}