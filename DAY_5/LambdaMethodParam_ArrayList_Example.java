import java.util.ArrayList;

public class LambdaMethodParam_ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<String> lang = new ArrayList<>();
        lang.add("java");
        lang.add("python");
        lang.add("javascript");
        lang.add("csharp");
        lang.add("ruby");
        lang.add("go");
        lang.add("kotlin");
        lang.add("swift");

        lang.replaceAll(e -> e.toUpperCase());
        System.out.println("Languages in uppercase: " + lang);
    }
}
