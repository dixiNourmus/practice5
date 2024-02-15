import java.util.Scanner;
public class grahhh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        String trash = "";
        System.out.println("give me an int");
        if (scanner.hasNextInt()){
            num1 =scanner.nextInt();
            if (num1 > 0) {
                System.out.println("your number is positive");

            }
                else if (num1 < 0) {
                System.out.println("your number is negitive");
            }
            else {
                System.out.println("your number is 0");
            }

        }
        else {
            trash = scanner.nextLine();
            System.out.println("your input is trash " + trash);
        }


    }

}
