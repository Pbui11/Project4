public class Circle2D {
	
	private double x, y;
	private double radius;
	
	
	public Circle2D(){
		x=0;
		y=0;
		radius=1;
	}
	
	public Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getRadius(){
		return radius;
	} 
	
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	public boolean contains(double x, double y){
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
	}
	
	public boolean contains(Circle2D circle){
		return contains(circle.x - circle.radius,circle.y)&&
				contains(circle.x + circle.radius, circle.y)&&
				contains(circle.x,circle.y + circle.radius);
		}
	
	public boolean overlaps(Circle2D circle){
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
		}
}
