
public class Matrix22Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrix22 m1 = new Matrix22(1, 2, 3, 4);
		double[][] m2arr = {{3, 6}, {4, 7}};
		Matrix22 m2 = new Matrix22(m2arr);
				
		
		System.out.println("m1");
		m1.print();
		System.out.println("m2");
		m2.print();
		
		System.out.println("changing the array argument for m2");
		m2arr[0][0] = -123;
		System.out.println("m2");
		m2.print();
		
		System.out.printf("m1 trace: %f\n", m1.trace());
		System.out.printf("m2 trace: %f\n", m2.trace());
		
		System.out.printf("m1 discriminant: %f\n", m1.discriminant());
		System.out.printf("m2 discriminant: %f\n", m2.discriminant());
		
		// 4
		double[][] arr = m1.asArray();
		System.out.print("m1.asArray(): ");
		for (double[] row: arr) {
			for (double x: row) {
				System.out.print(x + " ");
			}
		}
		
		arr[0][0] = 1;
		arr[0][1] = -51;
		arr[1][0] = 15;
		arr[1][1] = 22;
		System.out.print("\nmodified the array: ");
		for (double[] row: arr) {
			for (double x: row) {
				System.out.print(x + " ");
			}
		}
		
		System.out.println("m1");
		m1.print();
		
		System.out.printf("m1 to string: %s\n", m1);
		
		System.out.println("m1.add(m2):");
		Matrix22 w = m1.add(m2);
		w.print();
		System.out.println("m1.mul(m2):");
		Matrix22 v = m1.mul(m2);
		v.print();
		
		Matrix22 t = new Matrix22(0.8, 0.3, 0.2, 0.7);
		System.out.println("t.pow(3)");
		t.pow(3).print();	

		System.out.println("identity rotation matrix");
		new Rotation(0).print();
		
		System.out.println("pi/2 rotation matrix");
		new Rotation(Math.PI / 2).print();
		
		Rotation r45 = new Rotation(Math.PI / 4);
		System.out.println("pi/4 rotation matrix");
		r45.print();
		System.out.println(r45.alpha);
		
		System.out.println("its GetAngle()");
		
		
		System.out.println("fibooo!");
		for (int j = 0; j < 20; j++) {
			System.out.printf("fibo %d = %d\n", j, fibo(j));			
		}
		

	}
	
	static int fibo(int n) {
		if (n == 0)
			return 0;
		
		Matrix22 gen = new Matrix22(1, 1, 1, 0);		
		
		return (int) Math.round(gen.pow(n).asArray()[1][0]);
	}

}
