package jDemos1;

public class p44pos_neg_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {11, 5, 7, 20, 11, 55, 60, 11, 9, 14, 23, 21, -11, 6};
     
		int possum=0;
        int negsum=0;
        
        System.out.println("Pos numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i]>0) { 
                System.out.print(a[i] + " ");
                possum += a[i]; 
            }
        }
        System.out.println("\nSum of posnum numbers: " + possum);
        
        System.out.println("\nNeg numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i]<0) {
                System.out.print(a[i] + " ");
                negsum += a[i]; 
            }
        }
        System.out.println("\nSum of negsum numbers: " + negsum);
	}

}
