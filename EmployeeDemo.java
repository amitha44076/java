import java.io.*;
class Employee
{ 
 int eNo,eSalary;
 String eName;
 
 void read() throws IOException
 {
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the Employ number: ");
   eNo=Integer.parseInt(br.readLine());
   System.out.println("Enter the Employ name: ");
   eName=br.readLine();
   System.out.println("Enter the Employ salary: ");
   eSalary=Integer.parseInt(br.readLine());
   
 }
 void Display() throws IOException
 {
  System.out.println("Name of the Employ: " + eName);
   System.out.println("salary of the Employ: " + eSalary);
  
  }
}
class EmployeeDemo
{
  public static void main(String args[])throws IOException
  {
   int n;
   int emp;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.print("Enter number of employees: ");
   n=Integer.parseInt(br.readLine());
   Employee s[]=new Employee[n];
   for(int i=0;i<n;i++)
   {
    s[i]=new Employee();
    s[i].read();
  
   }
   System.out.println("Enter the Employ number to search: ");
   emp=Integer.parseInt(br.readLine());

   for(int i=0;i<n;i++)
   {
     if(emp==s[i].eNo)
     {
      s[i].Display();
     }
    
   }
  }

}
