class Main
{
	public static void main(String[] args)
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		 
		//1
		System.out.println("__1__");
		System.out.println("Enter A: ");
		double a = in.nextDouble();
		System.out.println("Enter B: ");
		double b = in.nextDouble();
		System.out.println("Enter C: ");
		double c = in.nextDouble();
		System.out.println("Enter D: ");
		double d = in.nextDouble();
		System.out.println("(a/c)*(b/d)-(a*b-c)/(c*d) = " + ((a/c)*(b/d)-(a*b-c)/(c*d)));
		System.out.println("Enter Z: ");
		a = in.nextInt();
		System.out.println("cos(sin(1/z)) = " + Math.pow(Math.cos(Math.sin(1/a)), 2));

		// //2
		System.out.println("__2__");
		System.out.println("R > r. Enter R: ");
		a = in.nextDouble();
		System.out.println("Enter r: ");
		b = in.nextDouble();
		if (a < b)
		{
			double temp = a;
			a = b;
			b = temp;
		}
		System.out.println("S = " + 3.14 * ((Math.pow(a, 2)) - (Math.pow(b, 2))));
		
	    // //3
		System.out.println("__3__");
		System.out.println("Enter year: ");
	    a = in.nextDouble();
	    if ((a / 4) % 1 == 0)
	        System.out.println("True");
	    else
			System.out.println("Flase");
			
	    // //4
		System.out.println("__4__");
		System.out.println("Enter x: ");
		a = in.nextDouble();
		System.out.println("Enter y: ");
		b = in.nextDouble();
	    if (b >= (a - 3) && b >= -1 * (a - 5) && b <= a + 3 && b <= -1 * a + 11)
	        System.out.println("True");
	    else
	        System.out.println("False");
	}
}
