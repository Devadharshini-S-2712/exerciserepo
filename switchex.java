import java.util.Scanner;

public class switchex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the phy, math, chem marks:");
        int marks1 = scan.nextInt();
        int marks2 = scan.nextInt();
        int marks3 = scan.nextInt();

        int avg = (marks1 + marks2 + marks3) / 3; // divide by 3 because you input 3 subjects
        System.out.println("Average: " + avg);

        int grade = avg / 10; // convert average to grade band for switch

        switch(grade) {
            case 10:
            case 9:
            case 8:
                System.out.println("A grade");
                break;
            case 7:
                System.out.println("B grade");
                break;
            case 6:
                System.out.println("C grade");
                break;
            default:
                System.out.println("D grade");
        }

        scan.close();
    }
}

