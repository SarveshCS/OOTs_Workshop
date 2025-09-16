class Parents {
    int i, j;

    Parents(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void disp() {
        System.out.println("The value of i and j are" + "\n" + i + "\n" + j);
    }
}

class Child extends Parents {
    int i, j, k;

    Child(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        System.out.println("The value of  k is:" + k);
    }
}

class ConsInher {
    public static void main(String args[]) {
        Child c = new Child(20, 40, 60);
        c.disp();
        c.show();
    }
}