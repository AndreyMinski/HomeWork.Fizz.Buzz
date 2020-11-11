/**Напишите программу, выводящую числа от 1 до заданного N, по одному в строке.
 * К числам, делящимся нацело на 3, нужно дописать "Fizz".
 * К числам, делящимся нацело на 5, нужно дописать "Buzz".
 * К числам, делящимся нацело и на 3 и на 5, нужно дописать "FizzBuzz".
 */
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 ");
        Scanner str = new Scanner(System.in);
        int num = str.nextInt();
        for (int a = 1; a <= num; a++) {
            if ((a % 3 == 0 & a % 5 !=0))  {
                System.out.println(a + " Fizz ");
            } else if ((a % 5 == 0 & a % 3 !=0)){
                System.out.println(a + " Buzz ");
            }else if ((a % 3 == 0 & a % 5 == 0)){
                System.out.println(a +  " FizzBuzz ");
            }
        }
    }

}
