import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int num = scanner.nextInt();
        System.out.print(num);
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num *= 3;
                num += 1;
            }
            System.out.printf(" %d", num);
        }
    }
}