package ua.step.homework;

/**
 * Числа Фибона́ччи — это последовательность чисел в которой два первых числа
 * последовательности равны 0 и 1, а каждое последующее число равно сумме двух
 * предыдущих.
 *
 * Пример:
 *      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * Задание: Показать вывести в консоль все числа Фибона́ччи начиная с 0, но не более
 * 10.000.000 (36 чисел).
 *
 * @see <a href='https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8'>Числа Фибоначчи</a>
 */
public class Task01 {
    public static void main(String[] args) {
        // TODO: Здесь Ваш код. Числа друг от друга отделять пробелом

        int i = 0;
        final int LIMIT = 10_000_000;
        while (fibonacci(i)<=LIMIT)
        {
            System.out.print(fibonacci(i++)+" ");
        }

    }

    public static long fibonacci(int number)
    {
        if(number==0)
        {
            return 0;
        }
        if(number==1)
        {
            return 1;
        }
        return fibonacci(number-1)+fibonacci(number-2);
    }
}
