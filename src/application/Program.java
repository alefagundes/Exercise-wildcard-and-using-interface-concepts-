package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Retangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		
		list.add(new Retangle(3.0, 2.0));
		list.add(new Circle(2.0));
		
		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(1.5));
		myCircle.add(new Circle(2.3));
		
		
		System.out.println("Total area: " + totalArea(list));
		System.out.println("Total area: " + totalArea(myCircle));

	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s: list) {
			sum += s.area();
		}
		return sum;
	}

}
