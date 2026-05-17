import java.util.Scanner;
class oddoreven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System . out. print("enter the number:");
        int number = sc .nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

    }
}