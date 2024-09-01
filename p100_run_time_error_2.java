package jDemos1;

public class p100_run_time_error_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a[] = {11,23,45,21,87};
			int i;
			
			for(i=0; i<7; i++)
			{
				System.out.println(" Array => " + a[i]);
			}

			
		}catch(Exception ex)
		{
			System.out.println("Error : " + ex.toString());
		}
	}

}
