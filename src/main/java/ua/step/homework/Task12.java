package ua.step.homework;

import java.util.Scanner;

/**
 * В первый день спортсмен пробежал x километров, а затем он каждый день
 * увеличивал пробег на 10% от предыдущего значения. По числу указаному с
 * клавиатуры y определите номер дня, на который пробег спортсмена составит не
 * менее y километров.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = 0f, y = 0f;
        int day = 0;
        System.out.print("Введите сколько километров пробежал спортсмен в первый день: ");
        if (scanner.hasNextFloat()) {
            x = scanner.nextFloat();
        }
        System.out.print("Введите сколько километров спортсмен должен пробежать: ");
        if(scanner.hasNextFloat()) {
            y = scanner.nextFloat();
        }

        // TODO: Здесь Ваш код
        day = days(x,y);
        System.out.print(day);

        scanner.close();
    }

    public static int days(float x, float y)
    {
        int count = 0;

        while (y>0)
        {
            if(count==0)
            {
                y-=x;
                if(y<=0)
                {
                    return  count;
                }
                //x+=(x*0.1);
            }
            else
            {
                y-=x*0.1;
                if(y<=0)
                {
                    return  count;
                }
                x+=(x*0.1);
            }
            count++;
        }
        return count;
    }
}
