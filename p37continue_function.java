package jDemos1;

public class p37continue_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Example 1:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Iteration " + i);
        }
	}

}
