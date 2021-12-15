package ua.step.homework;

/**
 * Задание: Напишите программу, которая выводит на экран числа от 1 до 1000. При этом
 * вместо чисел, кратных трём, программа должна выводить слово fizz, а вместо
 * чисел, кратных пяти — слово buzz. Если число кратно пятнадцати, то программа
 * должна выводить вместо числа слово hiss.
 */
public class Task11 {
    public static void main(String[] args) {
        // TODO: Здесь Ваш код. Выводите числа и слова через пробел
        funnyFunction();
    }

    public static void funnyFunction()
    {
        for(int i = 1; i<1000;i++)
        {
            if(i%3==0&&i%5!=0)
            {
                System.out.print("fizz"+" ");
            }
            else if(i%5==0&&i%3!=0)
            {
                System.out.print("buzz"+" ");
            }
            else if(i%15==0)
            {
                System.out.print("hiss"+" ");
            }
            else
            {
                System.out.print(i+" ");
            }
        }
    }
}
