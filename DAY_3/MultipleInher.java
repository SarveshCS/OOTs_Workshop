interface multiple
{
void disp1();
}
interface multiple1
{
void disp2();
}
interface M extends multiple,multiple1
{
}
class MultipleInher implements M
{
public void disp1()
{
System.out.println("This is first method");
}

public void disp2()
{
System.out.println("This is second method");
}
public static void main(String args[])
{
MultipleInher m =  new MultipleInher();
m.disp1();
m.disp2();
}
}