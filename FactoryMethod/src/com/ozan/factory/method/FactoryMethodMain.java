package com.ozan.factory.method;

public class FactoryMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ShapeFactory obj=new ShapeFactory();
        Shape circle=obj.getShape("Circle");
        Shape rectangle=obj.getShape("Rectangle");
        Shape square=obj.getShape("Square");
        
        circle.draw();
        rectangle.draw();
        square.draw();
	}

}
