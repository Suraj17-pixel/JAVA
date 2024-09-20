package jDemosAbs;

abstract class polygon
{
	public abstract void area(double h, double b);
}

class triangle extends polygon
{

	@Override
	public void area(double h, double b) {
		System.out.println("triangle = " + (h * b));
	}
	
}

class rectangle extends polygon
{

	@Override
	public void area(double h, double b) {
		
		System.out.println("rectangle = " + (h + b));
		
	}
	
}

public class j2_abstract_polygon {

	public static void main(String[] args) {
		
		triangle t1 = new triangle();
		rectangle r1= new rectangle();
		
		t1.area(100, 200);
		
		r1.area(100, 200);
		

	}

}
