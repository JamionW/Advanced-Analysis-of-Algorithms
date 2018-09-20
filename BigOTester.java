package bigOtesterPackage;

public class BigOTester {
	public static void main(String[] args) {
		int sum = 0;
		int n=20;
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=(i*i); j++) {
				if (j % i == 0) {
					for (int k = 1; k<=j; k++) {
						//System.out.println("i is " + i);
						//System.out.println("j is " + j);
						//System.out.println(sum);
						sum++;
					}
				}
			}
			
			System.out.println("For iteration " + i + ", there were " + sum + " operations.");

			sum = 0;
		}
	}
}
