
class FunWithShapes extends ShapeHandler{
	
	
	
	public static void main(String[] args) throws ShapeException {
		//Instantiate a FunWithShapes object
		//Invoke sumOverAreas() on that object.
		//Invoke sumOverPerimeters() on that object.
		//Print these two values to the terminal (see below).
		
		try {

			FunWithShapes AreaObject = new FunWithShapes();
			FunWithShapes PermObject = new FunWithShapes();
			
			double areaSum = AreaObject.sumOverAreas();
			double perimeterSum = PermObject.sumOverPerimeters();

			
			System.out.println(areaSum);
			System.out.println(perimeterSum);
			
		}
		catch(ShapeException e){
			
			System.out.println("ERROR: Shape Exception");
		}
		
		
		
	}
	
	//CONSTRUCTOR
		FunWithShapes() throws ShapeException {
			super();
			
		}
	

	@Override
	public void convertDescriptionsToShapes() {
		/**
		 * Given the shapeDescriptions, converts it to a vector
		 * of actual shape objects.
		 */
		for(int i = 0; i < shapeDescriptions.size(); i++)
		{
			if(shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.SQUARE)
			{
				Shape Square_Object = new Square(shapeDescriptions.get(i));
				shapes.add(Square_Object);
				
			}
			else if(shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.CIRCLE)
			{
				Shape Circle_Object = new Circle(shapeDescriptions.get(i));
				shapes.add(Circle_Object);
			}
			else if(shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.RECTANGLE)
			{
				Shape Rect_Object = new Rectangle(shapeDescriptions.get(i));
				shapes.add(Rect_Object);
			}
			else if(shapeDescriptions.get(i).getShapeType() == ShapeDescription.ShapeTypes.TRIANGLE)
			{
				Shape Triangle_Object = new Triangle(shapeDescriptions.get(i));
				shapes.add(Triangle_Object);
			}
		}
		
		
	}
	
	

	@Override
	public double sumOverAreas() {
		/**
		 * Computes the sum of the shapes' areas, where the shapes
		 * are from the shapes list
		 * @return the sum of the shapes' areas
		 */
		double SumOfAreas = 0;
		for(int i = 0; i < shapes.size(); i++){
			
			SumOfAreas += shapes.get(i).getArea();
		}
		
		return SumOfAreas;
	}

	
	@Override
	public double sumOverPerimeters() {
		/**
		 * Computes the sum of the shapes' perimeters, where the shapes
		 * are from the shapes list
		 * @return the sum of the shapes' perimeters
		 */
		
		double SumOfPerimeters = 0;
		for(int i = 0; i < shapes.size(); i++){
			
			SumOfPerimeters += shapes.get(i).getPerimeter();
		}
		
		return SumOfPerimeters;
		
	}
	
}
