abstract class abs{
    abstract void show();
    void show1(){
        System.out.println("Hello This is non-abstract method");
    }
}

class abstract1 extends abs{
    void show(){
        System.out.println("Hello this is a abstract method implementation");
    }
    

    public static void main(String[] args) {
        abstract1 obj = new abstract1();
        obj.show();
        obj.show1();
    }
}