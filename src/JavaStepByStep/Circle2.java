package JavaStepByStep;

import java.awt.*;

public class Circle2 {
    Point p;
    int radius;

    public boolean equals(Object obj){
        if(obj== null || obj.getClass() != getClass()){
            return false;
        }else{
            Circle2 c = (Circle2)obj;
            return p.equals(c.p) && radius == c.radius;
        }
    }
}
