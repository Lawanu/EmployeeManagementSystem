import java.util.*;
public class EmpNameAge
{
public static void main(String[] args)
{

System.out.println("**Employee Management**");
System.out.println("________________________________________");
Scanner sc=new Scanner(System.in);
int num;
int func;
Clerk c1=new Clerk();
Programmer p1=new Programmer();
Manager m1=new Manager();
do{
System.out.println("1)Create");
System.out.println("2)Display");
System.out.println("3)Raise Salary");
System.out.println("4)Exit");
System.out.print("Enter number:");
func=sc.nextInt();
switch(func)
{
case 1:do{
   
	System.out.println("**INSERT NEW EMPLOYEE**");
	
	System.out.println("Employee Types:");
    System.out.println("1)CLERK");
    System.out.println("2)PROGRAMMER");
    System.out.println("3)MANAGER");
    System.out.println("4)Exit");
    System.out.print("Enter the number:");
    num=sc.nextInt();
    switch(num)
   {
     case 1:
    System.out.println("__CLERK Entry__");
    c1.c_store();
      break;
    case 2:
    System.out.println("__PROGRAMMER Entry__");
    
    p1.p_store();
    break;
    case 3:
    System.out.println("__MANAGER Entry__");
    
   m1.m_store();
    break;
    case 4:System.out.println(" ");
    break;
    default:System.out.println("Wrong Entry");
   }
   System.out.print("");
   System.out.println("________________________________________");

   }while(num!=4);
   break;
case 2:System.out.println("Display() Under Construction");
if(c1.Name!=null)
{
System.out.println("Name:"+c1.Name+" "+"Age:"+c1.Age+" "+"Designation:"+c1.Designation+" "+"Salary:"+c1.Sal);
}
else
{
System.out.print("");
}
break;
case 3:System.out.println("RaiseSalary() Under Construction");
break;
case 4:System.out.println("EXITED");
break;
default:System.out.println("Wrong Entry");
}


}while(func!=4);


System.out.println("");
System.out.println("________________________________________");

} 
}
   
class EmployeeDetails
{
String Name;
int Age;
}
class Clerk extends EmployeeDetails
{
String Designation="Clerk";
int Sal=8000;
public void c_store()
{
System.out.println("Enter the name:");
Scanner sc=new Scanner(System.in);
Name=sc.nextLine();
System.out.println("Enter the age:");
Age=sc.nextInt();}
}
class Programmer extends EmployeeDetails
{

public void p_store()
{
String Designation="Programmer";
int Sal=10000;
System.out.println("Enter the name:");
Scanner sc=new Scanner(System.in);
Name=sc.nextLine();
System.out.println("Enter the age:");
Age=sc.nextInt();
}}
class Manager extends EmployeeDetails
{
public void m_store()
{
String Designation="Manager";
int Sal=70000; 
System.out.println("Enter the name:");
Scanner sc=new Scanner(System.in);
Name=sc.nextLine();
System.out.println("Enter the age:");
Age=sc.nextInt();
}
}