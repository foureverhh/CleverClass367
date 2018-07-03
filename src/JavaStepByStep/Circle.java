package JavaStepByStep;

public class Circle {
    double x,y;
    double radius;
    @Override
    public boolean equals(Object obj){
        if(obj==null || obj.getClass() != getClass())
            return false;
        else{
            Circle c = (Circle) obj;
            //To check whether obj and Circle have same value
            return x == c.x && y == c.y && radius == c.radius;
        }
    }
}
