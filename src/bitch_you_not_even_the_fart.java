import java.util.Scanner;

public class bitch_you_not_even_the_fart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intInput;
        double dblInput;
        String strInput;

        System.out.println("give me sumthing bbg");
            if (scanner.hasNextInt()){
                intInput = scanner.nextInt();
                System.out.println("you gave me an int " +intInput);
            }
            else if (scanner.hasNextDouble()) {
                dblInput = scanner.nextDouble();
                System.out.println("you gave me an double " +dblInput);
            }
            else  {
                strInput = scanner.nextLine();
                System.out.println("you gave me a string " +strInput);
            }


    }
}
