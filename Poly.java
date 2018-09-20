package polynomialPackage;

public class Poly {
	private double q = 0.0;
	
	public void poly(double x, int n, double[] a) {
		// poly(x, n, a) = a[0] + a[1] * x + a[2] *x^2 + ... + a[n]*x^n
		for (int i = 0; i < n; i++)
			q = ((i + a[i]) * Math.pow(x,i));
		
		System.out.println(q);
	}
}
