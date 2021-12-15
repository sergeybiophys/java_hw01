package ua.step.homework;

import java.util.Scanner;

/**
 * Напишите программу, которая будет проверять является ли число введённое с
 * клавиатуры палиндромом (одинаково читающееся в обоих направлениях). Например
 * 123454321 или 221122 — палиндром. Не использовать строки. Если число
 * полиндром программа должна вывести Yes иначе No
 */
public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        boolean isInt = scanner.hasNextInt();
        int value = scanner.nextInt();
        // TODO: Здесь Ваш код.
        // Необходимо вывести Yes - если введенное число палиндром
        //                    No  - если введенное число НЕ палиндром
        if(isPalindrome(value))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
        scanner.close();
    }

    public static boolean isPalindrome(int value)
    {
        int length = digitsInNumber(value);
        int i = length-1;
        int [] arr = new int[length] ;
        while(value!=0)
        {
            arr[i--]=value%10;
            value/=10;
        }
        for(int j = 0; j < length/2; j++)
        {
            if(arr[j] != arr[length-j-1])
            {
                return false;
            }
        }
        return true;
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
            System.out.println("Something went wrong");
        }
        return total;
    }
}
