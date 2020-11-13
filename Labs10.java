class Main
{
	public static void main(String[] args)
	{
		Tasks task = new Tasks();
	}
}

class Tasks{
	// В заданной действительной квадратной матрице порядка n найти сумму элементов строки,
	// в которой расположен элемент с наименьшим значением. (Предполагается, что такой элемент единственный.)
    java.util.Scanner in = new java.util.Scanner(System.in);
	int lowestNum;
	int Sum;
	boolean IsFirstInput = true;
	
	public Tasks(){
		System.out.print("Введите n: ");
		int n = GreaterZero(in.nextInt());
		int[][] nums = new int[n][n];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.printf("Введите число элемента[%d][%d] = ", i, j);
				nums[i][j] = CheckLowest();
			}
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (nums[i][j] == lowestNum)
				{
					for (int k = 0; k < n; k++)
					{
						Sum += nums[i][k];
					}
				}
			}
		}
		System.out.printf("Сумма строки с наименьшим элементом = %d", Sum);
	}

	private int GreaterZero(int input)
    {
        if (input < 0)
        {
            System.out.println("Число отрицательное, будет взят его модуль!");
            return Math.abs(input);
        }
        else return input;
	}
	private int CheckLowest()
	{
		int input = in.nextInt();
		if (IsFirstInput)
		{
			lowestNum = input;
			IsFirstInput = false;
			return input;
		} 
		if (lowestNum >= input)
        {
			if (lowestNum == input)
			{
				System.out.printf("Число не должно быть равным минимальному числу! Повторите ввод\n: ");
				return CheckLowest();
			}
			lowestNum = input;
			return input;
			
		}
		else return input;
	}
}
