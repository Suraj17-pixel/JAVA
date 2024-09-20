package jDemosAbs;


abstract class dadagiri{
	public abstract void add(int a,int b);
	public abstract void hi();
}

class jaymin extends dadagiri{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
			System.out.println("Jai = " + (a+b));
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	
}

class rahul{
	
}


public class j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		jaymin j1=new jaymin();
		j1.add(22, 33);
		j1.hi();
	}

}
