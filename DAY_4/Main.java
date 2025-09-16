class Parent {
    Parent(){
        System.out.println("Inside Parent class Constructor");
    }
}

class Child extends Parent {
    Child(){
        System.out.println("Inside Child class Constructor");
    }
}

class GrandChild extends Child {

    public GrandChild() {
        System.out.println("Inside GrandChild class Constructor");
    }
    
}

class Main{
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
    }
}