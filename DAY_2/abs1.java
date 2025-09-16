abstract class abs{
    abstract void show1();
    void show2(){
        System.out.println("This is s non-abstract method");
    }
}

class abs1 extends abs{
    @Override
    void show1(){
        System.out.println("Thi is abstract method implementation");
    }
    public static void main(String[] args) {
        abs1 a = new abs1();
        a.show1();
        a.show2();
    }
}
