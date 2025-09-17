class Override1{
    float sum(int a, float b){
        return (a+b);
    }
}

class Override2 extends  Override1{
    @Override
    float sum(int a, float b){
        System.out.println(super.sum(a, b));
        return (a-b);
    }
}


class Override3 extends  Override2{
    @Override
    float sum(int a, float b){
        System.out.println(super.sum(a, b));
        return (a*b);
    }
}
public class MethodOverride {
    public static void main(String[] args) {
        Override3 obj = new Override3();
        System.out.println(obj.sum(3, 7.3f));
    }
}
