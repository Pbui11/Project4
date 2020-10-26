/*
 * Class: CMSC201 
 * Instructor: Ashique Tanveer
 * Description: Define the Circle2D class and write a test program that creates a Circle2D object c1.
 * Display its area and perimeter, and displays the result of c1.contains(3, 3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new Circle2D(3, 5, 2.3)).
 * Due: 10/25/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Phuc Bui.
*/

public class TestCircle2D {
	public static void main(String[] args){
	    Circle2D c1 = new Circle2D(2, 2, 5.5);
	    System.out.println("Area is " + c1.getArea());
	    System.out.println("Perimeter is " + c1.getPerimeter());
	    System.out.println(c1.contains(3, 3));
	    System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
	    System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
