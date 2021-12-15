package ua.step.homework;

/**
 * Если перечислить все натуральные числа меньше 10, кратные 3 или 5, мы
 * получаем 3, 5, 6 и 9. Сумма этих кратных 23.
 *
 * Задание: Найдите сумму всех чисел, кратных 3 или 5 начиная с 0 и до 1000.
 */
public class Task09 {

    public static void main(String[] args) {
        // TODO: Здесь Ваш код.
        System.out.print(multiples3and5());
    }
    public static long multiples3and5()
    {
        long sum = 0;
        for(int i = 1; i<1000; i++)
        {
            if(i%3==0||i%5==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}
