package ua.step.homework;

/**
 * Самовлюблённое число, или совершенный цифровой инвариант или число Армстронга
 * — натуральное число, которое равно сумме своих цифр, возведённых в степень,
 * равную количеству его цифр.
 *
 * Например, десятичное число 153 — число Армстронга, потому что 1^3 + 5^3 + 3^3 = 153.
 *
 * Показать на экране все числа Армстронга от 0, но не более 10.000.000 (23 числа) в одной строке через пробел.
 *
 * @see <a href='https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%BE_%D0%90%D1%80%D0%BC%D1%81%D1%82%D1%80%D0%BE%D0%BD%D0%B3%D0%B0'>Число Армстронга</a>
 */
public class Task03 {
    public static void main(String[] args) {
        // TODO: Здесь Ваш код. Числа друг от друга отделять пробелом
        int number = 2;
        int stop = 0;
        final int limit = 10_000_000;
        while (stop<=limit)
        {
            if(isArmstrong(number))
            {
                stop = number;
                System.out.print(number+" ");
            }
            number++;
        }
    }

    public static boolean isArmstrong(long number)
    {
        long original = number;
        int degree = digitsInNumber(number);
        int sum = 0;
        for(;number%10!=0 || number/10!=0 ; number/=10)
        {
            sum+=Math.pow(number%10,degree);
        }
        return (original==sum)?true:false;
    }

    public  static int digitsInNumber(long number)
    {
        int total = 0;
        if(number>=0)
        {
            if(number==0) total = 1;
            for(;number!=0;number/=10,total+=1);
        }
        else
        {
            System.out.println("Something went wrong");
        }
        return total;
    }
}
