class Main
{
	public static void main(String[] args)
	{
        System.out.println(Method(2, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(Method(2.1, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9));

    }
    
    static int Method(int Coefficent, int ...n)
    {
        int sum = 0;
        for (int i:n)
        {
            sum += Coefficent * i;
        }
        return sum;
    }
    static double Method(double Coefficent, double ...n)
    {
        double sum = 0;
        for (double i:n)
        {
            sum += Coefficent * i;
        }
        return sum;
    }
}