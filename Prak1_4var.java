public class Main
{
	public static void main(String[] args) {
		//1
		System.out.println("__1__");
		int a = 8;
		int b = 7;
		int c = 2;
		int d = 3;
		int z = 5;
		double Answer = ((a/c)*(b/d)-(a*b-c)/(c*d));
		System.out.println(Answer);
		Answer = Math.cos(Math.sin(1/z));
		System.out.println(Answer);
		//2
		System.out.println("__2__");
		int R = 10;
		int r = 7;
		Answer = 3.14 * ((Math.pow(R, 2)) - (Math.pow(r, 2)));
	    System.out.println(Answer);
	    //3
	    System.out.println("__3__");
	    double year = 2021;
	    if ((year / 4) % 1 == 0)
	        System.out.println("True");
	    else
	        System.out.println("Flase");
	    //4
	    System.out.println("__4__");
	    int x = 4;
	    int y = 1;
	    if (y >= (x - 3) && y >= -1 * (x - 5) && y <= x + 3 && y <= -1 * x + 11)
	        System.out.println("True");
	    else
	        System.out.println("False");
	}
}
