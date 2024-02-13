import java.util.Scanner;
public class qwack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double total = 0;
        String trash = "";
        System.out.println("give me a NUMBER");
        if (scanner.hasNextDouble()){
            num1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("give me another input");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                total = num1 * num2;
                System.out.println("your total is " +total);
            }
            else {
                trash = scanner.nextLine();
                System.out.println("that input is trash " +trash);
            }

        }
        else {
            trash = scanner.nextLine();
            System.out.println(" that input is trash " +trash);
        }


    }



}
