package ua.step.homework;

/**
 * В американской армии считается несчастливым число 13, а в китайской — 4.
 * Перед совместными учениями с американской и китайской армией, штаб украинской
 * армии решил исключить номера боевой техники, содержащие числа 4 или 13
 * (например, 40123, 13373, 12345 или 61342), чтобы не смущать иностранных
 * коллег.
 * <p>
 * Задание: написать программу, которая определит сколько номеров придётся
 * исключить, если в распоряжении армии имеется 100 тыс. единиц боевой техники и
 * каждая боевая машина имеет номер от 00001 до 99999.
 */
public class Task06 {
    public static void main(String[] args) {
        // TODO: Здесь Ваш код. Вывести одно число - сколько номеров нужно исключить
        System.out.print(exlusionNumbers());
    }
    public static int exlusionNumbers()
    {
        int count = 0;
        int count2 = 0;
        for(int i = 1; i<99_999;i++)
        {

            if(i<10)
            {
                if(i==4)
                {
                    count++;
                }
            }
            else if(i>=10)
            {
                int number = i;
                int len = digitsInNumber(i);
                int index = len-1;
                int [] arr = new int[len] ;
                while(number!=0)
                {
                    arr[index--]=number%10;
                    number/=10;
                }

                for(int j = 0; j<arr.length;j++)
                {
                    if(arr[j]==4)
                    {
                        count++;
                        break;
                    }
                    if(j<arr.length-1)
                    {
                        if(arr[j]==1&&arr[j+1]==3)
                        {
                            count++;
                            break;
                        }
                    }
                }
            }
            count2++;
        }
        /*   System.out.print(count2+"s\n");*/
        return  count;
    }
    public static int digitsInNumber(int number)
    {
        int total = 0;
        if (number >= 0)
        {
            if (number == 0) total = 1;
            for (; number != 0; number /= 10, total += 1);
        }
        else
        {
            System.out.println("Something going wrong");
        }
        return total;
    }
}
