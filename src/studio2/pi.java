package studio2;

public class pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int in = 0;
		int out = 0;
		
	for (int i = 0; i < 100000000; i++) {
		
		double x = Math.random();
		double y = Math.random();
		double d = Math.sqrt (x*x + y*y);
		
		
		if (d <= 1) {in++;}
		else {out++;}
	}
	System.out.println((double)in/(in+out)*4);
	
	}

}
