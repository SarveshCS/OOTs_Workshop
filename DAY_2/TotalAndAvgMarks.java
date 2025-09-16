class TotalAndAvgMarks{
    public static void main(String[]args){
        if(args.length<4){
            System.out.println("Usage: java TotalAndAvgMarks name marks1 marks2 marks3");
            return;
        }
        String name=args[0];
        double m1=Double.parseDouble(args[1]);
        double m2=Double.parseDouble(args[2]);
        double m3=Double.parseDouble(args[3]);
        double total=m1+m2+m3;
        double avg=total/3.0;
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}
