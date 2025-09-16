public class ThisConst {
    int i, j;
    ThisConst() {
        this(10, 20);
    }

    ThisConst(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void display(){
        System.out.println("i: "+ i + "\nj: "+ j);
    }

    public static void main(String[] args) {
        ThisConst obj = new ThisConst();
        obj.display();
    }
    
}
