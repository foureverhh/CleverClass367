package JavaStepByStep;

public class Point {
    double x;
    double y;
    public boolean equals(Object obj){
        if(obj == null || obj.getClass() != getClass())
            return false;
        else{
            Point p = (Point) obj;
            return p.x == x && p.y == y;
        }

    }
}
