import java.util.Scanner;

public class  ifexercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks1, marks2, marks3;
        System.out.println("Enter marks for 3 subjects:");
        marks1 = scan.nextInt();
        marks2 = scan.nextInt();
        marks3 = scan.nextInt();

        int result = (marks1 + marks2 + marks3) / 3;
        System.out.println("Average: " + result);

        if(result >= 75) {
            System.out.println("A grade");
        } else if(result >= 65) {
            System.out.println("B grade");
        } else {
            System.out.println("C grade");
        }
    }
}
