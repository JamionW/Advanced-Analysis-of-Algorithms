package polynomialPackage;

public class Poly {
		public static void main(String[] args) {
		
		// change these
		final int x = 3;
		final int n = 5;
		final int[] a = {3,7,2,6,5};
		
		/* The problem you want to solve:
		 *
		 * poly(x, n, a) = a[0] + a[1] * x + a[2] *x^2 + ... + a[n]*x^n
		 */ 
		
		double q = 0.0;
		
		/* Don't do it this way! The Math.pow operation is too expensive, computationally:
		 * 		for (int i = 0; i < n; i++)
		 * 			q = ((i + a[i]) * Math.pow(x,i));
		 */
		
		// way less expensive to run!
		for (int i = n-1; i >= 0; i--) {
			q = q * x + a[i];
		}
		
		System.out.println(q);
	}
}
