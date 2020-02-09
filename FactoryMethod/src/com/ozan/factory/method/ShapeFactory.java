package com.ozan.factory.method;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}else if(shapeType.equals("Square")) {
			return new Square();
		}
		return null;
	}
}
