import java.util.Vector;

public class Circle extends Shape{

	private Vector<Double> radius;
	
	final double pi = Math.PI;
	

	public Circle(ShapeDescription description) {
		super(description);
		
		ShapeDescription.ShapeTypes shapeType = description.getShapeType();
		radius = description.getDoubles();
	}
	
	
	@Override
	public double getArea() {
		double RadiusAns = radius.get(0);
		return pi * RadiusAns * RadiusAns;
	}

	@Override
	public double getPerimeter() {
		double RadiusAns = radius.get(0);
		return 2 * pi * RadiusAns;
	}
	
}