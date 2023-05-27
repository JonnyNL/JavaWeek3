public class TestMyCircle {

    public static void main(String[] args) {
        
        
        MyCircle c1 = new MyCircle();
        MyPoint centerC2 = new MyPoint(4, 6);
        MyCircle c2 = new MyCircle(centerC2, 4);
        MyCircle c3 = new MyCircle(1,1, 8);


        // Set center, since c1 is the only one without a defined center we will only set c1s center
        // Set center accepts a center MyPoint object as the center point for the circle
        MyPoint centerC1 = new MyPoint(6,9);
        c1.setCenter(centerC1);

        // Get center method to view circles center points
        System.out.println("Circle Center points using getCenter()");
        System.out.println("Center for C1: " + c1.getCenter());
        System.out.println("Center for C2: " + c2.getCenter());
        System.out.println("Center for C3: " + c3.getCenter());

        // set the radius
        c1.setRadius(2);
        c2.setRadius(4);
        c3.setRadius(6);

        // get radius method to view the radius of the circles
        System.out.println(" ");
        System.out.println("Radius for Circles using getRadius()");
        System.out.println("Radius for C1: " + c1.getRadius());
        System.out.println("Radius for C2: " + c2.getRadius());
        System.out.println("Radius for C3: " + c3.getRadius());

        // set the center point x coordinate value
        c1.setCenterX(2);
        c2.setCenterX(4);
        c3.setCenterX(6);

        // get the center x coordinate value
        System.out.println(" ");
        System.out.println("X Coordinate of Circle's Center using getX()");
        System.out.println("C1 : " + c1.getCenterX());
        System.out.println("C2 : " + c2.getCenterX());
        System.out.println("C3 : " + c3.getCenterX());

        // set the center point y coordinate value
        c1.setCenterY(4);
        c2.setCenterY(6);
        c3.setCenterY(8);

        // get the center y coordinate value
        System.out.println(" ");
        System.out.println("Y Coordinate of Circle's Center using getY()");
        System.out.println("C1 : " + c1.getCenterY());
        System.out.println("C2 : " + c2.getCenterY());
        System.out.println("C3 : " + c3.getCenterY());

        // set the center x and t coordinate valyue
        c1.setCenterXY(1, 2);
        c2.setCenterXY(3, 4);
        c3.setCenterXY(5, 6);

        // the getXY method allows us to access the center point of a circle as an array
        System.out.println(" ");
        System.out.println("Coordinates of Circle's Center using getCenterXY()");
        int[] centerXY1 = c1.getCenterXY();
        System.out.println("C1: (" + centerXY1[0] + ", " + centerXY1[1] + ")");
        int[] centerXY2 = c2.getCenterXY();
        System.out.println("C2: (" + centerXY2[0] + ", " + centerXY2[1] + ")");
        int[] centerXY3 = c3.getCenterXY();
        System.out.println("C3: (" + centerXY3[0] + ", " + centerXY3[1] + ")");
        

        // print using toString
        System.out.println(" ");
        System.out.println("Circles displayed using toString()");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(" ");
        
        System.out.println("End of Test MyCircle");

    }   
    
}
