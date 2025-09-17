class Overload{
    int sum (int a, int b){
        return (a+b);
    }
    float sum(int a, float b){
        return (a+b);
    }
}

public class MethodOverload {
    public static void main(String[] args) {
        Overload obj = new Overload();
        System.out.println(obj.sum(3, 7));
        System.out.println(obj.sum(3, 7.2f));
    }
}
