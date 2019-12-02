import java.util.Vector;

public class Rectangle extends Shape{

	private Vector<Double> sides;

	
	public Rectangle(ShapeDescription description) {
		super(description);
		
		ShapeDescription.ShapeTypes shapeType = description.getShapeType();
		sides = description.getDoubles();
	}
	
	
	@Override
	public double getArea() {
		double SideOne = sides.get(0);
		double SideTwo = sides.get(1);
		
		return SideOne * SideTwo;
	}

	@Override
	public double getPerimeter() {
		double SideOne = sides.get(0);
		double SideTwo = sides.get(1);
		
		return 2 * (SideOne + SideTwo);
	}
}