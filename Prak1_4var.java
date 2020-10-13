class Main
{
	public static void main(String[] args)
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		 
		//1
		System.out.println("__1__");
		System.out.println("Enter A: ");
		int a = in.nextInt();
		System.out.println("Enter B: ");
		int b = in.nextInt();
		System.out.println("Enter C: ");
		int c = in.nextInt();
		System.out.println("Enter D: ");
		int d = in.nextInt();
		System.out.println("Enter Z: ");
		a = in.nextInt();
		System.out.println("(a/c)*(b/d)-(a*b-c)/(c*d) = " + ((a/c)*(b/d)-(a*b-c)/(c*d)));
		System.out.println("cos(sin(1/z)) = " + Math.cos(Math.sin(1/a)));

		//2
		System.out.println("__2__");
		System.out.println("R > r. Enter R: ");
		a = in.nextInt();
		System.out.println("Enter r: ");
		b = in.nextInt();
		if (a < b)
		{
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println("S = " + 3.14 * ((Math.pow(a, 2)) - (Math.pow(b, 2))));
		
	    //3
		System.out.println("__3__");
		System.out.println("Enter year: ");
	    double year = in.nextDouble();
	    if ((year / 4) % 1 == 0)
	        System.out.println("True");
	    else
			System.out.println("Flase");
			
	    //4
		System.out.println("__4__");
		System.out.println("Enter x: ");
		a = in.nextInt();
		System.out.println("Enter y: ");
		b = in.nextInt();
	    if (b >= (a - 3) && b >= -1 * (a - 5) && b <= a + 3 && b <= -1 * a + 11)
	        System.out.println("True");
	    else
	        System.out.println("False");
	}
}
