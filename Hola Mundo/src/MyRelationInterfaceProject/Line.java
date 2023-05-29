package MyRelationInterfaceProject;

public class Line implements Relation{
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Line(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }


    public double getLength(){
        return Math.sqrt( Math.pow(x2-x1,2.0) + Math.pow(y2-y1, 2.0) );
    }


    @Override
    public boolean isGreater(Object a, Object b){
        double aLen = ((Line)a).getLength();
        double bLen = ((Line)b).getLength();
        return aLen > bLen;
    }

    @Override
    public boolean isLess(Object a, Object b){
        double aLen = ((Line)a).getLength();
        double bLen = ((Line)b).getLength();
        return aLen < bLen;
    }

    @Override
    public boolean isEqual(Object a, Object b){
        double aLen = ((Line)a).getLength();
        double bLen = ((Line)b).getLength();
        return aLen == bLen;
    }

}
