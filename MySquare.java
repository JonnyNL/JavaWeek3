public class MySquare {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private MyPoint v4;

    //add constructors
    public MySquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
        v4 = new MyPoint(x4, y4);
    }

    public MySquare(MyPoint v1, MyPoint v2, MyPoint v3, MyPoint v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    //toString
    public String toString() {
        return("MySquare[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + ",v4=" + v4 + "]");
    }

    
    //perimeter and area methods

    public double getPerimeter() {
        double perimeter = 0.0;
        perimeter += v1.distance(v2);
        perimeter += v2.distance(v3);
        perimeter += v3.distance(v4);
        perimeter += v4.distance(v1);
        return perimeter;
    }

    public double getArea() {
        double side1 = v1.distance(v2);
        double area = side1 * side1;
        return area;
    }

    // additional square calcs

    public double getDiagonalLength() {
        double side = v1.distance(v2);
        double diagonalLength = side * Math.sqrt(2);
        return diagonalLength;
    }

 
    // You can use the diagonal length of a square to get the circumcircle radius of the square
    public double getCircumcircleRadius() {
        double diagonalLength = getDiagonalLength();
        double circumcircleRadius = diagonalLength / 2;
        return circumcircleRadius;
    }
}
