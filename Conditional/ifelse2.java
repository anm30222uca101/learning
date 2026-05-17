
import java.util.Scanner;

class ifelse2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a marks:");
        int marks = sc.nextInt();
        if (marks < 0) {

            System.out.println("invalid marks");
        }

        if (marks >= 90) {

            System.out.println("Grade A");

        } else if (marks >= 70) {

            System.out.println("Grade B");

        } else {
            
            System.out.println("Grade D");

        }

    }
}
