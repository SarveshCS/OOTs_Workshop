class S
{
    int i; //instance variable
    static int j; //static variable
    void display()
    {
        int k = 50;
        System.out.println(k);
    }
}

public class StaticDemo
{
    public static void main(String[] args)
    {
        S obj = new S();
        System.out.println(obj.i);
        System.out.println(S.j);
        obj.display();
        
    }
}