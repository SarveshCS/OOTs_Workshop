interface inter{
    void disp1();
    void disp2();
}

class InterfaceEx implements inter{
    public void disp1(){
        System.out.println("This is first interface method");
    }

    public void disp2(){
        System.out.println("This is first interface method");
    }

    public static void main(String[] args) {
        InterfaceEx i = new InterfaceEx();
        i.disp1();
        i.disp2();
    }
}