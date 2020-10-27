class Main
{
	public static void main(String[] args)
	{
        Tasks tasks = new Tasks();
        System.out.println("Задача 1");
        tasks.Task1();
        System.out.println("Задача 2");
        tasks.Task2();
        System.out.println("Задача 3");
        tasks.Task3();
	}
}

class Tasks{
    java.util.Scanner in = new java.util.Scanner(System.in);
    
    public void Task1()
    {
        // Реализовать эпизод применения компьютера в книжном магазине:
        // компьютер запрашивает стоимость книг и сумму, внесенную покупателем,
        // если сдача не требуется, печатает на экране «спасибо»; если денег внесено больше, печатает «возьмите сдачу»
        // и указывает ее сумму; если денег недостаточно, печатает об этом сообщение и указывает размер недостающей суммы
        System.out.println("Введите стоимость книг и внесенную сумму:");
        System.out.print("Стоимость книг: ");
        double cost = Math.abs(in.nextDouble());
        System.out.print("Сумма: ");
        double sum = Math.abs(in.nextDouble());
        if (sum == cost)
        {
            System.out.println("Спасибо!");
        }
        if (sum < cost)
        {
            System.out.println("Недостаточно денег, доплатите: " + (cost - sum));
        }
        if (sum > cost)
        {
            System.out.println("Возьмите сдачу: " + (sum - cost));
        }
    }

    public void Task2()
    {
        // Найти для указанных последовательностей наименьший номер,
        // для которого выполняется условие M и вывести на экран этот номер и все элементы аi, (где i = 1 , 2,…, n):
        System.out.println("Введите число до которого будет выполняться условие, число меньше 1 и больше 0:");
        double num = in.nextDouble();
        if(num > 0 && num < 1)
        {
            double a = 0;
            for (int i = 1; ; i++)
            {
                a = 1 / Math.pow((i + 1), 2);
                if (a > num)
                {
                    System.out.println("Элемент a[" + i + "] = " + a);
                } 
                if (a < num)
                {
                    System.out.println("Номер последовательности: " + (i - 1));
                    break;
                } 
            
            }
        }
        else Task2();
    }

    public void Task3()
    {
        // Дана последовательность целых чисел. Найти количество различных чисел в этой последовательности.
        System.out.println("Введите количество чисел в массиве: ");
        int size = Math.abs(in.nextInt());
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++)
        {
            numbers[i] = (int)(Math.random() * (10 + 1));
        }

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("n[" + i + "] = " + numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i; j < numbers.length; j++)
            {
                if (numbers[i] > numbers[j])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            
        }

        int count = 1;

        for (int i = 0; i < numbers.length - 1; i++)
        {
            if (numbers[i] < numbers[i + 1]) count++;
        }
        System.out.println("количество различных чисел: " + count);

    }
}