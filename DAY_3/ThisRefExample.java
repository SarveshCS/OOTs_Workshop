
public class ThisRefExample {
    int i, j;

    public ThisRefExample(int i, int j) {
        this.i = i; this.j = j;
    }

    void disp(){
        System.out.println(i+"\n"+j);
    }
    public static void main(String[] args) {
        ThisRefExample t = new ThisRefExample(5, 8);
        t.disp();
    }
}
