class ThisMethod {
    void display(){
        System.out.println("Hello This is display method");
    }
    void invokeMethod(){
        this.display();
    }

    public static void main(String[] args) {
        ThisMethod t = new ThisMethod();
        t.invokeMethod();
    }
}
