package Yongzhi;

public class Circle {

    double r;
    double area;
    double perimeter;
    double Pai = 3.14;



    public  void area(double r){

        double area;
        this.r = r;
        area = r * r * Pai;
        this.area = area;

    }

    public double getArea(){

        return this.area;
    }

    public void  Perimeter(double r){

        double perimeter;
        this.r = r;
        perimeter = r * 2 * Pai;
        this.perimeter = perimeter;

    }

    public double getPerimeter(){

        return this.perimeter;
    }

}
