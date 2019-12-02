import java.util.Vector;

public class Triangle extends Shape{

	private Vector<Double> sides;

	
	public Triangle(ShapeDescription description) {
		super(description);
		
		ShapeDescription.ShapeTypes shapeType = description.getShapeType();
		sides = description.getDoubles();
	}
	
	
	@Override
	public double getArea() {
		double SideOne = sides.get(0);
		double SideTwo = sides.get(1);
		double SideThree = sides.get(2);
		
		double s = (SideOne + SideTwo + SideThree) / 2;
		 
		return Math.sqrt(s * (s-SideOne) * (s-SideTwo) * (s-SideThree) );
	}

	@Override
	public double getPerimeter() {
		double SideOne = sides.get(0);
		double SideTwo = sides.get(1);
		double SideThree = sides.get(2);
		
		return SideOne + SideTwo + SideThree;
	}
}