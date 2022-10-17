/*
 Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;
public class ex1{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        int sum = n*(n+1)/2;
        int compos=1;
        for (int i =1; i<=n; i++){
            compos = compos * i;
        }
        System.out.printf("треугольного число %d = %d \n", n, sum);

        System.out.printf("%d! = %d \n", n, compos);
    }
}