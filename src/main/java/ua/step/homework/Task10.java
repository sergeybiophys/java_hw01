package ua.step.homework;

/**
 * 2520 наименьшее число, которое можно разделить на каждое из чисел от 1 до 10
 * без остатка.
 *
 * Задание: Написать программу которая расчитывеет наименьшее положительное
 * число, которое делится без остатка на все числа от 1 до 20?
 */
public class Task10 {

    public static void main(String[] args) {
        // TODO: Здесь Ваш код.
        long result = leastCommonMultiple();
        System.out.print(result);
    }

    public static long gcd(long a, long b)//greatest common divisor
    {
        return (b==0)?a:gcd(b,a%b);
    }

    public static long lcm(long a, long b)//Least common multiple
    {
        return Math.abs(a*b)/gcd(a,b);
    }
    public static long leastCommonMultiple()
    {
        long commonMultiple = 1;
        int [] items = new int[] {1,2,3,4,5,6,7,8,9,10,
                                  11,12,13,14,15,16,17,
                                              18,19,20};
        for(int item: items)
        {
            commonMultiple = lcm(commonMultiple,item);
        }
        return commonMultiple;
    }
}