import java.util.*;
abstract class Employee
{
String name;
int age;
int salary;
String designation;
Employee()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name:");
name=sc.nextLine();
System.out.println("Enter the age:");
age=sc.nextInt();
while(age<21 || age>60)
{
System.out.println("Please Enter age between 21-60");
age=sc.nextInt();}
}
public void Display()
{

System.out.println("Name:"+name+" "+"Age:"+age+" "+"Designation:"+designation+" "+"Salary:"+salary);

}
public abstract void RaiseSalary();//Abstract method
}
class Clerk extends Employee
{
Clerk()
{
salary=8000;
designation="Clerk";
}
public void RaiseSalary()//Implementation of abstract method in sub class
{
salary=salary+5000;
}

}
class Programmer extends Employee
{
Programmer()
{
salary=20000;
designation="Programmer";
}
public void RaiseSalary()//Implementation of abstract method in sub class
{
salary=salary+10000;
}
}
class Manager extends Employee
{
Manager()
{
salary=70000;
designation="Manager";}
public void RaiseSalary()//Implementation of abstract method in sub class
{
salary=salary+20000;
}

}


public class EmployeeDetails
{

public static void main(String[] args)
{

/*///////////////////Display\\\\\\\\\\\\\\\\\\\*/
System.out.println("**Employee Management**");
System.out.println("________________________________________");
Scanner sc=new Scanner(System.in);
int num;
int func;
Clerk []emp_c=new Clerk[10];
Programmer []emp_p=new Programmer[10];
Manager []emp_m=new Manager[10];
int emp_numc=0;//Counts no. of clerks
int emp_nump=0;//Counts no. of programmers
int emp_numm=0;//Counts no. of manager
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
    emp_c[emp_numc]=new Clerk();
    emp_numc++;
	  break;
    case 2:
    System.out.println("__PROGRAMMER Entry__");
    
   emp_p[emp_nump]=new Programmer();
    emp_nump++;
	break;
    case 3:
    System.out.println("__MANAGER Entry__");
    emp_m[emp_numm]=new Manager();
    emp_numm++;
    break;
    case 4:System.out.println(" ");
    break;
    default:System.out.println("Wrong Entry");
   }
   System.out.print("");
   System.out.println("________________________________________");

   }while(num!=4);
   break;
case 2:
System.out.println("__Employee Details__");
for(int i=0;i<emp_numc;i++)
emp_c[i].Display();
for(int j=0;j<emp_nump;j++)
emp_p[j].Display();
for(int k=0;k<emp_numm;k++)
emp_m[k].Display();
break;
case 3:
for(int i=0;i<emp_numc;i++)
emp_c[i].RaiseSalary();
for(int j=0;j<emp_nump;j++)
emp_p[j].RaiseSalary();
for(int k=0;k<emp_numm;k++)
emp_m[k].RaiseSalary();
System.out.println("SALARY RAISED");
break;
case 4:System.out.println("_________________*EXIT*_________________");
final int total=emp_numc+emp_nump+emp_numm;
System.out.println("Number of Employees Created:"+"\n"+"Clerk:"+emp_numc+"\n"+"Programmer:"+emp_nump+"\n"+"Manager:"+emp_numm+"\nTotal:"+total);
break;
default:System.out.println("Wrong Entry");
}
}while(func!=4);
System.out.println("");
System.out.println("________________________________________");
}
}