import java.util.Scanner;
public class switchex{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char day = scan.next().charAt(0); 
        switch(day){
            case 'M':
            System.out.println("Monday");
            break;
            case 'T':
                System.out.println("Tuesday");
                break;
            case 'W':
                System.out.println("Wednesday");
                break;
            case 'h':
                System.out.println("thursday");
                break;
            case 'F':
                System.out.println("Friday");
                break;
            default:
                System.out.println("enter the correct character");
        }
    }
}
