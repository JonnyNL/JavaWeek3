public class TestMySquare {
    
    public static void main(String[] args) {

        // Create square 1 using the constructor that accepts integers to assign points
        MySquare sq1 = new MySquare(1, 1, 2, 2, 3, 3, 4, 4);

        // To use the next constructor we need 4 myPoints
        MyPoint v1 = new MyPoint(1, 2);
        MyPoint v2 = new MyPoint(2,3);
        MyPoint v3 = new MyPoint(3,4);
        MyPoint v4 = new MyPoint(4,5);

        // Construct square 2 using the 4 myPoints
        MySquare sq2 = new MySquare(v1, v2, v3, v4);

        // Using the toString() method to display the squares
        System.out.println("Squares using toString() method");
        System.out.println("Square 1: " + sq1);
        System.out.println("Square 2: " + sq2);

        // Using the getPerimeter method to view the squares perimeter
        System.out.println(" ");
        System.out.println("Perimeter of the Squares using getPerimeter()");
        System.out.println("Square 1: " + sq1.getPerimeter());
        System.out.println("Square 2: " + sq2.getPerimeter());

        // Using the getArea method to view the area of the squares
        System.out.println(" ");
        System.out.println("Area of the Squares using getArea()");
        System.out.println("Square 1:  " + sq1.getArea());
        System.out.println("Square 2:  " + sq2.getArea());

        // get the diagonal length of a square using getDiagonal
        System.out.println(" ");
        System.out.println("Diagonal length of the Squares using getDiagonal");
        System.out.println("Square 1: " + sq1.getDiagonalLength());
        System.out.println("Square 2: " + sq2.getDiagonalLength());

        // get the circumradius of the square (the circle that fits inside the square)
        System.out.println(" ");
        System.out.println("Circumradius of the Squares using getCirumcircleRadius()");
        System.out.println("Square 1: " + sq1.getCircumcircleRadius());
        System.out.println("Square 2: " + sq2.getCircumcircleRadius());
        System.out.println(" ");

        System.out.println("End of Test MySquare");


    }
}
