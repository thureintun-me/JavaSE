package realationinterface;

public class Main {
    public static void main(String[] args) {

        Line line1 = new Line(1.0,2.0,1.0,2.0);
        Line line2 = new Line(2.0,3.0,2.0,3.0);

        boolean b1 = line1.isGreater(line1,line2);
        System.out.println("line 1 is greater than line 2 : " + b1);

        b1 = line1.isEqual(line1,line2);
        System.out.println("line1 is equal line2 : " + b1);

        RelationInterface line3 = new Line(1.0,5.0,1.0,5.0);
        boolean b3 = line3.isEqual(line1,line3);
        System.out.println("line1 is equal with line 3 : " + b3);
        System.out.println("Length of line1 is " + line1.getLength());
        System.out.println("Length of line2 is " + line2.getLength());

    }
}
