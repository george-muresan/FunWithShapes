import java.util.Vector;

public class Square extends Shape{

	private Vector<Double> side;
	

	public Square(ShapeDescription description) {
		super(description);
		
		ShapeDescription.ShapeTypes shapeType = description.getShapeType();
		side = description.getDoubles();
	}
	
	
	@Override
	public double getArea() {
		double Side = side.get(0);
		
		return Side * Side;
	}

	@Override
	public double getPerimeter() {
		double Side = side.get(0);
		
		return 4 * Side;
	}
}