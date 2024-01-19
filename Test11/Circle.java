package Test11;
class Circle {
    public static final double PI=3.1415;
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getCircmference(){
        return 2*PI*radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public String toString(){
        return "" + getCircmference() ;
    }
}
    
