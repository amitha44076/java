import java.io.*;

import java.util.Scanner;
class SearchArray
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 int i,n,search,temp=0;
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int[] a = new int[n];
 System.out.println("Enter the elements") ;
 for(i=0;i<n;i++)
  {
    a[i] = sc.nextInt();
   }
 System.out.println("Enter the element to be seached");
 search = sc.nextInt();
 for(i=0;i<n;i++)
  {
    if(a[i]==search)
       {
          System.out.println("Element found");
          temp=1;
           break;
        }
   }
 if(temp==0)
   {
     System.out.println("Element "+search+" not found");
    }
 }
}
