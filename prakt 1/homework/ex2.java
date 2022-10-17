/*
 Вывести все простые числа от 1 до 1000
 */
public class ex2 {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(1); // Просто отдельно выведим один для упращения своей жизни
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0){
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(i);
            else b = true;
        }
    }
}
