class Sum_array
{
 public static void main(String args [])
 {
  int a[]={10,55,523,86,20,30,40,50};
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