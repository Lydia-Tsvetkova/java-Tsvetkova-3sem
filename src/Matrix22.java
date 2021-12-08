import java.util.Arrays;
import java.util.Iterator;

public class Matrix22 {

	double[][] mat;
	
	public Matrix22(double i, double j, 
			double k, double l) {
		mat = new double[][] {{i, j}, {k, l}};
	}

	public Matrix22(double[][] is) {
		mat = new double[][] {{is[0][0], is[0][1]}, 
			{is[1][0], is[1][1]}};	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		for (double[] row : mat) {
			for (double x: row) {
				System.out.printf("%6.2f", x);
			}
			System.out.println();
		}
		
	}

	public double trace() {
		// TODO Auto-generated method stub
		return mat[0][0] + mat[1][1];
	}

	public double discriminant() {
		// TODO Auto-generated method stub
		return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
	}

	public double[][] asArray() {
		// TODO Auto-generated method stub
		return new double[][] {
			{mat[0][0], mat[0][1]}, 
			{mat[1][0], mat[1][1]}};
	}

	public Matrix22 add(Matrix22 m2) {
		Matrix22 res = new Matrix22(new double[][]{
			{mat[0][0] + m2.mat[0][0],
			 mat[0][1] + m2.mat[0][1]
			},
			{mat[1][0] + m2.mat[1][0],
				 mat[1][1] + m2.mat[1][1]
				}});
		return res;
	}

	public Matrix22 mul(Matrix22 m2) {
		double[][] a1 = asArray();
		double[][] a2 = m2.asArray();
		
		double[][] res = new double[2][2];
		
		for (int i = 0; i != 2; ++i) 
			for (int j = 0; j != 2; ++j)
				for (int k = 0; k != 2; ++k) {
					res[i][j] += a1[i][k] * a2[k][j];
				}
				
						
		return new Matrix22(res);
	}

	public Matrix22 pow(int n) {
		// TODO Auto-generated method stub
		Matrix22 orig = new Matrix22(this.asArray());
		Matrix22 res = new Matrix22(this.asArray());
		
		
		for (int i = 0; i != n - 1; ++i) {
			res = res.mul(orig);
		}
		
		return res;
	}

	@Override
	public String toString() {
		return String.format(
				"[%f %f][%f %f]", mat[0][0], mat[0][1],
				mat[1][0], mat[1][1]);		
	}
	
}
