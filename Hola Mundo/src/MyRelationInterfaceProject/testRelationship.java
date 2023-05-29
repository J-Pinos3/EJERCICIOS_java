package MyRelationInterfaceProject;

public class testRelationship {
    public static void main(String[] args) {

        Line line1 = new Line(1.3, 3.6, 2.4, 8.7);
        Line line2 = new Line(1.0, 2.0, 1.0, 2.0);

        boolean b1 = line1.isGreater(line1, line2);
        System.out.println("line1 > line2 = " + b1);

        b1 = line1.isEqual(line1, line2);
        System.out.println("line1 == line2 = " + b1);

        Relation line3 = new Line(1.3, 3.6, 2.4, 8.7);
        b1 = line3.isEqual(line1, line3);
        System.out.println("line1 == line3 = " + b1);

    }
}
