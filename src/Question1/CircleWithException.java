package Question1;

public class CircleWithException {
    private double radius;
    private double area;
    private double diameter;

    private static final double PI = 3.1415926;

    public void setRadius(double radius){
        if(radius < 0){
            throw new IllegalArgumentException();
        }else{
            this.radius = radius;
        }
    }

    public double getRadius(){
        if(this.radius < 0){
            throw new IllegalArgumentException();
        }else{
            return this.radius;
        }
    }

    public double getArea() throws Exception {
        this.area = PI * (this.radius * this.radius);
        if(this.area > 1000){
            throw new Exception();
        }else{
            return this.area;
        }
    }

    public double getDiameter() throws Exception {
        this.diameter = this.radius * 2;
        if(this.diameter < 0){
            throw new Exception();
        }else{
            return this.diameter;
        }
    }


}
