import java.util.*;
import java.io.*;
class InvalidAgeException extends Exception
{
	InvalidAgeException()
	{
	}
	InvalidAgeException(String msg)
	{
		super(msg);
	}
	public void display()
	{
		System.out.print("Please enter between 21-60\n");
	}
}

abstract class Employee implements Serializable
{
	Employee e1;
	String name;
	int age;
	int salary;
	String designation;
	static int count=0;
	Employee()
	{ 
	
		try
		{
			Scanner sc = new Scanner(System.in);
		    System.out.print("\nEnter name : ");
		     name = sc.nextLine();
			
			while(true)
			{
				try
				{
					System.out.print("Enter age:");
				Scanner sc1=new Scanner(System.in);
					age =sc1.nextInt();
					if(age<21 || age>60)
						throw new InvalidAgeException();
					
				}
				
				
				catch(InvalidAgeException e)
				{
					e.display();
				}
				catch(InputMismatchException e)
				{
					System.out.print("Please enter number only");
				
				}
				
				if(age>=21&&age<=60)
					{
					break;
			         }
					 
			
			
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void Display()
	{
		System.out.println("\nNAME: " +name+ "\nAGE: " +age+ " \nSALARY: " +salary+ " \nDESIGNATION: " +designation+"\n");
	
	}
	public abstract void RaiseSalary();
}
 class Clerk extends Employee
{
	public Clerk()
	{
		salary=8000;
		designation="Clerk";
	}
	public void RaiseSalary()
	{
		salary=salary+2000;
	}
	
}

class Programmer extends Employee
{
	public Programmer()
	{
		salary=20000;
		designation="Programmer";
	}
	public void RaiseSalary()
	{
	salary=salary+5000;
	}
}

 class Manager extends Employee
{
	public Manager()
	{
		salary=70000;
		designation="Manager";
	}
	public void RaiseSalary()
	{
		salary=salary+20000;
	}
	
}
public class EmployeeCollection
{
	public static void main(String args[])
	{
	
	System.out.println("**Employee Management**");
System.out.println("________________________________________");

Scanner sc=new Scanner(System.in);
int num=0;
int func=0;

ArrayList<Employee>emp_c=new ArrayList<>();//Use of collection and generics
do{
System.out.println("1)Create");
System.out.println("2)Display");
System.out.println("3)Raise Salary");
System.out.println("4)Exit");
System.out.print("Enter number:");
try{//Exception handling
func=sc.nextInt();
}
catch(Exception e)
{
sc.next();
}//Exception handling
switch(func)
{
case 1:func=0;//exception handle

    do{
    System.out.println("**INSERT NEW EMPLOYEE**");
	System.out.println("Employee Types:");
    System.out.println("1)CLERK");
    System.out.println("2)PROGRAMMER");
    System.out.println("3)MANAGER");
    System.out.println("4)Exit");
    System.out.print("Enter the number:");
    
	
	/*Exception Handling*/
	try{                        
	num=sc.nextInt();
	}
	catch(Exception e)
	{
	sc.next();
     };/*Exception Handling*/
	
	switch(num)
   {
     case 1:
    System.out.println("__CLERK Entry__");
     num=0;//exception check
      emp_c.add(new Clerk());
      Employee.count++;
	  break;
    case 2:
    System.out.println("__PROGRAMMER Entry__");
    emp_c.add(new Programmer());
    num=0;//exception check
	Employee.count++;
	break;
    case 3:
    System.out.println("__MANAGER Entry__");
    num=0;//exception check
	System.out.println("Count:"+Employee.count);
     emp_c.add(new Manager());
    
	Employee.count++;
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
func=0;//Exception handle
System.out.println("__Employee Details__");
//for(int i=0;i<Employee.count;i++)
//emp_c[i].Display();
for(Employee i:emp_c)
{
i.Display();
}
break;
case 3:
func=0;//Exception handle
for(Employee i:emp_c)
{
i.RaiseSalary();
}
System.out.println("SALARY RAISED");
break;
case 4:
System.out.println("_________________*EXIT*_________________");
System.out.println("Total number of employee inserted:"+Employee.count);
break;
default:System.out.println("Wrong Entry");
}
}while(func!=4);
System.out.println("");
System.out.println("________________________________________");
	}
}