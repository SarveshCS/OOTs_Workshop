class Employee
{
double salary = 78000;
void display()
{
System.out.println("The salary is"+salary);
}
}
class HR extends Employee
{
double salary = 90000;
@Override
void display()
{
//super.display();
System.out.println("The salary is "+salary);
}
}
class SuperDemo 
{
public static void main(String ar[])
{
HR h = new HR();
h.display();
}
}