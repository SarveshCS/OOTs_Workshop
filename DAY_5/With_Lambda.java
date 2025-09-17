interface Drawable {
    void draw();
}

public class With_Lambda {
    public static void main(String[] args) {
        int width = 10;
        Drawable d = () -> System.out.println("Drawing " + width);
        d.draw();
    }
}
