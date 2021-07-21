import java.util.*;
class Stacktoarray
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Size of Array ");
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("Enter elements in to Array ");
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  Stack<Integer> s =new Stack<Integer>();
  for(int i=0;i<n;i++)
  {
   s.push(a[i]);
  }
  System.out.println("Stack is "+s);
 }
}


Output________________________________________________________________
Enter the Size of Array
5
Enter elements in to Array
10
20
30
40
50
Stack is [10, 20, 30, 40, 50]