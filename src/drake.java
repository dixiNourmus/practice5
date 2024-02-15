import java.util.Scanner;
public class drake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{
            double temp = 0;
            String trash = "";
            System.out.println("whats the temp");
            if (scanner.hasNextDouble()) {
                temp = scanner.nextDouble();
                if (temp >= 100){
                    System.out.println("its turning to gas!");
                }
                else if (temp < 100 && temp > 32){
                    System.out.println("its liquid!");
                }
                else {
                    System.out.println("its solid!!!");
                }
            }
            else {
                trash = scanner.nextLine();
                System.out.println("your input is trash "+trash);
            }
        }


    }
}
